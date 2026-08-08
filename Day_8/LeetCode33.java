package Day_8;

class Solution {
    public int search(int[] nums, int target) {
         int pivot = findPivot(nums);

        // if pivot not found, means the array is not rotated
        if(pivot==-1){
            return binarySearch(nums, target,0,nums.length-1);
        }

        //if pivot found, we have 2 ascending arrays
        else if (nums[pivot]== target) {
            return pivot;
        }
        else if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot-1);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }

    private int binarySearch(int[] arr , int target, int start, int end){

        while(start<=end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }

        return -1;
    }

    private int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;



        while(start<=end){
            int mid = (start + end)/2;

            if(mid<end && arr[mid]>arr[mid+1]) return mid;

            else if (mid>start && arr[mid-1]>arr[mid]) return mid-1;

            else if (arr[mid]<arr[start]) {
                end = mid-1;
            }

            else {      //arr[mid]>arr[start]
                start = mid + 1;
            }
        }

        return -1;
    }
}

public class LeetCode33 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(s.search(arr,0));

        int[] arr2 = {1,3};
        System.out.println(s.search(arr2,0));
    }
}
