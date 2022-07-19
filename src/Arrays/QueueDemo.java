package Arrays;

/*              Queue is a list in which elements csn be accessed in first-in, first-out order only.

                Thus, stacks and queues are data engines in which storage and retrieval are provided by the data
                structure itself, not manually by your program.

                In general, queues support two basic operations: put and get.

                Each put operation
                places a new element on the end of the queue. Each get operation retrieves the next
                element from the front of the queue. Queue operations are consumptive: once an
                element has been retrieved, it cannot be retrieved again.

                Arrays are often used as the underpinning for more sophisticated data structures, such
                as stacks and queues.
         */

     /*             That is, an array will provide the storage for the items put into the
                queue. This array will be accessed through two indices. The put index determines
                where the next element of data will be stored. The get index indicates at what location
                the next element of data will be obtained. Keep in mind that the get operation is
                consumptive, and it is not possible to retrieve the same element twice.

 */

class Queue{
    char q[];  //   this array holds the queue
    int putind, getind;     // the put and get indices

    //constructor
    Queue(int size){
        q = new char[size];
        putind = getind = 0;
    }

    //   methods
    void put(char ch){      // put a character into the queue
        if (putind == q.length){
            System.out.println(" - Queue is full");
            return;
        }
        q[putind++] = ch;   // the new element is stored at that [putind] and then putind is incremented.
    }

    // get a character from a queue
    char get(){                     // the get operation is consumptive. the queue can be exhausted.
        if(getind == putind){
            System.out.println("- Queue is empty");
            return (char) 0;
        }
        return q[getind++];       //  getind always indicates the location of the next element to be retrieved.
    }


}

public class QueueDemo {
    public static void main(String[] args) {

        Queue smallQ = new Queue(6);
        smallQ.put('p');
        smallQ.put('r');
        smallQ.put('i');
        smallQ.put('n');
        smallQ.put('c');
        smallQ.put('e');
        smallQ.put('.');    // the queue is full
        smallQ.put(' ');    // full
        smallQ.put('j');    // full
        System.out.println();

        // first-in, first-out

        for (int i=0; i<8; i++){
            System.out.print(smallQ.get()); // the first element in, is the first element out.
        }   // for the last iteration, the queue will be empty.

        System.out.println((char)0);        // Find out

        // Try modifying Queue to store other types of objects: ints, Strings, Booleans
    }
}
