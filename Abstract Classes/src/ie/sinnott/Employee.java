package ie.sinnott;

// Abstraction performed using extends
public class Employee extends Sunstar {

    void printInfo() {
        String name = "James";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

}
