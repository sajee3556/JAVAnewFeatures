package javaCryptography;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.*;

public class JavaCryptographyDemo {
    public static void main(String[] args) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
        MyLoginCredentials myLoginCredentials = new MyLoginCredentials();
        myLoginCredentials.setUserName("Sajee");
        myLoginCredentials.setPassword("Sajee3556");
        myLoginCredentials.setEmail("sajee3556@gmail.com");

        System.out.println();
        System.out.println("Name: "+myLoginCredentials.getUserName());
        System.out.println("Email: "+myLoginCredentials.getEmail());
        System.out.println("Pass: "+myLoginCredentials.getPassword());
        System.out.println();

    }
}
