package Algorithms;

public class Euclid {

    public static int gcd(int m, int n) {
        while (n != 0){
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public static void main(String args[]){
        System.out.println(gcd(125, 50 ));
    }

}
