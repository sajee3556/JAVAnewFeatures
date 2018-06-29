package test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 212607214
 * @Date 1/19/2018
 */
public class JavaFeaturesDemo {
    public static void main(String[] args) {
        List<String> cycleStatusList = Arrays.asList("E","L","T");
        Integer a= 1234567891;
        System.out.println("values: "+!cycleStatusList.contains("ER")+" "+a.toString().length());

        String dateStart = "11/03/14 09:00:00";
        String dateStop = "11/03/15 08:00:00";

        //Custom date format
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        double value = 1.786;
        value =Double.parseDouble(new DecimalFormat("##.##").format(value));

        // Get msec from each, and subtract.
        double diff = d2.getTime() - d1.getTime();
        double diffSeconds = diff / 1000 % 60;
        double diffMinutes = diff / (60 * 1000) % 60;
        double diffHours = diff / (60 * 60 * 1000 );

        double val = 1.7850;
        val = val*100;
        val = Math.round(val);
        val = val /100;

        String result = String.format("%.2f", 1.785);
        double vds = new BigDecimal(1.775).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double frg = Double.valueOf(vds);
        double vds1 = new BigDecimal(-1.785).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        double frg1 = Double.valueOf(vds1);
        double vds11 = new BigDecimal(-1.775).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        double frg11 = Double.valueOf(vds11);

        System.out.println("Time difference: " + diff );
        System.out.println("Time in seconds: " + diffSeconds + " seconds."+frg);
        System.out.println("Time in minutes: " + diffMinutes + " minutes."+vds);
        System.out.println("Time in hours: " + diffHours + " hours."+value+val);
        System.out.println("Time in hours:11 " + diffHours + " hours."+vds1+frg1);
        System.out.println("Time in hours:12 " + diffHours + " hours."+vds11+frg11);
        String result1 = String.format("%.2f", 1.715);
        String result2 = String.format("%.2f", 1.725);

        System.out.println();
        System.out.println("result1: "+result1);
        System.out.println("result2: "+result2);
        System.out.println();

        double re1 = new BigDecimal(1.785).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double fr1 = Double.valueOf(re1);
        double re2 = new BigDecimal(1.775).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double fr2 = Double.valueOf(re2);

        System.out.println();
        System.out.println("result1 double: "+fr1+" "+re1);
        System.out.println("result2 double: "+fr2+" "+re2);
        System.out.println();

        System.out.println();
        System.out.println("result1 string: "+"C".contentEquals(String.valueOf('C'))+" klo ");
        System.out.println("result2 string: "+"C".contentEquals(String.valueOf('C')));
        System.out.println();

        System.out.println("411..1".matches("^\\d+(\\.\\d{1,2})?"));

    }

}
