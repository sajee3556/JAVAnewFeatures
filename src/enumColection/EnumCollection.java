package enumColection;

import java.util.Arrays;
import java.util.List;

/**
 * @author 212607214
 * @Date 2/14/2018
 */
public class EnumCollection {
    /*
    * Directly define in Sing Values
     */
    public static final String NAME = "Enum";

    /*
    * This enum holds return int
    * */
    public enum DataElementLength {
        App(4),
        Bridge(10),
        Router(4),
        DLang(2);

        public final int length;

        DataElementLength(int i) {
            this.length = i;
        }
    }

    /*
    * CIC01 Specific character types
    *
    */
    public enum CIC01CharacterTypes {
        CIC_01_TYPE_1("A");

        public final String value;

        CIC01CharacterTypes(String value) {
            this.value = value;
        }
    }

    /*
    * CTC03CharacterTypes Specific character types
    * Get List
    */
    public enum CTC03CharacterTypes {
        CTC_03_TYPE_1(Arrays.asList("1", "A", "M")), //Detail
        CTC_03_TYPE_2(Arrays.asList("2", "9", "B", "N", "Y", "Z")),
        CTC_03_TYPE_3(Arrays.asList("1", "A", "M", "2", "B", "N")),
        CTC_03_TYPE_4(Arrays.asList("9", "Y", "Z")), //Summary/Total
        CTC_03_TYPE_5(Arrays.asList("2", "B", "N")); //Group Summary

        public final List<String> list;

        CTC03CharacterTypes(List<String> list) {
            this.list = list;
        }
    }

    /*
    * Key Value Pair
     */
    public enum WarningDescription {
        WARNING_DESC_INVALID_AAR_EQUIPMENT_TYPE("W001", "Invalid AAR Equipment Type."),
        WARNING_DESC_MISMATCH_AAR_EQUIPMENT_TYPE("W002", "Mismatch AAR Equipment Type/Car Type Group Code."),
        WARNING_DESC_INVALID_MILEAGE_SETTLEMENT_CODE("W003", "Invalid Mileage Settlement Code."),
        WARNING_DESC_INVALID_PENALTY_CODE("W004", "Invalid Penalty Code."),
        WARNING_DESC_UNEXPECTED_EQUIPMENT_INITIAL("W005", "Unexpected Equipment Initial."),
        WARNING_DESC_INVALID_STATE_CODE("W006", "Invalid State Code."),
        WARNING_DESC_INVALID_BEGIN_SPLC("W007", "Invalid Begin SPLC."),
        WARNING_DESC_INVALID_END_SPLC("W008", "Invalid End SPLC."),
        WARNING_DESC_INVALID_CYCLE_STATUS_CODE("W009", "Reclaim taken for non-empty time.");

        public final String warningCode;
        public final String warningDescription;

        WarningDescription(String warningCode, String warningDescription) {
            this.warningCode = warningCode;
            this.warningDescription = warningDescription;
        }
    }

    public static class Value {
        public static class TimeIndicator {
            public static final String H_HOURLY = "H - Hourly";
            public static final String D_Daily = "D - Daily";
            public static final String O_OTHER = "O - Other";
        }
    }
}
