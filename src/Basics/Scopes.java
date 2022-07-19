package Basics;

public class Scopes {
    public static void main(String[] args) {
        //                  Demonstrating variable scopes
        /*
        *       A block defines a scope
        *       Every declaration in Java has a scope
        *   Basics.Variables declared within a block is called a local variable. This var is not accessible outside of its
            scope
            *
            *            Nested Basics.Scopes
            * Basics.Variables declared in the outer scope is available to the inner scope but the vice versa is false.
        * */

        int x;      // the main() creates a scope of which x belongs. x is known to all code within main()
        x = 10;

        if (x == 10){       // Start of a new scope .   local scope
            int y = 20;     // Known only to this block
            // x and y are both known here.
            System.out.println("x and y : " + x + "" + y);
            x = y * 2;

        }
        //y = 100;    // Error! y is not known here
        System.out.println("x is : " + x);
        System.out.println();

        //                             Demonstrating the lifetime of a variable
        int z;
        for (z = 0; z<3 ; z++){
            int y = -1;     // This will be initialized every time the block is entered
            System.out.println("y is : " + y);
            y = 100;
            System.out.println("y is now : " + y);
        }

    }
}
