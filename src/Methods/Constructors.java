package Methods;

/*                                           Constructors
*                   A constructor initializes an object when it is created
*       It has the same name as its class and is syntactically similar to a method
*       Constructors have no explicit return type.
*   Typically, you will use constructors to give initial values to instance variables defined by a class,
*       or to perform any startup procedures required to create a fully formed object.
*/

class Myclass{
    int x;

    // a simple constructor
    Myclass(){           // This is the constructor for Myclass. Looks like a method but without a return type.
        x = 10;
    }
}


// Using a parameterized constructor
class YourClass{
    int x;

    YourClass(int i){   // parameters are added in the same way they are added to a method.
        x = i;
    }
}



public class Constructors {
    public static void main(String[] args) {
        // the constructor Myclass() is called the variable  immediately a new object of Myclass is declared.
        Myclass t1 = new Myclass();
        Myclass t2 = new Myclass();

        System.out.println("t1.x = " + t1.x);
        System.out.println("t2.x = " + t2.x);
        // Note: t1.x and t2.x will both be 10

        System.out.println();

        // using class with parameterized constructors
        YourClass exmpl = new YourClass(2); // the value 2 is passed to i which is then assigned to x
        System.out.println(exmpl.x);

    }
}
