public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight) {

        /*
        The super keyword refers to superclass (parent) objects. It is used to call superclass methods, and to access
        the superclass constructor. The most common use of the super keyword is to eliminate the confusion between
        superclasses and subclasses that have methods with the same name.
         */
        super(gear, speed); // invoking base-class (Bicycle) constructor
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    @Override public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }

}
