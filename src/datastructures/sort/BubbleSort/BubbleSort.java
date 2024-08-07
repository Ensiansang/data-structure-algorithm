package datastructures.sort.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        for (int i = array.length-1; i>0; i--){
            for(int j= 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] myArray = {2,3,5,6,7,2,1,20,10};

        bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray)+ "\n");

        printArray(myArray);

    }

}
