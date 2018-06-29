package test.exception;

import java.io.IOException;

/**
 * @author 212607214
 * @Date 3/12/2018
 */
public class TestCheckedException {
    public static void main(String args[]) {
        TestCheckedException obj = new TestCheckedException();
        obj.p();
        System.out.println("normal flow...");
    }

    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void n() throws Exception {
        m();
    }

    void m1() {
        try {
            throw new IOException("device error");//checked exception
        } catch (Exception e) {

        }
        //throw new IOException("device error");//checked exception
    }

    void n1() {
        m1();
    }

    void p() {
        try {
            n1();
            m();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
