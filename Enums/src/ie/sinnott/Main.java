package ie.sinnott;

// A simple enum example where enum is declared
// outside any class (Note enum keyword instead of
// class keyword)

enum Colour {
    RED,
    GREEN,
    BLUE
}

public class Main {

    public static void main(String[] args) {

        Colour c1 = Colour.RED;
        System.out.println(c1);

    }
}
