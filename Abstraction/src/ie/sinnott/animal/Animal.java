package ie.sinnott.animal;

// Java Program to implement
// Java Abstraction

// Abstract Class declared
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

}
