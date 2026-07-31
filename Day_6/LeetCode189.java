package Day_6;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;          // to handle the values for k greater than the array length 
        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);

    }

    private int[] rev(int[] arr, int l, int r) {
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
}

// --------------------------------very slow-----------------------
class Solution2 {
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;

        while (k >= 0) {
            int temp = nums[n];

            for (int i = n; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }
}

public class LeetCode189 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };

        s.rotate(nums, 3);

        int nums2[] = {-1};
        s.rotate(nums2, 2);
    }
}
