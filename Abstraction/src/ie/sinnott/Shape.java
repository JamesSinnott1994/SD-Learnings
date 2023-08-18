package ie.sinnott;

// Java program to illustrate the concept of Abstraction
public abstract class Shape {

    String colour;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String colour) {
        System.out.println("Shape constructor called");
        this.colour = colour;
    }

    // this is a concrete method
    public String getColour() {
        return colour;
    }
}
