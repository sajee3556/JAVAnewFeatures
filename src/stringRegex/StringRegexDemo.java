package stringRegex;

/**
 * @author 212607214
 * @Date 2/14/2018
 */
public class StringRegexDemo {
    public static void main(String[] args) {

        String ae="-111232328";
        System.out.println(ae.matches("^[+-]?[0-9]{1,10}(?:\\.[0-9]{1,2})?$"));
        System.out.println("452.00".matches("^\\d+(\\.\\d+)?"));
        System.out.println("45.00".matches("^\\d{1,2}(\\.\\d{1,2})?")); //define the length of digits instead of + {1,length}
        System.out.println(isNumberWithCorrectDecimal("1234567890.0", 10, 2));
    }

    public static boolean isNumberWithCorrectLength(String string, int maxDigitsPriorToDecimal, int maxDigitAfterDecimal) {
        return string.matches("^[+-]?\\d{1," + maxDigitsPriorToDecimal + "}(?:\\.\\d{1," + maxDigitAfterDecimal + "})?$");
    }

    public static boolean isNumberWithCorrectDecimal(String string, int maxDigitsPriorToDecimal, int maxDigitAfterDecimal) {
        return string.matches("^\\d{1," + maxDigitsPriorToDecimal + "}+\\.\\d{1," + maxDigitAfterDecimal + "}$");
    }
}
