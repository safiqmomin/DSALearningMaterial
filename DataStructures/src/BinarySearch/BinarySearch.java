package BinarySearch;
//https://leetcode.com/problems/search-insert-position/
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 11, 12, 14, 20, 36, 48};
        //int[] arr = {48, 36, 20, 14, 12, 11, 7, 6, 4, 2};
        int target  = 7;

        System.out.println(orderAgnosticbs(arr, target));

//        if (arr[0] < arr[arr.length - 1]){
//            System.out.println(searchAscInsert(arr, target));
//        }else{
//            System.out.println(searchDescInsert(arr, target));
//        }
    }

    //find the target for ascending order array only
    //return index of target no or return -1 if doesn't exist
    static int searchAscInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middleindex = start + (end - start) / 2;
            int middle = nums[middleindex];
            if (middle == target){
                return middleindex;
            } else if (middle < target){
                start = middleindex + 1;
            } else {
                end = middleindex - 1;
            }
        }
        return -1;
    }

    //find the target for descending order array only
    //return index of target no or return -1 if doesn't exist
    static int searchDescInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middleindex = start + (end - start) / 2;
            int middle = nums[middleindex];
            if (middle == target){
                return middleindex;
            } else if (middle < target){
                end = middleindex - 1;
            } else {
                start = middleindex + 1;
            }
        }
        return -1;
    }

    //find if array is ascending or descending and find the target
    //return index of target no or return -1 if doesn't exist
    static int orderAgnosticbs(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {
            int middleindex = start + (end - start) / 2;
            int middle = nums[middleindex];
            if (middle == target){
                return middleindex;
            }
            if (isAsc) {
                if (middle < target) {
                    start = middleindex + 1;
                } else {
                    end = middleindex - 1;
                }
            }else
            {
                if (middle < target) {
                end = middleindex - 1;
            } else {
                start = middleindex + 1;
            }
            }
        }
        return -1;
    }

}
