package Advanced_Classes_Methods;

//                                              Method Overloading
/*      In java, two or more methods within the same class can share the same name, as long as their parameter
        declarations are different. When this is the case, the methods are said to be overloaded.

            Method overloading is one of the ways that Java implements polymorphism

         To overload a method, simply declare different versions of it. But the type and/or number of parameters
         of each overloaded method must differ.

       When an Overloaded method is called, the version of the method whose parameters match the arguments is executed.
 */

class someClass{

    void ovlDemo(){
        System.out.println("No parameters");
    }


    // overload ovlDemo for one integer parameter
    void ovlDemo(int a){
        System.out.println("one parameter: " + a);
    }


    //overload ovlDemo for two integer parameter
    int ovlDemo(int a, int b){
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    //using two double parameters
    double ovlDemo(double a, double b){
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}



public class Method_Overloading {
    public static void main(String[] args) {
        someClass _h = new someClass();

        // calling a method

        int i = _h.ovlDemo(2,3);  // calls the version whose parameters match the arguments here
        System.out.println(i);

        _h.ovlDemo();
    }
}
