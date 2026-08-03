package Day_7;

class Solution {
    public int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[mid]>nums[mid+1]){   //means descendig part of the array ;;  look at left ;; 
                end=mid;               // it can be the answer ;; therefore end = mid (not mid-1)
            }

            else{      // asc part of the array
                start = mid+1;
            }
            // after the while loop , start and end will point to the same element
        }
        return start;   //or end bcz both are same  
    }
}

public class LeetCode162 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[] ={1,2,1,3,5,6,4};
        System.out.println(s.findPeakElement(arr));
    }
}
