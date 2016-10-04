/**
 * Erick Velez
 * 9/7/2016
 * CSC 210
 */
package fallingobject;

/**
 * English Description:
 * In order to calculate the distance that an object will fall under Earth's
 * gravity, the equation d = 0.5*(a*(t*t))+(v*t)+p must be evaluated.
 * There will be a total of 5 variables. 4 of those variables will store the
 * values of acceleration, time, initial velocity, and initial position.
 * The values stored for the respective variables will be -9.8, 15,
 * 0, and 0. The final fifth variable, representing the final distance, will be
 * be declared with no stored value. All variables will be of type double to 
 * avoid conflicts in types.
 * The equation will be evaluated through multiplication and addition of the 
 * variables and the resulting value will be assigned to a variable.
 * Then, a statement will be printed saying "The objects will fall a total
 * of " + d + " meters." 
 */
public class FallingObject {

    public static void main(String[] args) {
        double a = -9.8; // Value of acceleration
        double t = 15; // Value of time
        double v = 0; // Value of initial velocity
        double p = 0; // value of initial position
        double d; // Declaring variable for calculated distance 
        
        // The equation to evaluate total distance fallen
        d = 0.5 * (a * (t*t)) + (v*t) + p;
                
        // The statement that will print the total distance fallen
        System.out.println("The object will fall a total of " + d + " meters.");
    }
    
}
