package ie.sinnott;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String colour, double length, double width) {
        // Calling Shape constructor
        super(colour);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() {
        return length * width;
    }

    @Override public String toString() {
        return "Rectangle colour is " + super.getColour() + " and area is: " + area();
    }

}
