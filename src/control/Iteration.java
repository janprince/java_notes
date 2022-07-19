package control;

public class Iteration {
    public static void main(String[] args)
    throws java.io.IOException{
        //                               For loop

        /*     for(initialization; condition; increment)
        *   The following program uses a for loop to print the sqrt of numbers from 1 to 50  */

        double i, sroot, rounding_error;

        for (i = 1.0; i < 51.0; i++){
            sroot = Math.sqrt(i);
            System.out.println("The squareroot of " + i + " is = " + sroot);

            // Compute the rounding error
            rounding_error = i - (sroot*sroot);
            System.out.println("Rounding error = " + rounding_error);
            System.out.println();

        }

        //                  some variations  on the for loop

            //                           multiple loop variables
        int j, k;

                            //Note how the comma and semicolon is used
        for (j=0, k=20; j < k; j++, k--){
            System.out.println("j and l is " + j + " and " +k );

        }

        /* The codition controlling the loop can be any valid boolean expression. It does not have to contain
            the loop variable

            Example:
        * */
        int o ;
        // loop runs until an s is typed

        System.out.print("Please enter an s : ");

        for(o = 0; (char)System.in.read() != 's'; o++){
            System.out.println("Pass #" + o);
        }


        //                              Missing Pieces
        /*      In java, it is possible  for any or all of the loop definition to be left blank */
        System.out.println("---------- missing pieces-----------");
        int p;

        for (p=0; p<6; ){               // note the blank position in the loop definition
            System.out.println("pass #" + p);
            p++;        //   the increment expression is moved into the body
        }

        System.out.println("---------- missing pieces   2 -----------");
        int u = 0;                  // this becomes the loop initialization
        for ( ; u > -9; ){          // note the two missing pieces
            System.out.println("pass #" + u);
            u--;                    // decrement loop variable
        }


        //                  Loops with no body
        /*          These are sometimes useful             */

        int sum = 0;

        // sum the numbers through 5
        for (int n = 0; n <= 5; sum += n++) ;   // The loop variable is declared in the for loop definition.

        /*           sum += n++ is same as               sum = sum + n;   n++                   */




        System.out.println("------------------ While loop --------------------");


        //                          While Loops
        /*      Another of java's loop is while    while(condition) statement  */
        char ch = 'a';
         while (ch <= 'z'){
             System.out.print(ch);
             ch++; // Each time through the loop, ch is incremented
         }



         //                     The last of java's loop is the do while loop
        /*                      later                                   */



    }
}
