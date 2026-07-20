

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
