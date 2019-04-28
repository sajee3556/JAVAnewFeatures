package ValueMapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ObjectMappingDemo {
    public static void main(String[] args) {
        Map<String,String> valueMap = new HashMap<>();
        String str = String.valueOf("{\n" +
                "WW=null, \n" +
                "RECLAIMVALID=xx,\n" +
                "CYCLEID=null, \n" +
                "SEVENDAYS=true, \n" +
                " TYPE =P, \n" +
                "EVENT_DATETIME=2016-08-29 19:21:00.0}");
        Long ab = null;
        System.out.println("sad"+ab);
        ValueMapper valueMapper = new ValueMapper();
        MyObject myObject1 = valueMapper.SetValueMap(str);

        System.out.println(myObject1.getEventDatetime());
        System.out.println(myObject1.getType());
    }
}
