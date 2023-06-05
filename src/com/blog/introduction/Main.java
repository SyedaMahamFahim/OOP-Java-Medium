// ----- Package---- //
/*
 * A package acts as a container or directory that holds related code files.
 * Packages typically follow a naming convention, often based on the project or organization's domain name in reverse order (e.g., com.example.project.package).
 * Packages provide a way to avoid naming conflicts by encapsulating code within their own namespace.
 * When a package is imported, only those items within the package declared as public will be available to non-subclasses in the importing code.
 */

package com.blog.introduction;

// -------- Class------- //
/*
 * To create an object in java using OOP, we have to follow 3 steps
 * 1) Define a class
 * 2) Instanited the object
 * 3) Access the object methods and properties
 */
public class Main {
    public static void main(String[] args) {

        // ---------- Object ---------- //
        /*
         * We have many data type in JAVA for example, String,int, long etc
         * Object is a custom data type we created.
         * Here, car3 is a variable with type Cars ( just like String is a type)
         * Where new Cars allocate a Cars object to variable car
         * It is important to understand that the 'new' keyword dynamically
         * allocates(that is, allocates at run time)memory for an object & returns a
         * reference to it.
         */

        //  ------- New Keyword ------ //
        Cars car1 = new Cars(1000, "BMW", "Black"); // Object with parameters
        Cars car2 = new Cars(car1); // Passing object into object as a parameter

        System.out.println("This is car1" + car1);
        System.out.println("This is car2" + car2);

        // --------- Accessing object properties and methods ---------------- //
        /*
         * To access object properties or method (functions), we have to use dot
         * operator
         */

        System.out.println(car1.color); // Accessed object property i.e color
        car1.setPrice(2000); // Accessed object method (function) and setting the price
        car1.getPrice(); // Accessed object method (function) and get the price

        // --------- Final Keyword ---------------- //
        /*
         * 
         */

        final int x = 5; // A final variable of primitive type
        // x = 10; // Error: Cannot modify the value of a final variable
        System.out.println("This is the value of "+ x);
        final Cars finalCar = new Cars(); // A final reference variable
        finalCar.setPrice(45); // Modifying the internal state of the object is allowed
        // finalCar = new Cars(); // Error: Cannot assign a new reference to a
        // final variable

    }
}

class Cars {

    // Properties/Attributes of a Object
    /*
     * Class attributes are variables that are defined within a class and are shared
     * by all instances of that class. They are typically defined at the top level
     * of a class, outside of any method.
     * Class attributes are accessed using the class name followed by the attribute
     * name, or through an instance of the class.
     * They can be accessed and modified by all instances of the class, as well as
     * by class methods and class itself and changes made to a class attribute are
     * reflected across all instances of the class
     */
    int price;
    String name;
    String color;

    // ------  Overloading ----- //
    /*
     * In Java, it is possible to define two or more methods, and constructors within the same class that share the same name, as long as their parameter declarations are different. While overloaded methods may have different return types, the return type alone is insufficient to distinguish two versions of a method.
     */

    // -------- Constructor -------- //
    /*
     * Here i have defined 3 constructor that can be a example of Overloading
     * Constructor is a special type of method that has the same name as the class
     * Constructor is used to initialize the object
     * Constructor is called when the object is created
     * The constructor does not have a return type
     */


    // Constructor with parameters

    Cars(int price, String name, String color) {
        // ----- This Keyword ----- // 
        /*
         * Here this will replace to the object name. For example, in above we
         * instanited object using car1 variable so, during run time, this will replace
         * to car1.price, car1.name and so on.
         * Cars car1 = new Car(5000, "BMW", "Black");
         * here, this will be replaced with car1
         */
        this.price = price;
        this.name = name;
        this.color = color;

    }

    Cars(Cars singleEntityCars) {
        /*
         * We are passing a single object and accessing all the property of it.
         */
        this.price = singleEntityCars.price;
        this.name = singleEntityCars.name;
        this.color = singleEntityCars.color;

    }

    // Constructor without parameters
    // public Cars(){
    // System.out.println("This is constructor without parameters");
    // }

    // Calling a constructor from another constructor
    Cars() {
        this(13, "Yaris", "white");
    }

    // ------------- Methods------------- //
    /* Methods are simply just a functions */

    void start() {
        System.out.println("Starting the car");
    }

    void stop() {
        System.out.println("Stopping the car");
    }

    // Setter Method
    void setPrice(int price) {
        this.price = price;
    }

    // Getter Method
    void getPrice() {
        System.out.println(price);
    }
}

