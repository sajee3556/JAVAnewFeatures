package staticReference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 212607214 on 8/16/2017.
 * we can use references to objects, either by creating new objects:
 */
public class MethodReference {
    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        /*
        We know that we can use lambda expressions instead of using an anonymous class.
         But sometimes, the lambda expression is really just a call to some method
         */

        names.forEach(System.out::println); //names.forEach(s->System.out.println(s));

        // Referring static method
        Sayable sayable = MethodReference::saySomething;
        // Calling interface method
        sayable.say("sajee", "kanna");
    }

    public static void saySomething(String m, String m2) {
        System.out.println("Hi. Method Reference: " + m + " " + m2);
    }
}
interface Sayable {
    void say(String m1, String m2);
}
