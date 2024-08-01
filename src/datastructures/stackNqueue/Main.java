package datastructures.stackNqueue;

public class Main {

    public static void main(String[] args) {
//        Stack mystack = new Stack(2);
//
//        mystack.push(1);
//
//        mystack.pop();
        //  mystack.getTop();

        //  mystack.getHeight();

//        mystack.printStack();

        Queue myQ = new Queue(2);

        myQ.Enqueue(1);
       // myQ.Enqueue(0);

        //myQ.Dequeue();

        // (2) items - Returns 2 Node
           System.out.println(myQ.Dequeue().value);
        // (1) item - Returns 1 Node
           System.out.println(myQ.Dequeue().value);
        // (0) items - Returns null
           System.out.println(myQ.Dequeue());

//        myQ.getFirst();
//        myQ.getLast();
//        myQ.getLength();

//        System.out.println();
//
//        myQ.printQueue();






    }
}
