package staticReference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 212607214 on 7/31/2017.
 */
public class JavaFeaturesDemo {
    public static void main(String[] args) {
        System.out.println("Panner soda: -");
        JavaFeaturesDemo javaFeaturesDemo=new JavaFeaturesDemo();

        MathOperation addition=(a,b)->a+b;
        MathOperation subtraction=(a,b)->a-b;
        MathOperation multiplication=(a,b)->a*b;
        MathOperation division=(a,b)->a/b;

        System.out.println("Addition: "+javaFeaturesDemo.operate(4,5,addition));
        System.out.println("Subtraction: "+javaFeaturesDemo.operate(7,9,subtraction));
        System.out.println("Multiplication: "+javaFeaturesDemo.operate(6,5,multiplication));
        System.out.println("Division: "+javaFeaturesDemo.operate(3,5,division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService1.sayMessage("Suresh "+ addition.operation(5,6));

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(n->System.out.println(n) );

        //outer class interface
        ShowMe showMine= s->javaFeaturesDemo.Print(s);
        showMine.showMe("Surya Saravanan");

    }

    interface MathOperation{
        double operation(double a, double b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private void Print(String me){
        System.out.println("you are "+me);
    }

    private double operate(int a, int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
