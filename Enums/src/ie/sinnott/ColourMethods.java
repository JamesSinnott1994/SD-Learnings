package ie.sinnott;

// Java program to demonstrate that enums can have
// constructor and concrete methods.

// An enum (Note enum keyword inplace of class keyword)
public enum ColourMethods {
    RED,
    GREEN,
    BLUE;

    // enum constructor called separately for each
    // constant
    private ColourMethods()
    {
        System.out.println("Constructor called for : "
                + this.toString());
    }

    public void colourInfo()
    {
        System.out.println("Universal Color");
    }
}
