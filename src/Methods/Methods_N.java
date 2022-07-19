package Classes.Objects.Methods;

//                                     Returning from a method
/*
        Note : A method always belongs to a class


                    In general, there are two conditions that cause a method to return.
               First is when the method's is encountered

               Second is when a return statement is executed. There two forms of return:
       1. one for use in void methods(those that do not return value)
          In a void method, you can cause the immediate termination of the method by using this form of return

       2. one for returning values.

*/

class Laptop{
    // instance variables
    String color;
    int screen_inches;
    int memory;
    int intel_core;


    // methods
    void setcolor(String newcolor) {
        color = newcolor;
    }

    boolean feedback(){
        if (memory >= 8 && intel_core >= 5 ) return true;
        else return false;

    }

}

public class Methods_N{
    public static void main(String[] args) {

        Laptop dell = new Laptop();

        dell.screen_inches = 12;
        dell.memory = 16;
        dell.intel_core = 8;
        dell.color = "blue";

        boolean power = dell.feedback();
        if (power == true) System.out.println("Your laptop is a powerful one");
        else System.out.println("Average system");
    }
}

