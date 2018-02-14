package observableProgramming;

/**
 * @author 212607214
 * @Date 2/11/2018
 */
public class ObservableDemo {
    public static void main(String[] args) {
        ObservableValue ov = new ObservableValue(0);
        TextObserver to = new TextObserver(ov);
        ov.addObserver(to);

        ov.setValue(10);
        ov.setValue(123);
    }
}
