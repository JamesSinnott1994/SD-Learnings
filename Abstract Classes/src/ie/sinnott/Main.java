package ie.sinnott;

import ie.sinnott.observationone.Base;
import ie.sinnott.observationone.Derived;

public class Main {

    public static void main(String[] args) {
        Sunstar s = new Employee();
        s.printInfo();

        System.out.println();
        System.out.println("*********************");
        System.out.println();

        // **Observation One** \\
        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();


    }
}
