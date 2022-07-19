package Classes.Objects.Methods;
import java.util.*;


//                                        Methods
/*                          Methods are subroutines that manipulate the data defined by a class
    In most cases other parts of your program will interact with the class through its methods.

    In a well-written Java code, each method performs only one task.
    Don't use Java keywords for method names

    The general form of a method

        ret_type (parameter_list){
            //body of method
        }

     The ret_type specifies the type of data returned by the method. This can be any valid type, including
     class types that you create.
     If the method does not return a value, its return type must be void.
    */

class Future_vehicle{
    //  instance variables
    boolean renewable_energy;
    int passengers;
    int mpg;
    int fuel_cap;
    boolean efficient;

    //  methods
    void range(){
        System.out.println("Range is " + (fuel_cap*mpg)); // notice fuel_cap and mpg are used directly; no dot operator
        /*       range does not return a value to the caller. it has no parameters
         *   This method returns when its closing curly braces are reached.  */
    }

    // Value_returning method
    int range_value(){
        // Instead of displaying the range, this method returns the range
        return fuel_cap*mpg;
    }

    // method with parameters
    double fuel_needed(int miles){
        // this method computes the fuel_needed for a given distance
        return (double)miles / mpg;
    }

}



public class Methods {
    public static void main(String[] args) {
        Future_vehicle maglev_train = new Future_vehicle();

        maglev_train.passengers = 200;
        maglev_train.fuel_cap = 300;
        maglev_train.mpg    = 56;
        maglev_train.efficient = true;
        maglev_train.renewable_energy = false;

        maglev_train.range();   // This statement invokes the range() method on maglev_train; using the dot operator


        //          Accessing the return methods
        Future_vehicle hover_car = new Future_vehicle();
        hover_car.mpg = 34;
        hover_car.fuel_cap = 45;

        Future_vehicle drone = new Future_vehicle();
        drone.mpg = 12;
        drone.fuel_cap = 10;

        int hvcar_rng, drone_rng;

        hvcar_rng = hover_car.range_value();    //assigns the value returned to the variable
        drone_rng = drone.range_value();


        // drone
        Scanner in = new Scanner(System.in);
        System.out.print("Please input distance: ");
        int distance = in.nextInt();

        double gallons_needed = drone.fuel_needed(distance);

        System.out.println("Fuel needed for drone to travel " + distance + " miles is " + gallons_needed + " gallons");

    }
}
