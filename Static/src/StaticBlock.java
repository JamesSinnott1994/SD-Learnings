package src;

// Java program to demonstrate use of static blocks
public class StaticBlock {
    static int a = 10;
    static int b;

    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
}
