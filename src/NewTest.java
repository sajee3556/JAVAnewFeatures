import java.math.BigDecimal;
import java.math.MathContext;

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

        System.out.println("Rounded value: " +getRoundedValue(2.100,2));

        String trh = "9999-12-24 00:00:00.0";
        String[] ret=  trh.split(" ");
        System.out.println(trh.subSequence(0,10));

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
    public static double getRoundedValue(double parameter, int decimalPlaces){
        BigDecimal num1 = BigDecimal.valueOf(parameter);

        /*
        * 4 or below are rounded down and
        * 5 or above are rounded up.
        */
        BigDecimal roundedValue = num1.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        return roundedValue.doubleValue();
    }

}
