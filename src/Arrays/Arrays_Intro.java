package Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        //                                          Arrays
        /*              Array is a collection of variables of the same type, referred to by a common name.
                In Java, arrays can have one or more dimensions, although the one-dimensional array is the most
                common one.
                The principal advantage of an array is that it organizes data in such a way that it can be easily
                manipulated.
                Also, arrays organize data in such a way that it can be easily sorted.
        *   Note: In Java, Arrays are implemented as objects. Therefore, one should have knowledge on objects(classes)


         */
        //                                  One - dimensional array

        int sample[] = new int[10];   // implemented as an object.
        /*          The above array is named sample of type, int. and size of 4 elements.
            The sample var holds a reference to the memory allocated by 'new'
            Array could be declared and initialized as:

            int sample[];
            sample = new int[4];


                An individual element in an array is accessed by use of an index. An index describes the position
                of an element within an array.
                Arrays are indexed from 0
        * */

        for (int i=0;i<10; i++){
            sample[i] = i;
        }

        for (int i =0; i<10; i++){
            System.out.println("This is sample[" + i + "] : " + i);
        }



        // The following program finds the maximum and minimum values stored in an array.
        int nums[];
        nums = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 278;
        nums[9] = 49;

        min = max = nums[0];    // sets both min and max to the first array element

        for(int i =0; i<10;i++){
            if (nums[i] < min) min=nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("max num = " + max);
        System.out.println("min num = " + min);



        //                              Another way
        /*          Arrays can be initialized when they are created.
        *       type array_name[] = {val1, val2, ..., valN}
        *
        *   Java automatically allocates an array large enough to hold the initializer that you specify.
        *   There is no need to explicitly use the 'new' operator.  */

    }
}
