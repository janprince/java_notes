// to be modified
package Classes.Objects.Methods;

class chkNum{
    // no insatnce variables

    boolean isEven(int x){      // x is a parameter
        if ((x%2)==0){
            return true;
        }
        else return false;
    }
}

class Factor{

    boolean isFactor(int a, int b){
        // this method determines if a is a factor of b
        if ((b % a) == 0) return true;
        else return false;
    }
}


public class Method_Paramet {
    public static void main(String[] args) {
        chkNum e = new chkNum();
        System.out.println(e.isEven(75));   // 75 is an argument passed to x


        Factor x = new Factor();

        boolean ans = x.isFactor(4, 8);
        System.out.println(ans);
    }
}
