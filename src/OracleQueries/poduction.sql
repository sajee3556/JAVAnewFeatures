create or replace FUNCTION F_deleteTrip_ICR
(
  carhireEventId IN NUMBER 
) RETURN NUMBER
  AS
    pragma autonomous_transaction;
    i_count NUMBER;
    count_CyCle_Id   NUMBER;
BEGIN
    select count(CARHIRE_CYCLE_ID) into count_CyCle_Id from cont.carhire_cycles aa  where  aa.carhire_trip_id = (select carhire_trip_id from Carhire_Trips  where RECEIPT_CARHIRE_EVENT_ID = carhireEventId); 
   if( count_CyCle_Id > 0)
    then 
    UPDATE carhire_cycles  SET CARHIRE_TRIP_ID = null WHERE CARHIRE_CYCLE_ID IN (
                    select CARHIRE_CYCLE_ID from cont.carhire_cycles aa  where  aa.carhire_trip_id = 
                (select carhire_trip_id from Carhire_Trips  where RECEIPT_CARHIRE_EVENT_ID = carhireEventId));                
    end if;
    DELETE FROM Carhire_Trips ct WHERE ct.carhire_trip_id = (select carhire_trip_id from Carhire_Trips  where RECEIPT_CARHIRE_EVENT_ID = carhireEventId);
    i_count:= 1;
    COMMIT;
    RETURN i_count;
  
END F_deleteTrip_ICR;



create or replace FUNCTION F_deleteTrip_ICH
(
  carhireEventId IN NUMBER 
) RETURN NUMBER
  AS
    pragma autonomous_transaction;
    i_count NUMBER;
    count_CyCle_Id   NUMBER;
    TRIGGER_CARHIRE_EVENT_ID   NUMBER;
    RECEIPT_CARHIRE_EVENT_ID   NUMBER;
    RECEIPT_DATETIME TIMESTAMP (6); 
BEGIN
    select TRIGGER_CARHIRE_EVENT_ID, RECEIPT_CARHIRE_EVENT_ID, RECEIPT_DATETIME into TRIGGER_CARHIRE_EVENT_ID, RECEIPT_CARHIRE_EVENT_ID, RECEIPT_DATETIME from Carhire_Trips  where DELIVERY_CARHIRE_EVENT_ID = carhireEventId;
    select count(CARHIRE_CYCLE_ID) into count_CyCle_Id from cont.carhire_cycles aa  where  aa.carhire_trip_id = (select carhire_trip_id from Carhire_Trips  where DELIVERY_CARHIRE_EVENT_ID = carhireEventId); 
   if( TRIGGER_CARHIRE_EVENT_ID = carhireEventId)
    then 
        if(RECEIPT_CARHIRE_EVENT_ID is not NULL) 
            then UPDATE CARHIRE_TRIPS  SET TRIGGER_CARHIRE_EVENT_ID = RECEIPT_CARHIRE_EVENT_ID,TRIGGER_DATETIME = RECEIPT_DATETIME, TRIGGER_EVENT_TYPE_CD = 'ICR'
                    WHERE CARHIRE_TRIP_ID =(select CARHIRE_TRIP_ID from Carhire_Trips  where DELIVERY_CARHIRE_EVENT_ID = carhireEventId);
        else 
            if(count_CyCle_Id > 0) then 
                    UPDATE carhire_cycles  SET CARHIRE_TRIP_ID = null WHERE CARHIRE_CYCLE_ID IN (
                    select CARHIRE_CYCLE_ID from cont.carhire_cycles aa  where  aa.carhire_trip_id = 
                     (select carhire_trip_id from Carhire_Trips  where DELIVERY_CARHIRE_EVENT_ID = carhireEventId));
            end if;
            DELETE FROM Carhire_Trips ct WHERE ct.carhire_trip_id = (select carhire_trip_id from Carhire_Trips  where DELIVERY_CARHIRE_EVENT_ID = carhireEventId);
        end if;
    else UPDATE CARHIRE_TRIPS  SET DELIVERY_DATETIME = null,DELIVERY_CARHIRE_EVENT_ID = null,DELIVERY_PERIOD = null, HOURS = null
            WHERE CARHIRE_TRIP_ID =(select CARHIRE_TRIP_ID from Carhire_Trips  where DELIVERY_CARHIRE_EVENT_ID = carhireEventId);
    end if;
    i_count:= 1;
    COMMIT;
    RETURN i_count;
  
