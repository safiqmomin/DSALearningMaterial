package BinarySearch2D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] matrix ={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(binarySearch(matrix, 37)));
        
        int[][] arr ={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(bS2(arr, 2)));
    }

    static int[] binarySearch(int [][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r, c};
            }
            if (matrix[r][c] < target){
                r++;
            }
            if (matrix[r][c] > target){
                c--;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] bS2(int[][] matrix, int target){
        int sR = 0;
        int eR = matrix[0][0] - 1 ;



        return new int[]{-1, -1};
    }

    static int searchAscInsert(int[] nums, int target, int start, int end){
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
