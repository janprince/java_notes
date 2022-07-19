package control;

public class Selection {
    public static void main(String[] args)
    throws java.io.IOException{
                //                          Selection or Conditions
        /*      Includes the if ans switch statements
            The condition of an if statement evaluates to a boolean value.
        *   When the condition of an if statement evaluates to true, then the if block is executed.
        * */

        /*  Guess the letter game

        char answer = 'k', user_ch;
        System.out.println("I am thinking of a letter between a and z ");
        System.out.print("Can you guess: ");

        user_ch = (char) System.in.read();

        if(user_ch == answer) System.out.println("You Are right");
        else System.out.println("You are wrong");


        System.out.println();

        */
        //              Nested ifs
        char secret = 'f';
        System.out.println("I am thinking of a letter between a and z ");
        System.out.print("Please guess again : ");

        char ch = (char) System.in.read();

        if(ch == secret) System.out.println("You Are right");
        else {
            System.out.println("You are wrong");
            if(ch < secret) System.out.println("Too low");
            else System.out.println("Too high");
        }





        //                      Switch  Statement

        /*  The second of java's selection is the switch.   */


        int i;

        for(i=0; i<10; i++){
            switch (i){
                case 0: System.out.println("i is zero");
                break;
                case 1: System.out.println("i is one");
                break;
                case 2: System.out.println("i is two");
                break;
                case 3: System.out.println("i is three");
                break;      // if the break statements are not written,
                            // the default statement will execute each time through the loop
                case 4: System.out.println("i is four");
                break;
                default: System.out.println("i is five or more");
            }//When i is 5 or greater, no case match, so the default statement is executed.
        }

        /*      The switch provides for a  multi-way branch.switch.
                Thus, it enables a program to select among several alternatives.
                Although a series of nested if statements can perform multiway tests, for many
                situations the switch is a more efficient approach.
                */
    }
}
