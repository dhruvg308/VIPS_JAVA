package Day_5;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return mid;
               
            } 
            else if (nums[mid] > target) {
                r = mid - 1;
            } 
            else {
                l = mid + 1;
            }

        }
     return l;
    }
}

public class LeetCode35 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {1,3,5,6};
        System.out.println(s.searchInsert(nums, 7));
    }
    
}
