package Basics;

public class Data_Types_Primitive {
    public static void main(String[] args) {

        /*
        * At the core of Java are eight primitive data types
        * All of Java's other data types are constructed from these primitive types:
        *
        * boolean   - true/false
        * byte      - 8-bit integer
        * char      - characters
        * double    - Double-precision floating points (most used)
        * float     - Single-precision floating points
        * int       - Integers(whole nunmbers)
        * short     - short integer
        * long      - long integer
        * */

        //              Integers

        /*  Java defines four integer types: byte, short, int, long. All with different range
        *   The most commonly used integer type is int. Basics.Variables of type, int are often employed
                to control loops, to index arrays and to perform general-purpose integer math
        *   When you need an integer that has a greater range than int, use long*/
        long ci;
        long cm;

        cm = 5280 * 12;
        ci = cm * cm * cm;  /*
                            if ci was declared as an int, this statement would result in an error,
                            since it's out of range for an int
                            */

        System.out.println("There are "+ ci + " cubic inches in cubic mile");


        System.out.println();

        //                      Floating points
        /* Floating points represent numbers that have fractional components. There are two types:
            * Float
            * Double
        Double is the commonly used.
        * Many of the math functions in Java's class library use/return double values
        */

        // Implementing the pythagoras theorem
        double x, y, z;
        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);   // Returns a float value

        System.out.println("Hypotenuse is " + z);

        /*  Note: how the sqrt() is called. It is preceded by the name of the class of which it is a member */

        System.out.println();


        //                                  Char
        /*  char - used to represent all characters in all human language since Java uses Unicode
                A character variable can be assigned a value by enclosing the character in single quotes
        */
        //Character variables can be handled like integers

        char ch = 'X';
        System.out.println("ch is : " + ch);

        ch++;   // A char can be incremented       ch is assigned the character, 'Y'
        System.out.println("ch is now : " + ch);

        ch = 90;    //A char can be assigned an integer value.
        System.out.println("ch is now : " + ch);

        System.out.println();

        //                          Boolean
        /* The boolean type represents true/false values*/

        boolean b;
        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);

        // a boolean value can be used to control the if statement
        if(b) System.out.println("This is executed");

        b = false;

        if(b) System.out.println("This is not executed");

        // The outcome of a relational operator is a boolean value.
        System.out.println("10 < 8  : " + (10 < 8));

        System.out.println();


        //                          Literals
        /*
        Example 1 :

            By default, integer literals are of type int. If you want to specify a long literal, append
            an l or an L. For example, 12 is an int, but 12L is a long.

        long myVar;
        myVar = 34254523543     Though the number is being assigned to the variable, myVar of type long,
                                the number "34254523543 " is an integer literal.
                                To use a long literal,
        long myVar = 34254523543l/L       This assigns a long literal to myVar.



        Example 2 :

            By default, floating point literals are of type double. To specify a float literal, append
            an F or f to the constant. For example, 10.19F is of type float.

            float myVar2;
            myVar2 = 10.19    This assigns a double literal(10.19) to myVar2 of type, float.
                              To specify a float literal,
            myVar2 = 10.19f


            */


        //                       Hexadecimal, octal and binary literals
        /*  Java allows you to specify integer literals in hexadecimal or octal instead of decimal
        *       A hexadecimal literal must begin with 0x or 0X (zero followed by x)
        *       An octal literal begins with a zero, 0.
        *  */
        int oct, hex;

        hex = 0xff;
        oct = 011;
        System.out.println("FF in hex = " + hex + " in decimal");  // Prints out it's decimal equivalent

        System.out.println("11 in octal = " + oct + " In decimal");

        System.out.println();


        /*
        * You can embed one or more underscores into an integer or floating point literal. Doing
        so can make it easier to read values consisting of many digits. When the literal is
        compiled, the underscores are simply discarded. Here is an example:*/
        int card_number;
        card_number = 123_45_6709;  // The underscores are just for readability

        System.out.println("My card number is " + card_number);


        /*The use of underscores is particularly useful when
        encoding things like part numbers, customer IDs, and status codes that are commonly
        thought of as consisting of subgroups of digits.*/

        System.out.println();

        //                                  String literal
        // A string is a set of characters enclosed in double quotes.
        System.out.println("Hello, world. \n The name is Jan");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

    }
}

