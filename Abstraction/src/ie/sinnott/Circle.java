package ie.sinnott;

public class Circle extends Shape{

    double radius;

    public Circle(String colour, double radius) {
        // Calling Shape constructor
        super(colour);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString() {
        return "Circle colour is " + super.getColour() + " and area is: " + area();
    }

}
