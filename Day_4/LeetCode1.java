/*
===============================================================================
1. Two Sum (Easy)
===============================================================================

Given an array of integers nums and an integer target, return the indices
of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may
not use the same element twice.

You can return the answer in any order.

Example 1:
Input:  nums = [2,7,11,15], target = 9
Output: [0,1]

Explanation:
Because nums[0] + nums[1] == 9, we return [0,1].

Example 2:
Input:  nums = [3,2,4], target = 6
Output: [1,2]

Explanation:
Because nums[1] + nums[2] == 6, we return [1,2].

Example 3:
Input:  nums = [3,3], target = 6
Output: [0,1]

Explanation:
Because nums[0] + nums[1] == 6, we return [0,1].

Constraints:
2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.

Follow-up:
Can you come up with an algorithm that is less than O(n²) time complexity?

===============================================================================
================= Given Code: ================================================
class Solution {
    public int[] twoSum(int[] nums, int target) {

    }
}
*/

import java.util.Arrays;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{};
    }
}

//--------------------------------------------------------------------
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i] == target){
                    return new int[]{j-i,j};
                }
            }
        }
        
        return null;
    }
}

//--------------------------------------------------------------------
class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        System.gc();
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if((nums[j]+nums[j-i])==target){
                    return new int[] {j,j-i};
                }
            }
        }
        return null;
    }

}




//-----------------MAIN---------------------------------------------------

public class LeetCode1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        //int nums[] = {2,7,11,15};

        System.out.println(Arrays.toString(s.twoSum(new int[]{2,7,11,15},9)));
    }
}
