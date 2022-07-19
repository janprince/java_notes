package Classes.Objects.Methods;

class Vehicle2{
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle2(int p, int fcap, int mpg){ // constructor
        passengers = p;
        fuelcap = fcap;
        this.mpg = mpg;
        /*      Java Syntax permits the name of a parameter or local variable to be
                    the same as the name of an instance variable.

                The "this" is useful when both the instance var and the constructor parameter has
               the same name. As above.
         */
    }
}



public class Constructors2 {
    public static void main(String[] args) {
        System.out.println("hello");

        Vehicle2 hyperloop =  new Vehicle2(300, 500, 345); // this is more professional


    }
}
