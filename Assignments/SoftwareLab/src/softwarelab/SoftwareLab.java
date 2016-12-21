/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarelab;

/**
 *
 * @author erick_000
 */
public class SoftwareLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dog temp1 = new Dog();                                                      //Instance (object) of Dog class created using default constructor

        Dog temp2 = new Dog(5, 2.3, "temp2");                               //Instance (object) of Dog class created using overloaded constructor

        System.out.println("temp1 age: " + temp1.age);                                            //member-association operator to access data fields
        System.out.println("temp2 age: " + temp2.age);

        temp1.age = 20;                                                                          //member-association operator to change the value for object
        System.out.println("temp1 updated age: " + temp1.age);                          //member-association operator to access "age" data field
        System.out.println("temp2 unchanged age: " + temp2.age);                         //age does not change for other object

        temp1.Bark();                                                                                    //member-association operator
        temp2.Bark();

        System.out.println("temp1 age: " + temp1.getAge());                                         //using getters and setters
        temp1.setAge(50);
        System.out.println("temp1 updated age: " + temp1.getAge());

        temp1.setAge(-50000);                                                                               //testing setAge() condition
        System.out.println("temp1 unchanged age: " + temp1.getAge());                                 //no change since dog cannot be -5000 years old; failed check in setAge() method

        //NEW STUFF
        System.out.println("Number of Dogs: " + Dog.getNumberOfDogs());                          //can access directly without an instance since it is static
        System.out.println("Number of Dogs: " + temp1.getNumberOfDogs());                       //Can also access through an instance

        Dog.setNumberOfDogs(50);                                                                                    //Anyone with access to the class and the setter or the data member can directly change the numberOfDogs with needing an instance
        System.out.println("Number of Dogs: " + temp2.getNumberOfDogs());                       //Changes for everyone since it is a class variable

        System.out.println("Age of older dog: " + ageOfOlderDog(temp1, temp2));             //Passing in reference variables for objects

        changeAgeTo1000(temp1);                                                                                         //Changes to objects within methods are permanent since the caller and callee share the same object
        System.out.println("Temp1 changed age: " + temp1.getAge());

        Dog[] arrayOfDogs = new Dog[10];                                                                        //array of Dog objects
        arrayOfDogs[0] = new Dog(2, 6.5, "dogInArray");                                                             //instantiating dog object within array
        System.out.println("dogInArray age: " + arrayOfDogs[0].getAge());                           //Getting age of dog object within array

    }

    public static int ageOfOlderDog(Dog temp1, Dog temp2) {

        if (temp1.getAge() > temp2.getAge()) {
            return temp1.getAge();
        } else {
            return temp2.getAge();
        }
    }

    public static void changeAgeTo1000(Dog temp) {
        temp.setAge(1000);
    }

}

class Dog {

    int age;                                                                                       //Data Members or Data Fields or Instance Variables
    double height;
    private String name;

    private static int numberOfDogs;                                                                    //static data member

    public Dog() {                                                                          //Default Constructor

        numberOfDogs++;

    }

    public Dog(int age, double height, String name) {                                  //Overloaded Constructor

        this.age = age;
        this.height = height;
        this.name = name;
        numberOfDogs++;
    }

    public void Bark() {                                                                    //Instance methods
        System.out.println("Woof!");
    }

    public int getAge() {                                                                    //getters
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {                                                   //setters

        if (age > 0) {                                                                      //condition for age
            this.age = age;
        }

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;                                                           //condition is not necessary
    }

    //NEW STUFF
    public static int getNumberOfDogs() {                                                       //getters and setters of static data member.
        return numberOfDogs;                                                                        //Notice the lack of the "this" operator
    }

    public static void setNumberOfDogs(int aNumberOfDogs) {
        numberOfDogs = aNumberOfDogs;
    }
}

}
