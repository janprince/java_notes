package Practice;

// This is the main program in this package


public class Hello {
    public static void main(String[] args) {

        //  Accessing classes in the same package
        Phone p1 = new Phone("White", "nokia", 8, 250);
        System.out.println("p1 Features: ");
        p1.get_features();


        System.out.println();


        Vehicle Robotaxi = new Vehicle(4, 56, true);
        int robo_range = Robotaxi.get_range(45);
        System.out.println(robo_range);

    }
}
