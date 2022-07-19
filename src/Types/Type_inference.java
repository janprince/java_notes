package More.Data.Types;

import java.util.Scanner;

public class Type_inference {
    public static void main(String[] args) {
        //                                  Type Inference with Local variables
        /*                        Local variable Type inference
                It is possible to the let the compiler infer the type of a local variable based on the type of its
                initializer, thus avoiding the need to explicitly specify the type.

                To use local variable type inference,  the variable must be declared with 'var' as the type name and
                it must include an initializer.

         */
        double avg = 20.0;      // This of type double.

        //  using type inference
        var averg = 10.0;       //  This variable is also of type, double because the initializer is of type, double.
        System.out.println(averg);
        //var counter;  //  wrong initializer required
        System.out.println();


        //                                  Using Type inference in a for loop
        // using it with the control variable
        for (var x= 'a'; x <= 'z'; x++)
            System.out.println(x + " ");    // Another way to write a for loop : with indentation denoting the block
        System.out.println();

        //                              use type inference with iteration variable
        int[] nums = {4,6,7,25,79,7,323,-89};
        System.out.print("Values in array: ");
        for (var v: nums)
            System.out.print(v + " ");
        System.out.println();


    }
}
