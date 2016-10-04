package loops;

public class Loops {
    
    /*
    The main method below is used to format the different loops as well as call
    the loop methods.
    */
    public static void main(String[] args) {
        System.out.println("---------- LOOP 1 ----------");
        loop1();

        System.out.println("");

        System.out.println("---------- LOOP 2 ----------");
        loop2();

        System.out.println("");

        System.out.println("---------- LOOP 3 ----------");
        loop3();

        System.out.println("");

        System.out.println("---------- LOOP 4 ----------");
        loop4();

        System.out.println("");

        System.out.println("---------- LOOP 5 ----------");
        loop5();

        System.out.println("");

        System.out.println("---------- LOOP 6 ----------");
        loop6();

        System.out.println("");

        System.out.println("---------- LOOP 7 ----------");
        loop7();

        System.out.println("");

        System.out.println("---------- LOOP 8 ----------");
        loop8();

        System.out.println("");

    }

    /*
    The first loop starts from zero and adds two during every increment until 
    it gets to 100. It prints every increment.
    */
    public static void loop1() {
        for (int count = 0; count <= 100; count += 2) {
            System.out.println(count);
        }
    }

    /*
    The second loop takes variable x with a value of 100. 
    On each iteration, the value is halved and printed until it is less than 0.
    */
    public static void loop2() {
        int x = 100;
        while (x > 0) {
            x = x / 2;
            System.out.println(x);
        }
    }

    /*
    The while loop below uses a count variable in order to calculate the power
    of 2 to the 15th. It calculates the power by starting with x having a 
    value of 2. Then it multiplies it by 2 and reiterates that.
    */
    public static void loop3() {
        int count = 0;
        int x = 2;
        do {
            System.out.println(x);
            x = x * 2;
            count++;
        } while (count <= 15);
    }

    /*
    The for loop starts at 100 and adds 1 in every increment. During every
    increment, it checks x to see if it is divisible by both 3 and 4. If it is,
    then it prints that number. If it isn't, it does nothing.
    */
    public static void loop4() {
        for (int x = 100; x <= 250; x++) {
            if (x % 3 == 0 && x % 4 == 0) {
                System.out.println(x);
            }
        }
    }

    /*
    The loop below starts by printing x which has a stored value of 9. During
    every increment 9 is multiplied by the count variable which will increase by
    one during every increment. Once the loop evaluates past 150, it ends.
    */
    public static void loop5() {
        int x = 9;
        int count = 1;
        while (x < 150) {
            System.out.println(x);
            count++;
            x = 9 * count;
        }
    }

    /*
    This loop is similar to the last loop which involved exponents. Start off
    with variable power with a value of 2. That value is multiplied by 2 and
    then stored in power. It repeats until x, the count, is not less than 29. If
    the boolean is x<=29 then the loop gives a - number.
    */
    public static void loop6() {
        int power = 2;
        for (int x = 0; x < 29; x++) {
            power = 2 * power;
        }
        System.out.println(power);
    }

    /*
    This loop uses a count variable for the do while, a sum variable which holds
    the ending sum of the infinite series, and a denom variable which is added
    to every increment to simulate the infinite series. After adding the current
    sum to the next in the series, it stored until the count reaches 5000, which
    is the amount of increments needed, then it is printed.
    */
    public static void loop7() {
        int count = 0;
        double sum = 0;
        double denom = 1;
        do {
            sum = sum + (1 / denom);
            denom++;
            count++;
        } while (count < 5000);
        System.out.println(sum);
    }

    /*
    The loop below starts with the number needing to be reversed, 574837,
    being assigned to x, and 0 being assigned to reverseX in order to be able to
    store operations to retrieve the numbers needed. x is divided and takes the
    remainder and adds it to reverseX, then x is divided which takes a number
    off of x so that eventually the count can equal 0.
    */
    public static void loop8() {
        int x = 574837;
        int reverseX = 0;
        while (x != 0) {
            reverseX = reverseX * 10;
            reverseX = reverseX + (x % 10);
            x = x / 10;
        }
        System.out.println(reverseX);
    }
}
