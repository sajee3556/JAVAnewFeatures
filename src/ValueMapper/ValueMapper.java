package ValueMapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValueMapper {

    public MyObject SetValueMap(String objectValue){
        Map<String,String> valueMap = new HashMap<>();
        MyObject myObject = new MyObject();

        String cleanObject = objectValue.replaceAll("[{}]","");
        System.out.println(cleanObject);

        String[] values = cleanObject.split(",");
        System.out.println(values.length);
        for(String value: values){
            System.out.println(value);
            String[] keyPairValues = value.split("=");
            if(keyPairValues.length == 2)
                valueMap.put(keyPairValues[0].trim(),keyPairValues[1]);
        }

        Iterator it = valueMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            switch((String) pair.getKey()) {
                case MyOBjectParameters.WW :
                    myObject.setWw(((String) pair.getValue()).equals("null") ? null : Integer.valueOf((String) pair.getValue()));
                    break;

                case MyOBjectParameters.CYCLEID :
                    myObject.setCycleId((String.valueOf(pair.getValue()).equals("null")) ? null : Long.valueOf(String.valueOf(pair.getValue())));
                    break;

                case MyOBjectParameters.RECLAIMVALID :
                    myObject.setReclaimId((String) pair.getValue());

                case MyOBjectParameters.SEVENDAYS :
                    myObject.setSevenDays(Boolean.parseBoolean((String) pair.getValue()));
                    break;

                case MyOBjectParameters.TYPE :
                    myObject.setType((String) pair.getValue());
                    break;

                case MyOBjectParameters.EVENT_DATETIME :
                    myObject.setEventDatetime(DateFormatter.parseDate((String) pair.getValue()));
                    break;

                default :
            }
        }

        System.out.println(valueMap.get("SEVENDAYS"));
        return myObject;
    }
}
