package Basics;

public class Operators {
    public static void main(String[] args) {
        //                      Basics.Operators

        //              Relational and logical operators
        int i, j;
        i = 10;
        j = 34;

        if(i<j) System.out.println("i < j");
        if(i>j) System.out.println("This won't execute");
        if(i<=j) System.out.println("i <= j");
        if(i>=j) System.out.println("This won't execute");
        if(i==j) System.out.println("This won't execute");
        if(i!=j) System.out.println("i is not j");


        System.out.println();

        boolean b, c;
        b = false;
        c = true;

        System.out.println("b and c = " + (b & c));
        System.out.println("b or c = " + (b | c));
        System.out.println("not (b and c) = " + !(b & c));
        System.out.println("b exclusive or c = " + (b ^ c));


        //                  Arithmetic Basics.Operators
        /*                         + - * % /                 */




        //                      Shorthand assignments
        int x, y;
        x = 10;
        y = 20;

        x += 10; // same as x = x + 10


        boolean t = true;
        t &= false;     // t = t & false

        System.out.println(t);


        //                          Truth table
        System.out.println("--------------------------Truth Table------------------------------");
        boolean tr, f, and, or, x_or, not_p;
        tr = true;
        f = false;



        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT P");
        System.out.println("true\ttrue\t"+ (tr&tr) + "\t" +(tr|tr) + "\t" + (tr^tr) + "\t" + !tr);
        System.out.println("true\tfalse\t"+ (tr&f) + "\t" +(tr|f) + "\t" + (tr^f) + "\t" + !tr);
        System.out.println("false\ttrue\t"+ (f&tr) + "\t" +(f|tr) + "\t" + (f^tr) + "\t" + !f);
        System.out.println("false\tfalse\t"+ (f&f) + "\t" +(f|f) + "\t" + (f^f) + "\t" + !f);




    }
}
