package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] nums = {4,5,7,4,3,7};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swapArray(nums, maxIndex, last);
        }
    }

    static void swapArray(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums [second];
        nums [second] = temp;
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }
}
