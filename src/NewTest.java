import java.math.BigDecimal;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author 212607214
 * @Date 6/12/2018
 */
public class NewTest {
    public static void main(String[] args) {
//        System.out.println("value: "+Math.abs((0.071*75)));
//        System.out.println("value: "+(0.063*75));
//        System.out.println("Big Decimal:**************************");
//        BigDecimal bm1 = BigDecimal.valueOf(0.071);
//        BigDecimal bm2 = BigDecimal.valueOf(75);
//
//        MathContext mc = new MathContext(10); // 4 precision
//
//
//        // multiply bg1 with bg2 using mc
//        BigDecimal bg3 = bm1.multiply(bm2);
//        String str = "Multiplication Result is " +bg3;
//
//
//        bg3 = bg3.setScale(2, BigDecimal.ROUND_HALF_UP);
//        System.out.println("Round two: "+bg3);
//        System.out.println(" 3.325 ch 4: "+round(5.325,2));
//
//        System.out.println("Rounding Values "+(double) Math.pow(10, 3.25));
//        System.out.println("rounded : "+roundTwoDecimalPlaces(bg3));

        System.out.println("Rounded value: " +getRoundedMultiplyValue(12,0.069,2));

//        String trh = "9999-12-24 00:00:00.0";
//        String[] ret=  trh.split(" ");
//        System.out.println(trh.subSequence(0,10));
//
//        System.out.println(toNumber("32"));
//        System.out.println(toNumber("ds"));
//        System.out.println();
//
//        SortedSet<Integer> tre = new TreeSet<Integer>();
//        tre.add(12);
//        tre.add(22);
//        tre.add(2);
//        tre.add(32);
//        tre.add(18);
//        tre.add(6);
//        tre.add(19);
//        tre.add(5);
//        Object[] gridRecordSortedRecordArray = tre.toArray();
//
//        for (int recordIndex = 0; recordIndex < gridRecordSortedRecordArray.length; recordIndex++) {
//            System.out.println(((Integer) gridRecordSortedRecordArray[recordIndex] <= 2));
//        }
//        checKIntegers();

        String summary = "{ST_CURSOR=[{COL_1=Rows Inserted:  2979}]}";
        System.out.println(summary.split(":")[0]);
        System.out.println(summary.split(":")[1]);
        Integer insertRec = null;
        if(summary.contains("Rows Inserted") && summary.split(":").length >= 2) {
            String insertRecords= summary.split(":")[1].replaceAll("}]}","");
            insertRec = Integer.valueOf(insertRecords.replaceAll("\\s+",""));
        }
        System.out.println(insertRec);
    }

    private static void checKIntegers() {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = 200;
        Integer i4 = 200;
        String i5 = "-129";
        String i6 = "-129";
        String i15 = "-1128";
        String i16 = "-1128";
        Integer i115 = -1128;
        Integer i116 = -1128;
        System.out.println();
        System.out.println("== method: "+(i1 == i2));
        System.out.println("== method: "+(i3 == i4));
        System.out.println("== method: "+(i5 == i6));
        System.out.println("== method: "+(i115 == i116));
        System.out.println();
        System.out.println("equals method: "+(i1.equals(i2)));
        System.out.println("equals method: "+(i3.equals(i4)));
        System.out.println("equals method: "+(i5.equals(i6)));
        System.out.println();
        System.out.println("Int equals method: "+(Integer.valueOf(i1) == (Integer.valueOf(i2)))+" values:" +
                Integer.valueOf(i1)+" "+Integer.valueOf(i2));
        System.out.println("Int equals method: "+(Integer.valueOf(i3).equals(Integer.valueOf(i4)))+" values:" +
                Integer.valueOf(i3)+" "+Integer.valueOf(i4));
        System.out.println("Int equals method: "+(Integer.valueOf(i5) == (Integer.valueOf(i6)))+" values:" +
                Integer.valueOf(i5)+" "+Integer.valueOf(i6));
        System.out.println("Int equals method: "+(Integer.valueOf(i15).equals(Integer.valueOf(i16)))+" values:" +
                Integer.valueOf(i15)+" "+Integer.valueOf(i16));
        System.out.println();
    }


    public static Integer toNumber(String s) {

        if (s != null && s.trim().length() > 0) {
            return Integer.parseInt(s.trim());
        } else {
            return null;
        }

    }

    static double roundTwoDecimalPlaces(double value) {
        /*
        * Round to nearest Even value
        */
        //double newValue = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue(); //HALF_EVEN, HALF_UP, HALF_DOWN
        //double roundDouble = Double.valueOf(newValue);
        //return roundDouble;

        /*
        * 4 or below are rounded down and 5 or above are rounded up.
        */
        String result = String.format("%.2f", value);
        return Double.valueOf(result);
    }

    static double roundTwoDecimalPlaces(BigDecimal value) {
        /*
        * Round to nearest Even value
        */
        //double newValue = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue(); //HALF_EVEN, HALF_UP, HALF_DOWN
        //double roundDouble = Double.valueOf(newValue);
        //return roundDouble;

        /*
        * 4 or below are rounded down and 5 or above are rounded up.
        */
        String result = String.format("%.2f", value);
        return Double.valueOf(result);
    }

    public static double round(double rvalTemp, int rpl) {
        double rval = rvalTemp;
        double p = (double) Math.pow(10, rpl);
        rval = rval * p;
        double tmp = Math.round(rval);
        return (double) tmp / p;
    }

    /*
  * Parameters Data type in Double
  * return rounded value
  */
    public static double getRoundedValue(double parameter, int decimalPlaces) {
        BigDecimal num1 = BigDecimal.valueOf(parameter);

        /*
        * 4 or below are rounded down and
        * 5 or above are rounded up.
        */
        BigDecimal roundedValue = num1.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        return roundedValue.doubleValue();
    }

    public static double getRoundedMultiplyValue(double para1, double para2, int decimalPlaces) {
        BigDecimal num1 = BigDecimal.valueOf(para1);
        BigDecimal num2 = BigDecimal.valueOf(para2);
        BigDecimal multiplyValue = num1.multiply(num2);

        /*
        * 4 or below are rounded down and
        * 5 or above are rounded up.
        */
        BigDecimal roundedValue = multiplyValue.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        return roundedValue.doubleValue();
    }


}
