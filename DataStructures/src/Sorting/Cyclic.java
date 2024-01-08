package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclic {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] != nums[correct]){
                swapArray (nums,correct, i);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans;
    }

    //https://leetcode.com/problems/missing-number/
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swapArray (nums,correct, i);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != j ){
                return j;
            }
        }
        return nums.length;
    }
    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swapArray(nums, i, correct);
            }else{
                i++;
            }
        }
    }

    static void swapArray(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums [second];
        nums [second] = temp;
    }
}
