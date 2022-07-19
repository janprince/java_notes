package Arrays;

public class Arrays_MultiDimensions {
    public static void main(String[] args) {
        //                                      Multi-dimensional Arrays
        /*
        *           In java, a multidimensional array is an array of arrays
        *   The simplest form of MD array is a two dimensional array
        *                           2D  Array                               */

        int i, t;   // loop variables
        int table[][] = new int[5][8];

        for (i=0; i<5; i++){
            for(t=0; t<8; t++){
                table[i][t] = (i*8) + t + 1;
                System.out.print(table[i][t] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");

        /*                              Irregular Arrays
        *   When you allocate memory for a multidimensional array, you need to specify only the memory for only
        *  the first (leftmost) dimension
        *       You can allocate the remaining dimensions separately.
        * */

        int table2[][] = new int[3][];  // memory is specified only for the first dimension
        table2[0] = new int[4]; // means: the first element in the table2 array is also an array of size, 4.
        table2[1] = new int[4];
        table2[2] = new int[4];

        table2[0][2] = 5;  // etc

        /*      Although there is no advantage to individually allocating the second dimension arrays
            in this situation, there may be in others. For example, when you allocate dimensions
            separately, you do not need to allocate the same number of elements for each index.
            Since multidimensional arrays are implemented as arrays of arrays, the length of each
            array is under your control.

            For example, assume you are writing a program that stores
            the number of passengers that ride an airport shuttle. If the shuttle runs 10 times a day
            during the week and twice a day on Saturday and Sunday, you could use the riders
            array shown in the following program to store the information. Notice that the length of
            the second dimension for the first five indices is 10 and the length of the second
            dimension for the last two indices is 2.*/

        int riders[][] = new int[7][];      // 7, represents days in the week
        riders[0] = new int[10]; // on week day, shuttle runs 10 times a day
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];     // on weekend, it runs twice .
        riders[6] = new int[2];

        //  Fabricating some fake data
        // Feeling lazy, didn't code



        //                                      Arrays of Three or More Dimensions
        int multidim[][][] = new int[4][10][3]; // Creates a 4 x 10 x 3 three-dimensional integer array


        //                                      Initializing Multidimensional Arrays
        int example[][] = {{2,3,4}, {5,6,7}, {8,9,10}, {34,-1,4}};      // same as example[4][3]
        // or
        int example2[][][] = {
                {{5,6}, {8,9}, {23,45}},
                {{3,5}, {4,5}, {24,67}},
                {{8,4}, {4,74}, {59,67}},
                {{2,434}, {4,24}, {24,67}},
                {{90,4}, {4,8}, {994,57}},
        };                                  // example2[5][3][2]


        // Printing out all numerical data in the above array

        int y,b,n;
        for(y=0; y<5; y++){
            for (b=0; b<3; b++){
                for (n=0; n<2; n++){
                    System.out.print(example2[y][b][n] + "\t");
                }
            }
            System.out.println();
        }

        //---------------------------Alternative Array Declaration syntax----------------------------------------

        // instead of     int zample[][] = new int[5][];
        int[][] zample = new int[5][];
        // This alternative form offers convenience when declaring several arrays at the same time

        int[] nums, nums2, nums3;       // Creates 3 arrays
        int num[], num2[], num3[];      // Also creates 3 arrays

        // This alternative form is also useful when specifying an array as a return type for a method.
        /*
                        int[]  someMeth(){
                                .....
                            }
        */

    }
}
