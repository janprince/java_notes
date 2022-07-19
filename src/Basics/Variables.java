package Basics;

public class Variables {
    public static void main(String[] args) {
        int myVar1 ; // Declares a variable of type integer
        int myVar2 ; // Declares another variable

        myVar1 = 1024;  // This assigns 1024 to myVar

        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;    //This assigns the results of myVar1/2  to myVar2

        System.out.print("myVar2 contains : ");
        System.out.println(myVar2);

        /* note: the builtin method print() is just like println(), except that it does not output a new line
            after each call.
             When you use the print() method, the next output  will be displayed on the same line.

             */


        //                      Initializing Basics.Variables
        /*
        *       All variables on Java must be declared prior to their use.
        *               One way of assigning a value to a variable is through an assignment statement :
        *     type var;
        *     var = value;          -   Assignment statement
        *
        *               Another way is by giving it an initial value when it is declared.
        *     type var = value;
        *
        * */

        int count = 10;
        char mod = '%';
        float f = 1.20f;

        // Also

        int b, c = 35, d, e = 67;   // In this case, only c and e (are initialized) have initializations


        //              Demonstrating dynamic initialization
        double radius = 4, height = 5;
        double volume = 3.1416 * radius * radius * height;   /* Dynamic initialization
        Note: this variable wasn't initialized like the
         previous ones which assigned only a literal*/
    }
}
