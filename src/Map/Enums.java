package Map;

public abstract class Enums {

    public enum segmentEnums {
        STRUCTURAL_ERROR(1, "FIRST_SEGMENT"),
        GS_SEGMENT_ERROR(2, "SECOND_SEGMENT"),
        ST_SEGMENT_ERROR(3, "THIRD_SEGMENT"),
        CTC_SEGMENT_ERROR(4, "FORTH_SEGMENT"),
        CIC_CAR_INFORMATION_ERROR(5, "FIFTH_SEGMENT"),
        CHR_RATE_ERROR(6, "SIXTH_SEGMENT");

        public final int id;
        public final String segment;

        private segmentEnums(int id, String segment) {
            this.id = id;
            this.segment = segment;
        }

    }
}
