package lambdaExpressionAndStreams;

import java.util.Arrays;
import java.util.List;

/**
 * @author 212607214
 * @Date 1/5/2018
 */
public class StreamsDemo {
    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1adae", "a2aaser", "b1wqe", "c2qdsdw", "c1fdffe","c2etertete");

        myList
                .stream()
                .filter(s -> s.startsWith("c") && s.endsWith("e"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
