package ie.sinnott.innerclass;

public class D extends B {
    public class E extends C {
        // implementing the abstract method
        public void myAbstractMethod() {
            System.out.println(
                    "Inside abstract method implementation"
            );
        }
    }
}