END F_deleteTrip_ICH;


create or replace FUNCTION F_deleteTrip_OH
(
  carhireEventId IN NUMBER 
) RETURN NUMBER
  AS
    pragma autonomous_transaction;
    i_count NUMBER;
    count_CyCle_Id   NUMBER;
    TRIGGER_CARHIRE_EVENT_ID   NUMBER;
    RECEIPT_CARHIRE_EVENT_ID   NUMBER;
    DELIVERY_CARHIRE_EVENT_ID  NUMBER; 
    RECEIPT_DATETIME TIMESTAMP (6); 
    DELIVERY_DATETIME TIMESTAMP (6); 
BEGIN
    select TRIGGER_CARHIRE_EVENT_ID, RECEIPT_CARHIRE_EVENT_ID, RECEIPT_DATETIME, DELIVERY_CARHIRE_EVENT_ID, DELIVERY_DATETIME into TRIGGER_CARHIRE_EVENT_ID, RECEIPT_CARHIRE_EVENT_ID, RECEIPT_DATETIME, DELIVERY_CARHIRE_EVENT_ID, DELIVERY_DATETIME from Carhire_Trips  where TRIGGER_CARHIRE_EVENT_ID = carhireEventId;
    select count(CARHIRE_CYCLE_ID) into count_CyCle_Id from cont.carhire_cycles aa  where  aa.carhire_trip_id = (select carhire_trip_id from Carhire_Trips  where TRIGGER_CARHIRE_EVENT_ID = carhireEventId); 
       if(RECEIPT_CARHIRE_EVENT_ID is NULL AND DELIVERY_CARHIRE_EVENT_ID is NULL) 
            then 
                if(count_CyCle_Id > 0) then  
                    UPDATE carhire_cycles  SET CARHIRE_TRIP_ID = null WHERE CARHIRE_CYCLE_ID IN (
                    select CARHIRE_CYCLE_ID from cont.carhire_cycles aa  where  aa.carhire_trip_id = 
                     (select carhire_trip_id from Carhire_Trips  where TRIGGER_CARHIRE_EVENT_ID = carhireEventId));
                end if;
                 DELETE FROM Carhire_Trips ct WHERE ct.carhire_trip_id = (select carhire_trip_id from Carhire_Trips  where TRIGGER_CARHIRE_EVENT_ID = carhireEventId);  
       elsif(RECEIPT_CARHIRE_EVENT_ID is not NULL) then
                UPDATE CARHIRE_TRIPS  SET TRIGGER_DATETIME = RECEIPT_DATETIME,TRIGGER_CARHIRE_EVENT_ID = RECEIPT_CARHIRE_EVENT_ID,TRIGGER_EVENT_TYPE_CD = 'ICR'
                        WHERE CARHIRE_TRIP_ID =(select CARHIRE_TRIP_ID from Carhire_Trips  where TRIGGER_CARHIRE_EVENT_ID = carhireEventId);
       else UPDATE CARHIRE_TRIPS  SET TRIGGER_DATETIME = DELIVERY_DATETIME,TRIGGER_CARHIRE_EVENT_ID = DELIVERY_CARHIRE_EVENT_ID,TRIGGER_EVENT_TYPE_CD = 'ICH'
            WHERE CARHIRE_TRIP_ID =(select CARHIRE_TRIP_ID from Carhire_Trips  where TRIGGER_CARHIRE_EVENT_ID = carhireEventId);
       end if;        
    i_count:= 1;
    COMMIT;
    RETURN i_count;
  
END F_deleteTrip_OH;























****************************************************************************************************************************************************************************************************

CREATE OR REPLACE
  FUNCTION F_Delete_Carhire_Trips (
      carhireEventId IN NUMBER)
    RETURN NUMBER
  AS
    pragma autonomous_transaction;
    i_count NUMBER;
  BEGIN
    DELETE FROM Carhire_Trips ct WHERE ct.carhire_trip_id = (select carhire_trip_id from Carhire_Trips  where RECEIPT_CARHIRE_EVENT_ID = carhireEventId);
    i_count:=sql%rowcount;
    COMMIT;
    RETURN i_count;
  END;