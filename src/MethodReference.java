import java.util.ArrayList;
import java.util.List;

/**
 * Created by 212607214 on 8/16/2017.
 */
public class MethodReference {
    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}
