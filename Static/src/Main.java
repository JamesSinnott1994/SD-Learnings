package src;

public class Main {

    // Java program to demonstrate that a static member
    // can be accessed before instantiating a class
    static void m1() {
        System.out.println("From m1");
    }

    public static void main(String[] args) {
        // calling m1 without creating
        // any object of class Main
        m1();
    }

}