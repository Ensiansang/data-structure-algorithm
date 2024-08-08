package datastructures.sort.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j > -1 && temp<array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j--;
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
        int[] myArray = {4,2,6,5,1,3};

        insertionSort(myArray);

        System.out.println(Arrays.toString(myArray)+ "\n");

        printArray(myArray);

    }


}
