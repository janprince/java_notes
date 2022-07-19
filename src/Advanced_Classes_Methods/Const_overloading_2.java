package Advanced_Classes_Methods;

/*              One of the most common reasons that constructors are overloaded is to allow one
        object to initialize another.

 */
class Summation{
    int sum;

    Summation(int num){
        sum = 0;
        for (int i =0; i<num; i++) sum = sum + i;
    }

    // construct from another object
    Summation(Summation ob){
        sum = ob.sum;
    }
}


public class Const_overloading_2 {
    public static void main(String[] args) {

        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);   //

        System.out.println("s1.sum : " + s1.sum);
        System.out.println("s2.sum : " + s2.sum);
    }
}
