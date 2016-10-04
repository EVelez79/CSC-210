package rps;

import java.util.Scanner; // Import Scanner class
import java.util.Random; // Import random # generator

public class Rps {
    
    // This is the main method
    public static void main(String[] args) {
        /* The array below will hold the scores
        Index 0 is the player's score, index 1 is the cpu's score.
        */
        int[] scores = new int[2]; 
        // The statement for what number corresponds to a choice is printed once
        System.out.println("0 is rock, 1 is paper, 2 is scissors.");
        
        /*
        The while loop below will loop the game method and take the return
        value from the if statement body. 
        
        The values returned are 0, 1, or 2. If 0 is returned, a point is added
        to the human's index. If 1 is returned, a point is added to the
        cpu's index. 2 is for draws, it is a default for the else. This is 
        excecuted in the if body inside the while loop.
        
        The argument is less than 2 so that a game of 3 can be played.
        */
        while (scores[0] < 2 && scores[1] < 2) {
            int winner = game(); // This takes the return of the games method.

            if (winner == 0) {
                scores[0]++;
            } else if (winner == 1) {
                scores[1]++;
            } else {
                System.out.print("");
            }
            // The statements print out the respective scores
            System.out.println("Your score: " + scores[0]);
            System.out.println("The computer's score: " + scores[1]);
        }
        
        /*
        The if body below displays once one of the players reaches 2 points. 
        Once two points are reached, the winner is printed.
        */
        if (scores[0] == 2){
            System.out.println("");
            System.out.println("You are the winner of the best of 3 series.");
        } else if (scores[1] == 2){
            System.out.println("");
            System.out.println("The computer is the winner of the best"
                    + " of three series.");
        }
    }
    
    /*
    The below method holds most of the program, including the game algorithm and
    the determination of the winner.
    */
    public static int game() { // 0 = human won, 1 = cpu won, 2 = draw
        Scanner input = new Scanner(System.in); // Create Scanner object
        Random rnd = new Random(); // Create Random object

        int human = 0; // Declare variable for input choice
        int num = rnd.nextInt(3); // Declare variable for cpu argument

            System.out.println(""); // Formatting
            System.out.print("Please choose either 0, 1, or 2. "); //Instruction
           
            // The if statement validates the user input as being an integer, not
            // any other data type
            if (input.hasNextInt()) {
                human = input.nextInt();
                
                // This while loop will display the input prompt until a valid
                // option is chosen
                while (human < 0 || human > 2) {
                    System.out.print("Invalid input. Please choose 0, 1, or 2. ");
                    
                    /* This nested if statement wil check the second looped input
                    for valid input. If a char or other invalid input is given,
                    the program will quit.
                    */
                    if (input.hasNextInt()) {
                        human = input.nextInt();
                    } else {
                        System.out.println("");
                        System.out.println("End user input");
                        System.out.println("");
                        System.out.println("The input was not an integer."
                                + " The program will now exit.");
                        System.out.println("Please restart the program "
                                + "and enter a valid input.");
                        System.exit(1);
                    }
                }
            /* 
                The else statement is the terminator of the program for the first
                if statement if the input was not an integer.
            */
            } else {
                System.out.println("");
                System.out.println("End user input");
                System.out.println("");
                System.out.println("The input was not an integer."
                        + " The program will now exit.");
                System.out.println("Please restart the program "
                        + "and enter a valid input.");
                System.exit(1);
            }
            
            // The block below is for aestheic purposes.
            System.out.println("");
            System.out.println("End user input");
            System.out.println("");

            /* This block of if statements determines what output will be displayed.
            The output prints the results and choices. It will also return an
            integer value, either 0, 1, or 2 to the main method in order to keep
            score in the while loop from the main method, which is inserted
            to the winner variable.
            */
            if (human == 0 && num == 0) {
                System.out.println("You chose rock. The computer chose rock. "
                        + " The game is a draw.");
                return 2;
            } else if (human == 0 && num == 1) {
                System.out.println("You chose rock. The computer chose paper."
                        + " The computer wins.");
                return 1;
            } else if (human == 0 && num == 2) {
                System.out.println("You chose rock. The computer chose scissors."
                        + " You win.");
                return 0;
            } else if (human == 1 && num == 0) {
                System.out.println("You picked paper. The computer picked rock."
                        + " You win.");
                return 0;
            } else if (human == 1 && num == 1) {
                System.out.println("You picked paper. The computer picked paper."
                        + " The game is a tie.");
                return 2;
            } else if (human == 1 && num == 2) {
                System.out.println("You picked paper. The computer picked scissors."
                        + " The computer wins.");
                return 1;
            } else if (human == 2 && num == 0) {
                System.out.println("You picked scissors. The computer picked rock."
                        + " The computer wins.");
                return 1;
            } else if (human == 2 && num == 1) {
                System.out.println("You picked scissors. The computer picked paper."
                        + " You win.");
                return 0;
            } else {
                System.out.println("You picked scissors. The computer picked scissors."
                        + " The game is a tie.");
                return 2;
            }
        
        }
        
    }
