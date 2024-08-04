package datastructures.dummyQuestion;

import java.util.HashMap;

public class Main {

//    public static boolean itemInCommon(int[] Array1, int[] Array2){
//        for (int i : Array1){
//            for(int j : Array2){
//                if (i == j)
//                    return true;
//            }
//        }
//    return false;
//    }

    public static boolean itemInCommon(int[] Array1, int[] Array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : Array1){
            myHashMap.put(i, true);
        }
        for(int j : Array2){
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }



    public static void main(String[] args){
        int[] Array1 = {1,3,5};
        int[] Array2 = {2,4,5};

        System.out.println( itemInCommon(Array1,Array2));

    }

}
