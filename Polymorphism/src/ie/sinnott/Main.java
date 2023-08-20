package ie.sinnott;

import ie.sinnott.exampleone.Helper;
import ie.sinnott.runtime.Parent;
import ie.sinnott.runtime.Subclass1;
import ie.sinnott.runtime.Subclass2;

public class Main {

    public static void main(String[] args) {
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
        System.out.println(Helper.Multiply(2, 3, 4));

        // Runtime polymorphism
        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method
        a = new Subclass1();
        a.Print();

        a = new Subclass2();
        a.Print();
    }
}
