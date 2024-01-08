package Recursion;

public class Recursion {
    public static void main(String[] args) {
        //System.out.println(fibo(50));
        //System.out.println(search(new int[]{-1,0,3,5,9,12}, 0));
        printDesc(5);
    }
    static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return helper(nums, target, start, end);
    }
    static int helper(int[] nums, int target, int start, int end)
    {
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target)
        {
            return mid;
        }
        if (nums[mid] < target){
            return helper(nums, target, mid + 1, end);
        }else{
            return helper(nums, target, start, mid - 1);
        }
    }

    static void printDesc(int n){
        if (n <= 0){
            return;
        }
        System.out.println(n);
         printDesc(n-1);

    }
}
