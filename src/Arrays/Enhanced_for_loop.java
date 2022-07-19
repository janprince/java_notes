package Arrays;

public class Enhanced_for_loop {
    public static void main(String[] args) {
        /*         A for-each loop cycles through a collection of objects, such as an array, in a
                strictly sequential fashion, form start to finish.

         */
        int arr[] = {423, 4, 56, 2, 8, 68, 1, 98};
        for (int y: arr) System.out.print(y + " ");
        System.out.println();


        /*     This form eliminates the need to establish a loop counter, manually indexing the array,etc.

            Through the iteration, x takes up the values in the collection from the first index to last.
            From the example above, in the first iteration, x is 98 then in the next iteration, x is 2.

            Thus, when iterating over an array of size N, the enhanced for obtains the
            elements in the array in index order, from 0 to N–1.

            Because the iteration variable receives values from the collection, type must be the
            same as (or compatible with) the elements stored in the collection. Thus, when iterating
            over arrays, type must be compatible with the element type of the array.
         */

        int nums[] = {98, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int sum2 = 0;

        // sum of all elements in the array
        for (int i=0; i<10; i++) sum = sum + nums[i];

        // Using enhanced for loop
        for (int x: nums) sum2 += x;

        System.out.println("sum is " + sum);
        System.out.println("sum2 is " + sum2 + "\n\n");

        //      Another Example
        float velocities[] = {2.34f, 5.6f, 41.0f, -228.09f, 0.89f};
        float ssum = 0;
        int average;

        System.out.print("Vehicle speeds are : ");
        for (float v: velocities){
            System.out.print(v + " ");
            ssum += v;
        }

        average = (int)(ssum / velocities.length);
        System.out.println("\nSum of velocities = " + ssum + "m/s\n");



        //                                  Iterating over multidimensional arrays
        int s_um = 0;
        int arr2[][] = new int[3][5];

        // giving arr2 some values --  using the manual way for iterating the loop
        for(int j =0; j<3; j++){
            for (int u=0; u<5; u++){
                arr2[j][u] = u + 1 +j;
            }
        }


        // Displaying data in arr2  --  using for-each (enhanced) for loop
        for (int n[]: arr2){
            for (int t: n){
                System.out.print(t + " ");
                s_um += t;
            }
            System.out.println();
        }

        System.out.println("Sum of all elements in arrf = " + s_um+ "\n");



        //                           Searching an Unsorted array with enhanced for-loop

        char alphabets[] = {'a', 's', 't', 'u', 'o', 'p', 'k', 'v', 'g'};
        char val = 'p';         // char to search for in the array
        boolean found = false;      // shows if the char being searched has been found

        // iteration
        for (char alph: alphabets){
            if (alph == val){
                found = true;
                break;
            }
        }

        //
        if (found) System.out.println("Value found!");
        else System.out.println("Value not found!");



        System.out.println();


        //                                                     Copying an array

        double some_arr[] = {2.4, 6.4, -0.1, 0.0096, 56.44332, 1.2, 0, 9};
        double copied[] = new  double[8];
        int w = 0;

        for (double v:some_arr){
            copied[w] = v;
            w++;
        }

        System.out.print("Elements in copied : ");
        for (double m: copied)System.out.print(m + " ");
        System.out.println();

    }

}
