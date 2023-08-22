package ie.sinnott;

import ie.sinnott.innerclass.D;
import ie.sinnott.observationone.Base;
import ie.sinnott.observationone.Derived;
import ie.sinnott.observationtwo.DerivedTwo;

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

        System.out.println();
        System.out.println("*********************");
        System.out.println();

        // **Observation Two** \\
        // Creating object of class 2
        // inside main() method
        DerivedTwo d = new DerivedTwo();
        d.fun();

        System.out.println();
        System.out.println("*********************");
        System.out.println();

        // **Observation Seven -> Inner Classes** \\
        // Instantiating the outer class
        D outer = new D();

        // Instantiating the inner class
        D.E inner = outer.new E();
        inner.myAbstractMethod();
    }
}
