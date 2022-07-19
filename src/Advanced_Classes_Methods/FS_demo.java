package Advanced_Classes_Methods;

//  This class implements  a 'fail-soft' array which prevents runtime errors
class FailSoftArray{
    private  int arr[];     // reference to an array
    private int  errval;    // value to return if get() fails
    public int length;      //

    //  constructor
    public FailSoftArray(int size, int errval){
        arr =new int[size];
        this.errval = errval;
        length = size;
    }

    // Return a boolean value if index is within bounds
    private boolean indexOk(int index){
        if (index >= 0 & index < length) return true;
        return false;
    }

    // return the value at a given index
    public int get(int index){
        if (indexOk(index)) return arr[index];
        return errval;      //  returns an errval when index is out of bounds. hence we prevent a runtime error.
    }

    // Put a value at an index, return false on failure.
    public boolean putValue(int index, int value){
        if (indexOk(index)){
            arr[index] = value;
            return true;
        }
        else return false;

    }
}







public class FS_demo {
    public static void main(String[] args) {

        //                                      Demo on FailSoftArray class

        FailSoftArray fs_arr = new FailSoftArray(5, -1);
        fs_arr.putValue(0, 67);
        fs_arr.putValue(1, -1);
        fs_arr.putValue(5, 2);      // should generate an error value

        System.out.println(fs_arr.get(3));
        fs_arr.putValue(3, 20);

        System.out.println(fs_arr.get(3));
        System.out.println(fs_arr.get(6));      /* under usual conditions, this statement generates a
        runtime error: Index out of bounds. This halts the program and further code isn't compiled.
            But with the Failsoft array implemented here, the code returns an error value to indicate
            index is out of bounds, then the rest of the programs keeps running */
        System.out.println("Hey, the above error didn't stop me from compiling!");


        /*
        int nums[] = {3,4};
        System.out.println(nums[3]);            This code halts the program from further compilation
         */
    }
}
