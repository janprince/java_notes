package Practice;

//  More practice.


public class Bubble_prac {
    public static void main(String[] args) {
        /*
        Because a one-dimensional
        array organizes data into an indexable linear list, it is the
        perfect data structure for sorting. In this project you will learn a simple way to sort an
        array. As you may know, there are a number of different sorting algorithms. There are
        the quick sort, the shaker sort, and the shell sort, to name just three. However, the best
        known, simplest, and easiest to understand is called the Bubble sort.
        * */

        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, i;         //  loop vars
        int size = 10;

        // Displaying original array
        System.out.print("Original array is :");
        for (i=0;i<10;i++){
            System.out.print(" "+ nums[i]);
        }
        System.out.println();


        //  Bubble Sort
        for(a=1; a < size; a++){
            for(b=size-1; b >= a; b--){
                if (nums[b-1] > nums[b]){
                    int t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }


        // Display  sorted array

        System.out.print("Sorted Array is : ");
        for(int y=0; y < 10; y++){
            System.out.print(" " + nums[y]);
        }
        System.out.println();
    }
}


