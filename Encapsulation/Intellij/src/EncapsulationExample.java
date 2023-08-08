public class EncapsulationExample {

    public static void main(String [] args) {

        // Person Example
        Person person = new Person();
        person.setName("James");
        person.setAge(28);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Area Example
        Area rectangle = new Area(2, 16);
        rectangle.getArea();
    }

}
