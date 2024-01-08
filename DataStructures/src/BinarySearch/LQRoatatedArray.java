package BinarySearch;

public class LQRoatatedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4,5, 6, 7, 0, 1, 2};
        search(nums, 4);

    }

    static int search(int[] nums, int target) {

        int piv =  pivotSearch(nums, target, 0, nums.length-1);
        System.out.println(piv);
        return -1;
    }
    static int binarySearch1(int[] nums, int target, int start, int end){
        while (start <=  end) {
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

    static int pivotSearch(int[] nums, int target, int start, int end){
        while (start <= end) {
            int middleindex = start + (end - start) / 2;
            int middle = nums[middleindex];
            if (nums[middleindex -1] < nums[middleindex] && nums[middleindex] < nums[middleindex +1]){
                start = middleindex + 1;
            } else {
                end = middleindex - 1;
            }
        }
        return -1;
    }
}
