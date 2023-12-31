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

        // Static block example
        System.out.println("Value of a : " + StaticBlock.a);
        System.out.println("Value of b : " + StaticBlock.b);

        // Student Demo
        // calling static method
        // without instantiating Student class
        Student.setCllg("XYZ");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }

}