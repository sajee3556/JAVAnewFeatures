package Map;

import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map<Integer,String> valueMap = new HashMap<>();
        valueMap.put(1,"FIRST_SEGMENT");
        valueMap.put(2,"SECOND_SEGMENT");
        valueMap.put(3,"THIRD_SEGMENT");
        valueMap.put(4,"FORTH_SEGMENT");
        valueMap.put(5,"FIFTH_SEGMENT");
        valueMap.put(6,"SIXTH_SEGMENT");

        for(int seg=1;seg<=6;seg++){
            System.out.println("value: "+seg+" "+valueMap.get(seg));
        }
    }
}

