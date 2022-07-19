package Arrays;

public class Array_Ref {
    public static void main(String[] args) {

        /*                                      Assigning array References
        *       As with other objects, when you assign one array reference variable to another, you are simply
        *   changing what object that variable refers to. You are not causing a copy of that array to be made,
        *   nor are you causing the contents of one array to be copied to the other. */

        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i=0; i<10; i++){
            nums1[i] = i;
        }

        for (i=0; i<10; i++){
            nums2[i] = -i;
        }

        //  Displaying the arrays

        System.out.print("Here is nums1 : ");
        for (i=0; i<10; i++) System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Here is nums2 : " );
        for (i=0; i<10; i++) System.out.print(nums2[i] + " ");
        System.out.println("\n");

        // Referencing      ------   Just Like aliases in Python
        nums2 = nums1;              //  now nums2 refers to nums1 (both are referring to the same object)

        System.out.print("Here is nums2 after assignment : " );
        for (i=0; i<10; i++) System.out.print(nums2[i] + " ");
        System.out.println();

        //      Operating on nums1 through nums2
        nums2[3] = 99;

        System.out.print("Here is nums1 after change through nums2 : " );
        for (i=0; i<10; i++) System.out.print(nums2[i] + " ");
        System.out.println();


        //                                        Using The length member...............
        /* Recall that arrays are implemented as objects. One benefit os this approach  is that each array has
            associated with it a length instance variable that contains the number of elements the array can hold.
         */
        int list[] = new int[10];
        int[] zums = {1,2,3,4};
        int[][] table = {
                {1,2,3},
                {4,5},
                {7,8,9,6}
        };

        System.out.println("length of list = " + list.length);
        System.out.println("length of zums = " + zums.length);
        System.out.println("length of table = " + table.length); // returns the length of the table array.
        System.out.println("length of table[0] = " + table[0].length); // length of the first element in table.
        System.out.println("length of table[2] = " + table[2].length);


        // Using length to initialize list
        for (int p=0; p<list.length; p++) list[p] = p*p;


        // Printing Array
        System.out.print("Here is list: ");
        for (int r=0; r<list.length; r++) System.out.print(list[i] + " ");
    }
}
