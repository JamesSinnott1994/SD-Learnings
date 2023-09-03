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


    // enum declaration inside a class
    enum ColourTwo {
        ORANGE,
        WHITE,
        BLACK
    }

    public static void main(String[] args) {

        Colour c1 = Colour.RED;
        System.out.println(c1);

        ColourTwo c2 = ColourTwo.ORANGE;
        System.out.println(c2);

        // Day test
        String str = "MONDAY";
        DayTest dt = new DayTest(Day.valueOf(str));
        dt.dayIsLike();

        // Iterate over all the values in the enum using for loop
        for (Colour var_1 : Colour.values()) {
            System.out.println(var_1);
        }

    }
}
