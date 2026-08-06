package Day_7;

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i : nums) {

            int digitCount = (int) (Math.log10(i)) + 1; // counting digits

            if (digitCount % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}

class Solution2 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            int count = 0;

            while (i != 0) { // counting digits
                i /= 10;
                count++;
            }

            if (count % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }

}

class Solution3 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            if (Integer.toString(i).length() % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

}

public class LeetCode1295 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(s.findNumbers(nums));

        Solution2 s2 = new Solution2();
        System.out.println(s2.findNumbers(nums));

        Solution3 s3 = new Solution3();
        System.out.println(s3.findNumbers(nums));

    }
}
