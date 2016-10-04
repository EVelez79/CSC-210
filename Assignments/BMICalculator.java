package bmicalculator;

// Import Scanner class to read user input
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object 
        
        String name; // Declare variable for name
        int height; // Declare variable for height
        double weight; // Declare variable for weight
        double BMI; // Declare variable for BMI
        
        // Ask user input for name
        System.out.print("What is your name? ");
        name = input.nextLine();
        
        // Ask user input for height in inches
        System.out.print("What is your height in inches? ");
        height = input.nextInt();
              
        // Ask user input for weight
        System.out.print("What is your weight in pounds? ");
        weight = input.nextDouble();
        
        // Block to distinguish user input from output
        System.out.println("");
        System.out.println("end user input");
        System.out.println("");
        
        // Equation to evaluate BMI from user input
        BMI = (weight /(height*height)*703);
        
        // Equations to convert height from inches to feet and inches
        // fHeight is feet and iHeight is inches
        int fHeight = height/12;
        int iHeight = height%12;
        
        // Output block
        System.out.println("Name: " + name);
        System.out.println("Height: " + fHeight + " ft. " + iHeight + " in.");
        System.out.println("Weight: " + weight + " lb.");
       
        // This block determines the BMI category and prints directly to the
        // output block below name, height, and weight
        if (BMI <= 18.5){
           System.out.println("BMI: Underweight");
        } else if (BMI > 18.5 && BMI <= 24.9){
            System.out.println("BMI: Normal weight");
        } else if (BMI >= 25 && BMI <= 29.0){
            System.out.println("BMI: Overweight");
        } else{
            System.out.println("BMI: Obese");
        }
        System.out.println(BMI);
    }
    
}
