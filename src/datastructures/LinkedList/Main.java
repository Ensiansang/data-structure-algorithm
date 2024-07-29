package datastructures.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
         myLinkedList.append(2);
        myLinkedList.append(3);
          myLinkedList.append(4);
        //myLinkedList.insert(1, 1);
        // myLinkedList.set(2, 22);
        //myLinkedList.remove(2);
        myLinkedList.reverse();
        // System.out.println(myLinkedList.get(2).value + "\n");
        //myLinkedList.prepend(1);
        // myLinkedList.removeFirst();
        //myLinkedList.remove();
        // (2) items - Returns 2 Node
        //System.out.println(myLinkedList.removeFirst().value);
        // (1) item - Returns 1 Node
        //System.out.println(myLinkedList.removeFirst().value);
        // (0) items - Returns null
        //System.out.println(myLinkedList.removeFirst());
//    myLinkedList.getHead();
//    myLinkedList.getTail();
//    myLinkedList.getLength();
        myLinkedList.printList();


    }
}