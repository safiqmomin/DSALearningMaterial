package Sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        mergeSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int start, int end){
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid, end);

            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {


    }


}
