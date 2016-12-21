package studenthealthservices;

/**
 *
 * @author Erick Velez
 */
public class StudentHealthServices {

    public static void main(String[] args) {
        System.out.println("Number of patients: " + EMR.numOfPatients);
        
        /*
        Create the 5 objects required for the print statement.
        */
        EMR EMR1 = new EMR();
        EMR EMR2 = new EMR();
        EMR EMR3 = new EMR();
        EMR EMR4 = new EMR();
        EMR EMR5 = new EMR();

        System.out.println("Number of patients: " + EMR.numOfPatients);
        System.out.println();
        
        /*
        Call the methods that set the object information and then prints in
        via the toString method.
        */
        patient1();
        System.out.println();

        patient2();
        System.out.println();
        
        patient3();
    }
    
    /*
    Each method is basically the same. Prints the patient #, creates a new
    patient object and then sets the information, then prints via the toString
    */
    public static void patient1() {
        System.out.println("**** Patient 1 ****");
        System.out.println();

        EMR patientOne = new EMR();

        patientOne.setName("Rosy Pen");
        patientOne.setDateOfBirth("January 5th, 1997");
        patientOne.setReasonForVisit("Hit and run");
        patientOne.setBodyTemperature(98.1);
        patientOne.setHeartRate(80);
        patientOne.setDiagnosis("Tis a flesh wound");
        patientOne.setPrescribedMedicine("Lots of bed rest");
        System.out.println(patientOne.toString());
    }

    public static void patient2() {
        System.out.println("**** Patient 2 ****");
        System.out.println();

        EMR patientTwo = new EMR();

        patientTwo.setName("Erick Velez");
        patientTwo.setDateOfBirth("July 9th, 1998");
        patientTwo.setReasonForVisit("Eye problems");
        patientTwo.setBodyTemperature(97.1);
        patientTwo.setHeartRate(90);
        patientTwo.setDiagnosis("The retina is detached");
        patientTwo.setPrescribedMedicine("Lots of eye drops");
        System.out.println(patientTwo.toString());
    }

    public static void patient3() {
        System.out.println("**** Patient 3 ****");
        System.out.println();

        EMR patientThree = new EMR();

        patientThree.setName("Hal Jordan");
        patientThree.setDateOfBirth("February 20");
        patientThree.setReasonForVisit("Yellow parasite embedded in soul");
        patientThree.setBodyTemperature(100.1);
        patientThree.setHeartRate(120);
        patientThree.setDiagnosis("Being possessed by Parallax.");
        patientThree.setPrescribedMedicine("Get possessed by the Spectre.");
        System.out.println(patientThree.toString());
    }
}
