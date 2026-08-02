package Day_6;

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length- 1;

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
        return -1;
    }
}

public class LeetCode704 {
    public static void main(String args[]) {
        Solution s = new Solution();
        int nums[] = { -1, 0, 3, 5, 9, 12 };
        System.out.println(s.search(nums, 8));

    }
}
