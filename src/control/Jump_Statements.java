package control;

public class Jump_Statements {
    public static void main(String[] args) {

        //                      Using break as a goto statement

        /**
         *                          Break 1
         *  It is possible to immediately exit from a loop by using th break statement
         *     When a break statement is encountered inside a loop, the loop is terminated and
         program control resumes at the next statement following the loop.


                                    Break 2
         *   The break statement can be employed by itself to provide a 'civilised' form of the goto statement.
         *       Java does not have a goto statement...
         *
         *   The goto can be helpful when exiting from a
         deeply nested set of loops. To handle such situations, Java defines an expanded form of
         the break statement. By using this form of break, you can, for example, break out of
         one or more blocks of code. These blocks need not be part of a loop or a switch. They
         can be any block. Further, you can specify precisely where execution will resume,
         because this form of break works with a label. As you will see, break gives you the
         benefits of a goto without its problems.
         The general form of the labeled break statement is shown here:
         break label;
         *
         * A label is any valid Java identifier followed by a colon.
         * Once you have labeled a block, you can then use this label
         as the target of a break statement. Doing so causes execution to resume at the end the labeled block.   */


        int i;
        for (i = 1; i < 4; i++){
            one: {
                two: {
                    three: {
                        System.out.println("i is " + i);
                        if (i==1) break one;        // Breaks to a label
                        if (i==2) break two;
                        if (i==3) break three;

                        //this is never reached
                        System.out.println("This won't print");

                    }
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After for loop");


        //              Another Example

        int f, g, h;

        done :
            for(g=0;g<10;g++){
                for(f=0;f<10;f++){
                    for(h=0;h<10;h++){
                        System.out.println(h);
                        if(h==5) break done; // jumps to the end of 'done'
                    }
                    System.out.println("After h loop"); // this won't execute
                }
                System.out.println("After f loop"); // this won't execute
            }
        System.out.println("After g loop");



         //                         Continue

        /*          The continue statement forces the next iteration to take place*/
        System.out.println();

        //printing even numbers

        int y;

        for (y=0; y<=100; y++){
            if (y%2 != 0) continue;
            System.out.println(y);
        }
    }
}
