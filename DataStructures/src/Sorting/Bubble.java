package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = {4,5,7,4,3,7};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void bubbleSort(int[] nums){
        boolean swapped = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[j] < nums [j - 1]){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums [j];
                    nums [j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
    }
}
