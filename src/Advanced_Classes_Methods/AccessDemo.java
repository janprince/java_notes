package Advanced_Classes_Methods;

//                                                  Control access to class members
/*                                          How to control access to the members of a class

                    In java, there are two basic types of class members: public and private.
        A public member can be freely accessed by code defined outside of its class
        A private member can be accessed only by other methods defined by its class.
        It is through the use of private members that access is controlled.

        Restricting access to a class’ members is a fundamental part of object oriented
        programming because it helps prevent the misuse of an object.
        By allowing access to private data only through a well defined set of methods, you can prevent improper
        values from being assigned to that data

        The default access setting for any class member is public.

        Member control access in achieved through the use of three access modifiers:
        public, private, protected.

        An access modifier precedes the rest of a member's type specification.
 */


//     Public vs Private access
class Myclass{
    // instance variables
    private int alpha;   // private access
    public int beta;    // public access
    int gamma;          // default access - - - - - - - -- - - - - - - - -- - - - -- - - - --  public

    // Methods to access alpha
    /*    It is OK for a member of a class to access  a private member of the same class.     */

    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }
}



public class AccessDemo {
    public static void main (String args[]){

        //                                  Demonstrating access to class members
        Myclass c1 = new Myclass();

        // These are okay because beta and gamma are public
        c1.beta = 87;
        c1.gamma = -12;

        // c1.alpha = 10        is WRONG! alpha is private
        //  Access to alpha is allowed only through its accessor methods
        c1.setAlpha(6);

        System.out.println("c1.alpha is = " + c1.getAlpha());
    }
}
