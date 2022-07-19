package Advanced_Classes_Methods;

/*              Like methods, constructors can also be overloaded.
        Doing so allows you to construct the object  in a variety of ways.
 */

class Cons{
    int x;
    boolean y;

    //  constructor version 1
    Cons(){
        System.out.println("Inside Cons(). ");
        x = 0;
        y = false;
    }

    // constructor version 2
    Cons(int i){
        System.out.println("Inside Cons(int i)).");
        x = i;
        y = false;
    }

    // constructor version 3
    Cons(int i, boolean y){
        System.out.println("Inside Cons(int i, boolean y).");
        x = i;
        this.y = y;
    }

    // constructor version 4
    Cons(double d){
        System.out.println("Inside Cons(int i, boolean y).");
        x = (int)d;
    }

}



public class Constructor_Overloading {
    public static void main(String[] args) {

        Cons object_1 = new Cons(3.4);  // calls the 4th version of the constructor.
        Cons object_2 = new Cons(); // calls the 1st version.
        //
    }
}
