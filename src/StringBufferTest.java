/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class StringBufferTest {
    public static void main(String[] args) {
        String[] assignedMarkGridRecords = new String[]{
                "10","11","12","13"
        };

        String existingIds = assignedMarkGridRecords[0];
        for (int i = 1; i < assignedMarkGridRecords.length; i++) {
            existingIds += "," + assignedMarkGridRecords[i];
        }

        System.out.println("Concat: "+existingIds);

        StringBuffer buf = new StringBuffer();
        buf.append(assignedMarkGridRecords[0]);
        for (int i = 1; i < assignedMarkGridRecords.length; i++) {
            buf.append( "," );
            buf.append(assignedMarkGridRecords[i]);
        }

        System.out.println("Buffer: "+buf.toString());
    }
}
