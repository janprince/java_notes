package Advanced_Classes_Methods;

/**
 *                                      Understanding Static
 *             Normally, a class member must be accessed through an object of its class, but it is
 *             possible to create a member that can be used by itself, without reference to a specific instance.
 *
 *         Outside a class, to use a static member, you need only specify the name of its class followed by the
 *         dot operator. No objects have to be created.
 *
 *          Variables declared as static are essentially global variables. When an object is
 *          declared, no copy of a static variable is made. Instead, all instances of the class share
 *          the same static variable. Here is an example that shows the differences between a
 *          static variable and an instance variable:
 * */

class staticDemo{
    int x;     // a normal instance variable
    static int y; // a static variable

    int sum(){
        // Returns the sum of x and the static var, y
        return x + y;
    }
}


public class Static {
    public static void main(String[] args) {

        //  Demonstrating Static Demo
        staticDemo ob1 = new staticDemo();
        staticDemo ob2 = new staticDemo();


        // Each object has its own copy of a normal instance variable
        ob1.x = 12;
        ob2.x = 5678;

        System.out.println("ob1 and ob2 are independent");
        System.out.println("ob1.x: " + ob1.x + " and ob2.x: " + ob2.x);
        System.out.println();


        // Each object shares one copy of a static variable.
        System.out.println("The static variable, y is shared");

        staticDemo.y = 100;     // this is how a static member is used; it called using the class name
        // ob1.y = 100      // not advisable ; a static member is used without reference to any object

        System.out.println("ob1.sum() = " + ob1.sum());
        System.out.println("ob2.sum() = " + ob2.sum());
        System.out.println();

        // change staticDemo.y to
        staticDemo.y = 2;
        /*
                changing the static variable y is shared by both ob1 and ob2. Changing it affects the entire class,
            not just an instance.
        * */

        System.out.println("ob1.sum() = " + ob1.sum());
        System.out.println("ob2.sum() = " + ob2.sum());

    }
}
