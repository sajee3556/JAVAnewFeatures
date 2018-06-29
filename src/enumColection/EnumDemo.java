package enumColection;

/**
 * @author 212607214
 * @Date 2/14/2018
 */
public class EnumDemo {
    public static void main(String[] args) {

        System.out.println(EnumCollection.NAME+" Length: "+ EnumCollection.DataElementLength.Router.length);
        System.out.println();

        /*
        * Get String
        */
        System.out.println(EnumCollection.CIC01CharacterTypes.CIC_01_TYPE_1.value);
        EnumCollection.CTC03CharacterTypes.CTC_03_TYPE_1.list.stream().forEach(x-> System.out.println(x));
        System.out.println("GEt key: "+EnumCollection.WarningDescription.WARNING_DESC_INVALID_END_SPLC.warningCode);
        System.out.println("GEt Value: "+EnumCollection.WarningDescription.WARNING_DESC_INVALID_END_SPLC.warningDescription);

        System.out.println("Inner  Value: "+EnumCollection.Value.TimeIndicator.D_Daily);

    }
}
