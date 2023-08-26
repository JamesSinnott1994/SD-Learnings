package ie.sinnott;

import ie.sinnott.simple.TestClass;
import ie.sinnott.vehicle.Bicycle;
import ie.sinnott.vehicle.Bike;

import static ie.sinnott.simple.In1.a;

// Java program to demonstrate working of interface
public class Main {

    public static void main(String[] args) {

        // Simple Interface
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);

        // Vehicle Interface
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();

    }
}
