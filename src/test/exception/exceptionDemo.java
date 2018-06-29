package test.exception;

/**
 * @author 212607214
 * @Date 3/9/2018
 */
public class exceptionDemo {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
        try {
            validate(13);                               //Throw the exception
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code 2...");
    }

    static void validate(int age) throws Exception{
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }
}
