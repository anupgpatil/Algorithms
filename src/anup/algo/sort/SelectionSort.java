package anup.algo.sort;

import java.util.Arrays;

public class SelectionSort {

    public static  void  main(String[] args){
        int[] arr= {0,7,6,1,3,9};
        for(int i:arr)
            System.out.print(i);
        System.out.println("");
        System.out.println("Sort");
        selectionSort(arr);
        for(int i:arr)
            System.out.print(i);
    }

    private static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallestNum = arr[index];
            arr[index] = arr[i];
            arr[i] = smallestNum;
        }
    }
}
