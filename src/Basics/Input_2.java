package Basics;

import java.util.*;
public class Input_2 {
    public static void main(String[] args) {

        //                          Input
        /*      You can receive input by using the Scanner class which is defined in the java.util package.
            Whenever you use a class that is not defined in the basic java.lang package,
            you have to use  an import directive ; found at the beginning of the program.
        * */

        // To read console input, first construct a Scanner which is attached to System.in
        Scanner in = new Scanner(System.in);

        // Now you can use various methods in the scanner class to read inputs.
        System.out.print("Please enter your name : ");          //  Prompt line
        String name = in.nextLine(); // We use nextLine() because the input might contain spaces
                                     // nextLine returns input as a string


        System.out.print("Please enter your firstname: ");
        String  firstname = in.next(); // To read a single word: no spaces ;
                                        // if spaces are involved, only the first word is taken.

        System.out.println("Your name is " + name + " and " + firstname + " is your firstname.");



        //                      inputs for int and double
        System.out.print("What is your age: ");// prompt line
        int age = in.nextInt();     // For int input

        System.out.println("Hey " + name + " next year, you will be " + (age + 1));


        System.out.print("Enter the value of pi to 3 decimal places: ");// prompt line
        double pi = in.nextDouble();        // returns input as a double literal

        if(pi == 3.142){
            System.out.println("You are correct");
        }
        else {
            System.out.println("You are wrong");
        }
    }
}
