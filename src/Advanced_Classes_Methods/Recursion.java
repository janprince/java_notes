package Advanced_Classes_Methods;

/**
                                Recursion
 In Java, a method can call itself. This process os called recursion and the method that calls itself is said
 to be recursive.

                The classic example of recursion is the computation of the factorial of a number
    The factorial of a number, N is the product of all the whole numbers between 1 and N
    Factorial of 3 is 3 x 2 x 1.
 */
class Factorial{

    // recursive function
    int factR(int num){
        int result;

        if (num == 1) return 1;
        result = factR(num-1) * num;
        return result;
    }


    // An iterative equivalent
    int factI(int n){
        int result = n;

        if (n == 1) return 1;
        for (int b = n-1; b >= 1; b--){
            result *= b;
        }
        return result;
    }
}


public class Recursion {
    public static void main(String args[]){
        System.out.println("---------------------Recursion-----------------------------");

        // Using recursive func
        Factorial math = new Factorial();

        int fact_3 = math.factR(3);
        System.out.println("Factorial of 3 = " + fact_3);

        System.out.println("Factorial of 4 = " + math.factR(4));
        System.out.println("Factorial of 1 = " + math.factR(1));
        System.out.println("Factorial of 6 = " + math.factR(6));



        // Using an iterative approach

    }
}
