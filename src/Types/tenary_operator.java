package More.Data.Types;

import java.util.Scanner;

public class tenary_operator {
    public static void main(String[] args) {
        //                                          The ? operator
        /*              The ternary operator is used to replace the if-else

                    if (condition)
                        var = Exp1
                    else
                        var = Exp2

           //  using the ? operator,

                val = condition ? Exp1 : Exp2

         */


        //      Getting the absolute of numbers
        Scanner in = new Scanner(System.in);          // Creating an instance for user input

        System.out.print("Please enter a number to get its abs: ");
        int user_num = in.nextInt();

        int abs_val = user_num > 0 ? user_num: -user_num;   //

        System.out.println("Absloute value = " + abs_val);
    }
}
