package asynchronuousProgramming;

/**
 * @author 212607214
 * @Date 2/11/2018
 */
public class AsynchronousPro implements Runnable {
    /*
    * The executor framework presented in the last chapter uses Runnable objects.
     * Unfortunately a Runnable cannot return a result to the caller.
     * return a computed result you can use java.util.concurrent.Callable.
      * The Callable object allows to return values after completion.
     */
    private final long countUntil;
    private String x;

    AsynchronousPro(long countUntil,String x) {
        this.countUntil = countUntil;
        this.x = x;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
            System.out.println("Sum of "+x+" "+sum);
        }
        System.out.println("Sum of "+x+" "+sum);
    }
}

