package BinarySearch;

public class FindPivot {

    // Function to find the index of the pivot value in a rotated sorted array

        // use this when arr contains duplicates
        static int findPivotWithDuplicates(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid-1;
                }

                // if elements at middle, start, end are equal then just skip the duplicates
                if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                    // skip the duplicates
                    // NOTE: what if these elements at start and end were the pivot??
                    // check if start is pivot
                    if (arr[start] > arr[start + 1]) {
                        return start;
                    }
                    start++;

                    // check whether end is pivot
                    if (arr[end] < arr[end - 1]) {
                        return end - 1;
                    }
                    end--;
                }
                // left side is sorted, so pivot should be in right
                else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }


    public static void main(String[] args) {
        int[] arr = {3,3,3,1};

        int pivotValueIndex = findPivotWithDuplicates(arr);

        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nIndex of pivot value: " + pivotValueIndex);
    }
}
