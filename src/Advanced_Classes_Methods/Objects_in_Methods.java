package Advanced_Classes_Methods;

//          objects can be passed to methods

class Block{
    /* stores the dimensions of a three-dimensional block. */
    int a, b, c;
    int volume;

    //constructor
    Block(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    // some methods
    public boolean sameBlock(Block ob){         // the parameter passed into this method
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Return true if ob has the same volume.
    public boolean sameVolume(Block ob){
        if (ob.volume == volume) return true;
        else return false;
    }
}


public class Objects_in_Methods {
    public static void main(String[] args) {

        Block box1 = new Block(10, 4, 5);
        Block box2 = new Block(10, 4, 5);
        Block box3 = new Block(20, 2, 5);

        System.out.println("box1 has same dimensions as box2: " + box1.sameBlock(box2));
        System.out.println("box1 has same dimensions as box3: " + box1.sameBlock(box3));
        System.out.println("\nbox1 has same Volume as box3: " + box1.sameVolume(box3));
    }
}
