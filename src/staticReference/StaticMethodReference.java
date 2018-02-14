package staticReference;

import java.util.function.BiFunction;

/**
 * Created by 212607214 on 8/16/2017.
 */

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodReference {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = staticReference.Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
