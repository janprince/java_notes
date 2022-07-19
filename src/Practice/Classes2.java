package Practice;


class vehicle2{
    // instance variables
    int passengers;
    int mpg;
    int fuel_cap;
    boolean green_rev;

    vehicle2(int num_people, int miles_per_g, int fuel_cap, boolean renewable_energy){ // Constructor
        passengers = num_people;
        mpg = miles_per_g;
        this.fuel_cap = fuel_cap; //
        green_rev = renewable_energy;
    }


    // methods
    double range(){
        int rang = mpg * fuel_cap;
        return (double) rang;
    }
}


public class Classes2 {
    public static void main(String[] args) {

        vehicle2 V8 = new vehicle2(56, 78, 56, true );

        System.out.println(V8.mpg);

        double V8_range = V8.range();
        System.out.println("Range of V8 = " + V8_range);
    }
}
