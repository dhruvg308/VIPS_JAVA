package Day_6;


class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int second = 1;

        while (second < nums.length) {
            if (nums[first] == nums[second]) {
                second++;
            } else {
                first++;
                nums[first] = nums[second];
                second++;
            }

        }
        return first + 1;
    }
}

// ----------------------------------------------------
class Solution2 {
    public int removeDuplicates(int[] nums) {
        int first = 0;

        for (int second = 1; second < nums.length; second++) {
            if (nums[first] != nums[second]) {
                first++;
                nums[first] = nums[second];
            }

        }
        return first + 1;
    }
}

public class LeetCode26 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int num[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = s.removeDuplicates(num);

        // OR --> int k = s.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
