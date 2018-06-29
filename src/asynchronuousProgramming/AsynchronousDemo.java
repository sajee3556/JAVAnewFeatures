package asynchronuousProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 212607214
 * @Date 2/11/2018
 */
public class AsynchronousDemo {
    public static void main(String[] args) {
        /*
        * Immutable Demo
        * s1="Bye" : the previous s1 object's value doesn't change because s1 has String type and String type is an immutable type,
        * instead compiler create a new String object with "Bye" value and s1 referenced to it.s1 variable, refers to string in memory
        */
        String s1="Hi";
        String s2=s1;
        s1="Bye";

        System.out.println(s2); //Hi  (if String was mutable output would be: Bye)
        System.out.println(s1);
        System.out.println();

        AsynchronousPro sumX= new AsynchronousPro(10,"sumX");
        AsynchronousPro sumY = new AsynchronousPro(10, "SumY");
        Thread worker = new Thread(sumX);
        Thread worker2 = new Thread(sumY);
        worker.start();
        worker2.start();

        /*
        *
        */
        ExecutorService executor = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 50; i++) {
            Runnable workers = new AsynchronousPro(100L + i,"workers"+i);
            executor.execute(workers);
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
        System.out.println("Finished all threads");
    }
}
