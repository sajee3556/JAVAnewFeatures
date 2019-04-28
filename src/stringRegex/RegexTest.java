package stringRegex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 212607214
 * @Date 4/26/2018
 */
public class RegexTest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String name= "hede";
        System.out.println("Tdrhede3556@".matches( "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,128}"));
        System.out.println("Ddrhedoer3556@heyde".matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])((?!"+name+").)*$"));

        String S1 = "Sajee";
        String S2 = "asddsAjEe1223121";
        String S3 = "adSaRjee127";

        System.out.println();
        System.out.println(Pattern.compile(Pattern.quote(S2), Pattern.CASE_INSENSITIVE).matcher(S1).find());
        System.out.println(Pattern.compile(Pattern.quote(S3), Pattern.CASE_INSENSITIVE).matcher(S1).find());
        System.out.println(S2.toLowerCase().contains(S1.toLowerCase()));
        System.out.println(S3.toLowerCase().contains(S1.toLowerCase()));
        System.out.println("value: "+S1.concat("%"));

        List<Long> existingUserRoleIds = new ArrayList<>();
        List<Long> newUserRoleIds = new ArrayList<>();
        newUserRoleIds.add(12l);
        newUserRoleIds.add(13l);
        System.out.println("Result: "+!existingUserRoleIds.contains(12l));

        generateMD5("Asajee1234%");

        System.out.println(" "+toCamelCase("sAjee van"));

        String str = "cCmd211cmd@$";
        System.out.println(isPatternMatch(str));
        System.out.println(passwordvalidation("aaZZa14y"));

    }

    public static void generateMD5(String message) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("Digest(in hex format):: " + sb.toString());

//        //convert the byte to hex format method 2
//        StringBuffer hexString = new StringBuffer();
//        for (int i=0;i<byteData.length;i++) {
//            String hex=Integer.toHexString(0xff & byteData[i]);
//            if(hex.length()==1) hexString.append('0');
//            hexString.append(hex);
//        }
//        System.out.println("Digest(in hex format):: " + hexString.toString());
    }

    public static String toCamelCase(final String init) {
        if (init==null)
            return null;

        final StringBuilder ret = new StringBuilder(init.length());

        for (final String word : init.split(" ")) {
            if (!word.isEmpty()) {
                ret.append(word.substring(0, 1).toUpperCase());
                ret.append(word.substring(1).toLowerCase());
            }
            if (!(ret.length()==init.length()))
                ret.append(" ");
        }

        return ret.toString();
    }

    public static boolean isPatternMatch(String str){
         String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])";
         Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
         Matcher matcher = pattern.matcher("cCmd211cmd@$");
         return matcher.matches();
    }

    public static Boolean passwordvalidation(String str) {
            String PASSWORD_PATTERN = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$@$!%*?&])(?=\\S+$).{8,}";
            return str.matches(PASSWORD_PATTERN);
    }
}
