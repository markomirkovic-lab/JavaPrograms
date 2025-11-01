// Java Program to Illustrate Method Calling
import java.io.*;

// Helper class
class Test {

    public static int i = 0;

    // Constructor to count objects
    Test() {
        i++;
    }

    // Static method to get the 
    // number of objects created
    public static int get() {
        return i;
    }

    // Instance method m1 calling 
    // another method m2
    public int m1() {
        System.out.println("Inside the method m1");
        this.m2();  // Calling m2 method
        return 1;
    }

    // Method m2 that prints a message
    public void m2() {
        System.out.println("In method m2");
    }
}

// Main class
class Geeks {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of Test class
        Test obj = new Test();

        // Calling m1 method
        int i = obj.m1();
        System.out.println("Control returned after m1: " + i);

        // Get and print the number of objects created
        int o = Test.get();
        System.out.println("No of instances created: " + o);


        /*
        Inside the method m1
        In method m2
        Control returned after m1: 1
        No of instances created: 1
        */

    }
}
