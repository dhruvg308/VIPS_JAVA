package Day_8;

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

    }

    private int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        int firstTry = orderAgnosticBS(arr, target,0, peak);
       
        if (firstTry != -1) {
        return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target,peak+1,arr.length - 1);
    }

    private int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) { // means descendig part of the array ;; look at left ;;
                end = mid; // it can be the answer ;; therefore end = mid (not mid-1)
            }

            else { // asc part of the array
                start = mid + 1;
            }
            // after the while loop , start and end will point to the same element
        }
        return start; // or end bcz both are same
    }

    private int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // checking ascending or descemding order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                if (isAsc == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (isAsc == true) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }

        return -1;
    }
}

public class LeetCode1095 {

}
