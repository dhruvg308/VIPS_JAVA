package DAY_5;

import java.util.Arrays;

// ------------------------2 binary search but from same function-------------------
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = firstOcc(nums, target, true);
        int l = firstOcc(nums, target, false);

        return new int[] { f, l };

    }

    private int firstOcc(int[] nums, int target, boolean firstIndex) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                if (firstIndex) {
                    ans = mid;
                    r = mid - 1;
                }

                else {
                    ans = mid;
                    l = mid + 1;
                }
            } 
            else if (nums[mid] > target)
                r = mid - 1;

            else
                l = mid + 1;

        }

        return ans;

    }

}
//------------------------------2 binary searches ----------------------------------------
class Solution2 {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}


// ---------------------very slow------------------------ linear search
class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        int f = -1;
        int l = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (f == -1) {
                    f = i;      // first occurrence
                }
                l = i;          // keep updating last occurrence
            }
        }

        return new int[]{f, l};
    }
}

public class LeetCode34 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        System.out.println(Arrays.toString(s.searchRange(nums, target)));
    }

}
