package stringRegex;

/**
 * @author 212607214
 * @Date 2/14/2018
 */
public class StringRegexDemo {
    public static final String EXAMPLE_TEST = "This is my small example "+ "string which I'm going to " + "use for small pattern matching.";
    public static void main(String[] args) {

        String ae="-111232328";
        System.out.println(ae.matches("^[+-]?[0-9]{1,10}(?:\\.[0-9]{1,2})?$"));
        System.out.println("452.00".matches("^\\d+(\\.\\d+)?"));
        System.out.println("4.00".matches("^\\d{1,2}(\\.\\d{1,2})?")); //define the length of digits instead of + {1,length}
        System.out.println("4.00".matches("^\\d{2}(\\.\\d{2})?")); //fixed length
        System.out.println(isNumberWithCorrectDecimal("1234567890.0", 10, 2));

        System.out.println();
        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
        System.out.println(EXAMPLE_TEST.split("\\s+")[0]);
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
        System.out.println(EXAMPLE_TEST.replaceFirst("small", "big"));
        System.out.println(isLessThenThreeHundred("231"));
        System.out.println();

        System.out.println("000002".replaceFirst("^0+(?!$)", "").replaceAll("[*]", "%"));
        System.out.println();

    }

    public static boolean isNumberWithCorrectLength(String string, int maxDigitsPriorToDecimal, int maxDigitAfterDecimal) {
        return string.matches("^[+-]?\\d{1," + maxDigitsPriorToDecimal + "}(?:\\.\\d{1," + maxDigitAfterDecimal + "})?$");
    }

    public static boolean isNumberWithCorrectDecimal(String string, int maxDigitsPriorToDecimal, int maxDigitAfterDecimal) {
        return string.matches("^\\d{1," + maxDigitsPriorToDecimal + "}+\\.\\d{1," + maxDigitAfterDecimal + "}$");
    }

    // returns true if the string matches exactly "true"
    public static boolean isTrue(String s){
        return s.matches("true");
    }
    // returns true if the string matches exactly "true" or "True"
    public boolean isTrueVersion2(String s){
        return s.matches("[tT]rue");
    }

    // returns true if the string matches exactly "true" or "True"
    // or "yes" or "Yes"
    public boolean isTrueOrYes(String s){
        return s.matches("[tT]rue|[yY]es");
    }

    // returns true if the string contains exactly "true"
    public boolean containsTrue(String s){
        return s.matches(".*true.*");
    }


    // returns true if the string contains of three letters
    public boolean isThreeLetters(String s){
        return s.matches("[a-zA-Z]{3}");
        // simpler from for
//      return s.matches("[a-Z][a-Z][a-Z]");
    }



    // returns true if the string does not have a number at the beginning
    public boolean isNoNumberAtBeginning(String s){
        return s.matches("^[^\\d].*");
    }
    // returns true if the string contains a arbitrary number of characters except b
    public boolean isIntersection(String s){
        return s.matches("([\\w&&[^b]])*");
    }
    // returns true if the string contains a number less than 300
    public static boolean isLessThenThreeHundred(String s){
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }
}
