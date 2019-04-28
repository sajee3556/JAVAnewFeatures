package javaCryptography;

import javax.crypto.*;
import java.security.*;

public class MyLoginCredentials {
    private String userName;
    private byte[] password;
    byte[] decipheredText;
    private String email;
    Cipher cipher;
    KeyPair pair;

    public MyLoginCredentials() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        //Creating a Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");

        //Creating KeyPair generator object
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

        //Initializing the key pair generator
        keyPairGen.initialize(2048);

        //Generate the pair of keys
        pair = keyPairGen.generateKeyPair();

        //Creating a Cipher object
        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException {

       //Initializing the same cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());

        //Decrypting the text
        decipheredText = cipher.doFinal(password);
        System.out.println("decrypted: ");
        System.out.println(new String(decipheredText));
        return new String(decipheredText);
    }

    public void setPassword(String pass) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        //Initializing a Cipher object
        cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());

        //Add data to the cipher
        byte[] input = pass.getBytes();
        cipher.update(input);

        //encrypting the data
        password = cipher.doFinal();
        System.out.println("Encrypted: ");
        System.out.println(new String(password));

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
