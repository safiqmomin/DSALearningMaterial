package BinarySearch;

import java.util.Arrays;

public class BSQuestions {
    public static void main(String[] args) {
        BSQuestions obj = new BSQuestions();
        int[] arr = {0, 1, 0};
        System.out.println(obj.peakIndexInMountainArray(arr));
//        int[] arr = {3, 5, 7, 9, 10, 90,
//                100, 130, 140, 160, 170};
//        int target = 10;
//        System.out.println(obj.ans(arr, target));
//        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
//        int target = 7;
//        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
//        char[] letters = {'c', 'd', 'f', 'j'};
//        char ctarget = 'j';
//        System.out.println(obj.nextGreatestLetter(letters, ctarget));

//        int[] ascarr = {2, 3, 5, 9, 14, 16, 18};
//        int[] dscarr = {18, 16, 14, 9, 5, 3, 2};
//        int target = 1;
//        System.out.println(obj.searchCeilingElement(ascarr, target));
//        System.out.println(obj.searchCeilingElement(dscarr, target));
//
//        System.out.println(obj.searchFloorElement(ascarr, target));
//        System.out.println(obj.searchFloorElement(dscarr, target));
    }


    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    //https://leetcode.com/problems/find-peak-element/
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle + 1]){
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;

    }

    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + 2 * (end - start + 1);
            start = temp;
        }
        return binarySearch1(arr, target, start, end);
    }


    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int[] nums, int target, boolean firstOccurance){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if (firstOccurance){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
    public char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < letters[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }

    //checks if the array is ascending or descending
    //returns the number equal or greater to target
    public int searchCeilingElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        if (target > arr[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return target;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        if (isAsc){ return arr[start]; }
        else { return arr[end]; }
    }

    //checks if the array is ascending or descending
    //returns the greatest number equals or smallest to target
    public int searchFloorElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        if (target < arr[start]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return target;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        if (isAsc){ return arr[end]; }
        else { return arr[start]; }
    }


    //Binary Search
    static int binarySearch1(int[] nums, int target, int start, int end){
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

}
