package objecttest;

/**
 *
 * @author erick_000
 */
public class Object {
    private String name;
    private int age;
    private String dateOfBirth;
    private String year;
    private String major;
    private String gpa;
    public static int count;
    
    Object() {
      count++;
    }
    
    Object(String name, String dateOfBirth, String year, String major, String gpa, int age) {
        count++;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return name;
    }
    
    void setAge (int age) {
        this.age = age;
    }
    
    int getAge() {
        return age;
    }
    
    void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    String getDateOfBirth(String dateOfBirth) {
        return dateOfBirth;
    }
    
    void setYear(String year) {
        this.year = year;
    }
    
    String getYear() {
        return year;
    }
    
    void setMajor(String major) {
        this.major = major;
    }
    
    String getMajor() {
        return major;
    }
    
    void setGPA(String gpa) {
        this.gpa = gpa;
    }
    
    String getGPA() {
        return gpa;
    }
    
    int getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        return "\n" + "Name                : " + name + "\nDate of birth       : " + dateOfBirth + "\nAge    : " + age + "\nYear    : " + year + "\nMajor          : " + major + "\nGPA           : " + gpa;
    }
}
