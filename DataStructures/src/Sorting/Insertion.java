package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] nums = {4,5,7,4,3,7,0};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] > nums[j-1]){
                    break;
                }
                while (nums[j] < nums[j-1]){
                    swapArray(nums, j, j-1);
                }

            }
        }
    }

    static void swapArray(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums [second];
        nums [second] = temp;
    }
}
