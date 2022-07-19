package Basics;

public class Strings_intro {
    public static void main(String[] args) {
        //                                      Constructing Strings

        //  Various ways to declare strings
        String name = new String("Prince");
        String eye_color = "brown";
        String str_copy = new String(eye_color);


        System.out.println(name);
        System.out.println(eye_color);
        System.out.println(str_copy);

        String name2 = new String("My name is "+ "prince jan "+ "kumi");

        System.out.println();


        //                                      Operating on Strings
        /*              The String class contains several methods that operate on strings.          */


        //                          The length() method     --  returns length as string as an int
        String str4 = new String("Precious");
        int length_str4 = str4.length();

        System.out.println("The length of str4:Precious is : " + length_str4);


        //                             charAt(index)        --     obtains the char at a specific index.
        String someStr = "Hello, world!";
        System.out.println(someStr.charAt(5)); // obtains the char at index 6.


        //                                          equals(str)   --  returns a boolean value
        //Returns True if  the invoking string contains the same character sequence as str

        String friend = "John";
        String friend2 = "Samson";
        boolean same_name_frends = friend.equals(friend2);
        System.out.println("My two friends have the same name: " + same_name_frends);


        //                                  compareTo(str)      -- returns an int
        // compared alphabetically: Read book for more info.
        String str5 = "hello", str6 = "ram", str7 = "hellp", str8 = "Jesus";
        System.out.println("hello and hellp : " + str5.compareTo(str7));
        System.out.println("ram and hellp : " + str6.compareTo(str7));
        System.out.println("hello and jesuss : " + str5.compareTo(str8));
        System.out.println();


        //                            indexOf(str)   returns the index of the first match of str in the invoking String
        //                      lastIndexOf(str)    returns the index of the last match of str in the invoking String
        // returns -1 on failue
        str8 = "one two three one";
        int idx = str8.indexOf("one");  // first match one is at index 0
        System.out.println("Index of first of one: " + idx);

        idx = str8.lastIndexOf("one");
        System.out.println("Index of last occurrence of one: " + idx); // last match of one is at index 14
        System.out.println();



        //                                                      Arrays of Strings
        String str_arr[] = {"This", "is", "a", "test"};

        System.out.print("Original array: ");
        for (String s : str_arr) System.out.print(s + ", ");
        System.out.println();


        // modify array
        str_arr[1] = "was";
        str_arr[3] = "test too";


        // modified array
        System.out.print("Modified array: ");
        for (String s : str_arr) System.out.print(s + ", ");
        System.out.println();

        System.out.println();



        //                                   substring(startIndex, endIndex)  - returns a new string
        String originalStr = "Hello, my name is Michael Jordan";
        String substr = new String(originalStr.substring(7, 15));

        System.out.println("original string: " + originalStr);
        System.out.println("Substring: " + substr);
        System.out.println();


        //      /                         Using String to control a switch
        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Cancelling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Command error!");
                break;
        }
    }
}
