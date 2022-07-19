package Advanced_Classes_Methods;

//      An Implementation of Quicksort algorithm

class Quicksort{

    // Set up a call to the actual Quicksort method
    static void qsort(char items[]){
        qs(items, 0, items.length - 1);
    }
    // Main Quicksort
    private static void qs(char items[], int left, int right){

        int i, j;
        char x, y;

        i = left; j= right;
        x = items[(i+j)/2];     // selecting comparand


    }
}


public class QSDemo {
    public static void main(String[] args) {

    }
}
