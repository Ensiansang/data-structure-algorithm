package datastructures.HashTable;

public class Main {

    public static void main(String[] args) {

        HashTable hT = new HashTable();

        hT.set("nails", 100);
        hT.set("tile", 50);
        hT.set("lumber", 80);
        hT.set("bolts", 200);
        hT.set("screws", 140);

        System.out.println(hT.key());


//        System.out.println(hT.get("lumber"));
//        System.out.println(hT.get("tile"));
//        System.out.println(hT.get("screws"));
//        System.out.println(hT.get("test"));
        //hT.printTable();

    }


}
