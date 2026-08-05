package Day_7;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){   //means descendig part of the array ;;  look at left ;; 
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

public class LeetCode852 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[] ={0,2,1,0};
        System.out.println(s.peakIndexInMountainArray(arr));

        
    }
    
}
