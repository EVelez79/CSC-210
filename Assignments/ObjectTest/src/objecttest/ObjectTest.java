package objecttest;

/**
 *
 * @author erick_000
 */
public class ObjectTest {

    static int i = 0;
    static Object[] records = new Object[5];

    public static void main(String[] args) {

        for (i = 0; i < records.length; i++) {
            records[i] = new Object();
        }
        student1();
    }

    public static void student1() {
        records[0].setName("Erick Velez");
        records[0].setDateOfBirth("7/9/1998");
        records[0].setAge(18);
        records[0].setYear("Freshman");
        records[0].setMajor("Computer Science");
        records[0].setGPA("4.0");
        System.out.println(records[0].toString());
    }

}
