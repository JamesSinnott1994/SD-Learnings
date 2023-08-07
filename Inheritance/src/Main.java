interface one {
    void print_geek();
}
interface two {
    void print_for();
}

interface three extends one, two {
    void print_geek();
}

class child implements three {
    @Override public void print_geek() {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

public class Main {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb);

        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }

}