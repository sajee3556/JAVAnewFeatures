import java.time.DateTimeException;

/**
 * @author 212607214
 * @Date 9/5/2018
 */
public enum MonthGwt {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    /**
     * Private cache of all the constants.
     */
    private static final MonthGwt[] ENUMS = MonthGwt.values();


    public static MonthGwt of(int month) {
        if (month < 1 || month > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + month);
        }
        return ENUMS[month - 1];
    }
}
