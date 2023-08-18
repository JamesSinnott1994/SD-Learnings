package ie.sinnott;

import ie.sinnott.shape.Circle;
import ie.sinnott.shape.Rectangle;
import ie.sinnott.shape.Shape;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
