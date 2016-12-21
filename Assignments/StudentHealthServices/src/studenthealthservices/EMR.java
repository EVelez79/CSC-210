package studenthealthservices;

/**
 *
 * @author Erick Velez
 */
public class EMR {
    /*
     Declare all data field with the private modifier
     */

    private String name;
    private String dateOfBirth;
    private String reasonForVisit;
    private double bodyTemperature;
    private double heartRate;
    private String diagnosis;
    private String prescribedMedicine;

    static int numOfPatients = 0; // declare and initialize object count

    EMR() { // Default constructor
        numOfPatients++;
    }

    EMR(String name, String dateOfBirth) { // initiatilze w/ only 2 data fields
        numOfPatients++;
    }

    /*
     Initialize with all data fields
     */
    EMR(String name, String dateOfBirth, String reasonForVisit, double bodyTemperature, double heartRate, String diagnosis, String perscribedMedicine) {
        numOfPatients++;
    }

    /*
     Getters & Setters
     */
    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    void setPrescribedMedicine(String perscribedMedicine) {
        this.prescribedMedicine = perscribedMedicine;
    }

    public String getPerscribedMedicine() {
        return prescribedMedicine;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }
    
    /*
    Boolean method for redFlags
    */
    boolean redFlags() {
        return (heartRate < 60 || heartRate > 100) || (bodyTemperature < 97.3 || bodyTemperature > 99.1);
    }
    
    @Override
    public String toString() {
        return "\n" + "Name                : " + name + "\nDate of birth       : " + dateOfBirth + "\nReason for visit    : " + reasonForVisit + "\nBody temperature    : " + bodyTemperature + "\nHeart rate          : " + heartRate + "\nDiagnosis           : " + diagnosis + "\nPrescribed Medicine : " + prescribedMedicine;
    }
}