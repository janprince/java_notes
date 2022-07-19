package Classes.Objects.Methods;

//                              Intro To Classes and objects

        /*
        *       All java program activity occurs within a class
        *       A class is a template that defines the form of an object.
        * It specifies both the data and the code that will operate on that data. Java uses a
                class specification to construct objects. Objects are instances of a class. Thus, a class is
                essentially a set of plans that specify how to build an object. It is important to be clear
                on one issue: a class is a logical abstraction.

                One other point: Recall that the methods and variables that constitute a class are called
                members of the class. The data members are also referred to as instance variables.
                *

         *  General form of a class definition

        class class_name{
            // declare instance variables
            type var1;
            type var2;
            //...
            type varN;


            //declare methods
            type method1(parameters){
                //method body
            }

            type method2(parameters){
                //method body
            }

            //...

            type methodN(parameters){
                //method body
            }
        }
      * */

//      A class definition creates a new datatype.


class Vehicle{

    // defines 3 instance variables
    int num_passengers;     // number of passengers
    int fuelcap;        // fuel capacity
    int mpg;            // fuel consumption in mile per gallon

}// contains only data; no methods.

//Note that a class declaration is only a type description; it does not create an actual object



//                              Main Program

class Classes_Intro{
    public static void main(String[] args) {

                        // To create a vehicle object

        Vehicle minivan = new Vehicle();    // creates a new Vehicle object called minivan; an instance of Vehicle

        minivan.fuelcap = 16;
        minivan.mpg = 17;
        minivan.num_passengers = 21;

        //  The dot operator is used to access both instance variables and methods

        int range;
        // computing range, assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.num_passengers + " passengers with a range of " + range);


        Vehicle sportscar = new Vehicle();
        /*
         * sports car is called an object reference variable; it does not store the object but stores a reference
         * value to the object
         * */

        sportscar.num_passengers = 2;
        sportscar.fuelcap = 18;
        sportscar.mpg = 12;

        range = sportscar.fuelcap * sportscar.mpg;
        System.out.println("Sportscar can carry " + sportscar.num_passengers + " passengers with a range of " + range);

        // Minivan and sportscar are two different objects





        //                      Reference variables and assignment

        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;
        /*
        * At first glance, it is easy to think that car1 and car2 refers to different objects, but this is not the case
        *           Instead, car1 and car2 will both refer to the same object.
        *
        *   The assignment of car1 to car2 simply makes car2 refer to the same object as does car1.
        *   Thus the object can be acted upon by both car1 and car2.
        *
        * */

        car1.mpg = 15;      // car2.mpg will also be 15

        System.out.println("car1 has mpg of " + car1.mpg);
        System.out.println("car2 has mpg of " + car2.mpg);

        Vehicle car3 = new Vehicle();

        car2 = car3;        // now car2 and car3 refer to the same object
        /*  After this sequence executes, car2 refers to the same object as car3.
        *
        *   The object referred to by car1 is unchanged
        */

    }
}
