package test;

import java.sql.Timestamp;

/**
 * @author 212607214
 * @Date 2/27/2018
 */
public class test {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp.getTime());
    }
//    public static void main(String[] args) {
//        int x=10;
//        int y=x;
//        x=100;
//
//        String x1="Sawer";
//        String y1 = x1;
//        x1="yamer";
//        String u= x1.replaceAll("y","R");
//
//        System.out.println();
//        System.out.println(x1+" "+x+" "+u);
//        System.out.println(y1+" "+y);
//        System.out.println();
//
//        /*
//        * Point is mutable and string immutable
//         */
//        Point myPoint = new Point( 0, 0 );
//        System.out.println( myPoint );
//        myPoint.setLocation( 1.0, 0.0 );
//        System.out.println( myPoint );
//
//        String myString = new String( "old String" );
//        System.out.println( myString );
//        myString.replaceAll( "old", "new" );
//        System.out.println( myString );
//
//        System.out.println();
//        System.out.println("[010,04]0".toString().contains(","));
//        String value = "J";
//        String[] list = "[010,04]0".toString().replaceAll("[\\[|\\]]","").split(","); // replace multiple regex using |
//        System.out.println(list.length +" value"+list[0]);
//        System.out.println(list.length +" value"+list[1]);
//        System.out.println();
//        int i= list.length;
//        do{
//            System.out.print(list[i-1]);
//            System.out.print("&");
//            i--;
//        }while(i>0);
//        System.out.println();
//    }
}
