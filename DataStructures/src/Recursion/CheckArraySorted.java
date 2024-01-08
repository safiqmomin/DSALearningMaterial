package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,5,6,7,8,9};
        //System.out.println(isSorted(nums, 0));
        //System.out.println(isPresent(nums, 0, 5));
        ArrayList<Integer> list = new ArrayList<Integer>();
        indexes(nums, 5, 0);

        for (int n : list){
            System.out.println(n);
        }
    }

    static boolean isSorted(int[] nums, int index){
        if (index == nums.length - 1){return true;}

        return nums[index] <= nums[index + 1] && isSorted(nums, index + 1);
    }

    static boolean isPresent(int[] nums, int index, int target){
        if (index >= nums.length){
            return false;
        }
        return nums[index] == target || isPresent(nums, index + 1, target);
    }

    static ArrayList<Integer> list = new ArrayList<Integer>();
    static void indexes(int[] nums, int target, int index){
        if (index == nums.length){
            return;
        }
        if (nums[index] == target){
            list.add(index);
        }
        indexes(nums, target, index + 1);
    }
}
