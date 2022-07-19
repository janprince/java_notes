package Basics;

public class Type_conversion {
    public static void main(String[] args) {
        //                      Type conversion in assignment
        int i;
        float j;

        i = 10;
        j = i;
        /* When compatible types are mixed, the value of the right side is automatically converted to the type
            of the left side
            Thus in the preceding fragment, the value in i is converted to float and assigned to j.

           Note: There are automatic conversions for only types that are compatible like byte to int
            and long to double.
             int to byte and double to long are not converted since this is not a widening conversion


             */

        //                      Casting  Incompatible types
        /*          Converting one type to another             (target_type) expression */

        System.out.println("\t\t------------------Casting-------------------------");

        int age = 23;
        System.out.println((float)age);             // prints 23.0

        double x, y;
        x = 5.0;
        y = 2.0;
        System.out.println(x/y);            //  2.5

        int z  = (int)(x/y);        // converts to int by truncating the fractional part.    2.5 to 2
        System.out.println(z);

        // byte represents an 8 bit number
        int q = 45;
        System.out.println((byte)q);
        /* if casting to byte, make sure the number can be represented in 8 bits, otherwise information will be lost*/

        byte h = 89;

        char ascii = (char)h;               // results in Y
        System.out.println(ascii);
        System.out.println();




        //                          Type conversions in Expressions
        byte b;
        int l;

        b = 10;
        l = b * b; // The bytes b is promoted to an integer when the expression is evaluated.
                    // therefore the operation bet bytes results in an integer because of type promotion.
                    // No cast needed since the result is assigned to an int variable

        b = 12;
        b = (byte)(b * b); //cast is needed here to assign an int to a byte

        /* The point here is that the integral types: short, char and byte are converted to int before
            used in arithmetic operations


            This same sort of situation also occurs when performing operations on chars */

        char ch1 = 'a', ch2 = 'b', ch3;

        System.out.println(ch1 + ch2); // This prints out an integer (195), but we want a character as the result

        ch3 = (char)(ch1 + ch2);
        // Without the cast, the result of adding ch1 to ch2 would be int, which can’t be assigned to a char.

        System.out.println("ch1 + ch2 now equals " + ch3);     // Prints out the ascii char for 195 i.e Ã


    }
}
