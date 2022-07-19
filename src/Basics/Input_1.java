package Basics;

public class Input_1 {
    public static void main(String[] args)
    throws java.io.IOException{             // Handles input errors when using System.in.read()
        /*      Taking input from user via the console isn't simple as using the standard output stream
        *   The standard input stream is responsible for input.
        * */

        //              Simple use: Reading a character from the keyboard
        char user_data;

        System.out.print("Please enter a key followed by ENTER : ");
        user_data = (char) System.in.read();       /* NOte: With this form, the input is returned as an integer
                                    Therefore you have to cast the input returned to char*/

        System.out.println("Your key is " + user_data);

        // This is only used for reading characters from the keyboard. The code below doesn't execute

        //int a = System.in.read();     // invalid
        //System.out.println(a);





    }
}
