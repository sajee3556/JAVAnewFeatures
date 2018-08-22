import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class StringBufferTest {
    public static void main(String[] args) {
//        String[] assignedMarkGridRecords = new String[]{
//                "10","11","12","13"
//        };
//
//        String existingIds = assignedMarkGridRecords[0];
//        for (int i = 1; i < assignedMarkGridRecords.length; i++) {
//            existingIds += "," + assignedMarkGridRecords[i];
//        }
//
//        System.out.println("Concat: "+existingIds);
//
//        StringBuffer buf = new StringBuffer();
//        buf.append(assignedMarkGridRecords[0]);
//        for (int i = 1; i < assignedMarkGridRecords.length; i++) {
//            buf.append( "," );
//            buf.append(assignedMarkGridRecords[i]);
//        }
//
//        System.out.println("Buffer: "+buf.toString());

//        System.out.println();
//        String cetury = "20";
//        String year = "18";
//        String month1 = "02";
//        String month2 = "03";
//        Integer begin = 87;
//        Integer end = 487;
//        Date start = getDateAndTime(cetury,year,month1,end);
//        System.out.println("Start: "+start);
//        Date enddate = getDateAndTime(cetury,year,month2,begin);
//        System.out.println("end: "+enddate);
//        System.out.println("Difference: "+(enddate.getTime()-start.getTime())/(60*60 * 1000));
//
//        System.out.println();
//        String dateStr = "20170808" ;
//        try {
//            System.out.println("Date : "+dateStr+"fotmat: "+getDate(dateStr));
//            System.out.println("new Date: "+new Date(getDate(dateStr).getTime()));
//            Calendar calendarExp = Calendar.getInstance();
//            calendarExp.set(9999, 11, 31, 00, 00, 00);
//            System.out.println(calendarExp.getTime());
//            System.out.println(calendarExp.getTime());
//            System.out.println(calendarExp.getTime().getTime());
//            calendarExp.set(Calendar.MILLISECOND,0);
//            calendarExp.set(Calendar.YEAR,9999);
//            System.out.println(calendarExp.getTime());
//            Date rcv = calendarExp.getTime();
//            System.out.println(rcv.getTime());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println();
//        String value = null;
//        System.out.println(value.trim());
//        if (!"".equals(value.trim())) {
//           // sampleMethod.invoke(object, new Integer(value.trim()));
//        }

        Double mileAmount = -0.01;
        Double vbn = 0.0;
        System.out.println( Math.abs(mileAmount) > 0);

        Double rate = .0011;
        Double rate1 = 0.0113;

        System.out.println(Double.valueOf(rate).intValue());
        String[] spilt = Double.valueOf(rate).toString().split("E-");
        System.out.println(Double.valueOf(rate).doubleValue());

        System.out.println(isNumberWithCorrectDecimal
                (rate, 10, 4));
        System.out.println(isNumberWithCorrectDecimal
                (rate1, 10, 4));
        System.out.println();

        String equipmentInt1 = "TYZX";
        String equipmentInt2 = "TTER";
        System.out.println(isPrivateCar(equipmentInt1));
        System.out.println(isPrivateCar(equipmentInt2));
    }

    private static boolean isPrivateCar(String equipmentInt ) {
        return ((equipmentInt.length() == 4) &&
                ("X".equalsIgnoreCase(String.valueOf(equipmentInt.charAt(3)))));
    }

    private static java.util.Date normalizeDate(java.util.Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        date = calendar.getTime();

        return date;
    }

    static Date getDateAndTime(String century, String year, String month, Integer hour) {
        SimpleDateFormat dateAndTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Integer modifiedDay;
        Integer modifiedHours;
        Integer modifiedMinutes = 0;

        modifiedDay = (hour / 24) + 1; //add one day
        modifiedHours = hour % 24;

        String lastDayOfTheMonth = lastDateOfTheMonthStr(stringToDateWithFormat((month + "/" + century + year), "MM/yyyy"));
        if (modifiedDay > Integer.parseInt(lastDayOfTheMonth)) { //if modified day is greater than last day of the month
            modifiedDay -= 1;
            modifiedHours = 23;
            modifiedMinutes = 59;
        }

        String dateAndTime = century + year + "-" + month + "-" + modifiedDay + " " + modifiedHours + ":" + modifiedMinutes;
        try {
            return dateAndTimeFormat.parse(dateAndTime);
        } catch (ParseException e) {
            return null;
        }
    }

    public static Date getDate(String dateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        Date umlerLastUpdateDate = dateStr != null ? format.parse(dateStr) : null;
        return umlerLastUpdateDate;
    }

    public static String lastDateOfTheMonthStr(Timestamp timestamp) {
        Calendar c = Calendar.getInstance();
        c.setTime(timestamp);

        return String.valueOf(c.getActualMaximum(Calendar.DAY_OF_MONTH));

    }

    public static Timestamp stringToDateWithFormat(String str, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        try {
            Date date = dateFormat.parse(str);
            java.sql.Timestamp ts1 = new java.sql.Timestamp(date.getTime());
            return ts1;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public static boolean isNumberWithCorrectDecimal(Double val, int maxDigitsPriorToDecimal, int maxDigitAfterDecimal) {
        System.out.println("Valye: "+val);
        if(Double.valueOf(val).intValue() == 0 && String.valueOf(val).contains("E-")){
             String[] firstSet = Double.valueOf(val).toString().split("E-");
             int digitAfterDecimal = Integer.parseInt(firstSet[1]);
             if (digitAfterDecimal <= maxDigitAfterDecimal){
                 String[] secondSet = firstSet[0].split("\\.");
                 return (Integer.parseInt(secondSet[1]) > 0) ? false : true;
             }
            return false;
        }

        return String.valueOf(val).matches("^\\d{1," + maxDigitsPriorToDecimal + "}+\\.\\d{1," + maxDigitAfterDecimal + "}$");

    }
}
