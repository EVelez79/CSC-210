package triangle;

import java.util.Scanner;

/**
 *
 * @author erick_000
 */
public class TriangleTest {

    public static void main(String[] args) {
        long a, b, c;
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the length for side A, please. ");
            a = getUserInput();

            System.out.print("Enter the length for side B, please. ");
            b = getUserInput();

            System.out.print("Enter the length for side C, please. ");
            c = getUserInput();

            Triangle object = new Triangle(a, b, c);
            
            System.out.println();
            System.out.println("Valid triangle: " + object.isValid());
            System.out.println("Right Triangle: " + object.isRight());
            System.out.println("Scalene Triangle: " + object.isScalene());
            System.out.println("Isosceles Triangle: " + object.isIsosceles());
            System.out.println("Equilateral Triangle: " + object.isEquilateral());

            System.out.print("Read in a new triangle? (-1 for no, 1 for yes): ");
            if (input.nextInt() < 0) {
                break;
            } else {
                System.out.println();
            }
        }

    }

    public static long getUserInput() {
        Scanner input = new Scanner(System.in);

        long userInput = 0;
        boolean errorCheck = true;

        do {
            if (input.hasNextLong()) {
                userInput = input.nextLong();
                if (userInput >= 1) {
                    errorCheck = false;
                } else {
                    System.out.print("Invalid range, please reenter. ");
                    input.nextLine();
                }
            } else {
                System.out.print("Invalid data type, please reenter. ");
                input.nextLine();
            }
        } while (errorCheck);

        return userInput;
    }
}

class Triangle {
    long sideA;
    long sideB;
    long sideC;

    public Triangle() { // default constructor
    } 

    public Triangle(long a, long b, long c) { // constructor 
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public boolean isScalene() {
       if (isValid()) {
            return (sideA != sideB) && (sideA != sideC) && (sideB != sideC);
        } else {
            return false;
        }
    }

    public boolean isRight() {
        if (isValid()) {
            if ((sideA * sideA) + (sideB * sideB) == (sideC * sideC)) {
                return true;
            } else if ((sideA * sideA) + (sideC * sideC) == (sideB * sideB)) {
                return true;
            } else {
                return (sideB * sideB) + (sideC * sideC) == (sideA * sideA);
            }
        } else {
            return false;
        }
    }

    public boolean isIsosceles() {
        if (isValid()) {
            if (sideA == sideB && sideA != sideC && sideB != sideC) {
                return true;
            } else if (sideA == sideC && sideA != sideC && sideB != sideC) {
                return true;
            } else {
                return (sideA != sideB && sideA != sideC && sideB == sideC);
            }
        } else {
            return false;
        }
    }

    public boolean isEquilateral() {
        if (isValid()) {
            return (sideA == sideB && sideA == sideC && sideB == sideC);
        } else {
            return false;
        }
    }

    public boolean isValid() {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB +sideC > sideA)) {
            return true;
        } else {
            return false;
        }
    }
    
    public long getSideA() {
        return sideA;
    }
    
    public long getSideB() {
        return sideB;
    }
    
    public long getSideC() {
        return sideC;
    }
}
