package Day_6;

class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int maxSum=  nums[0];

        for(int i =0; i <nums.length ; i++){
            curSum = Math.max(curSum,curSum + nums[i]);
            maxSum = Math.max(maxSum,curSum);
        }

        return maxSum;

    }
}

class Solution2 {
    public int maxSubArray(int[] nums) {
        int maxSum= nums [0];
        int currentsum= nums[0];

        for(int i=1;i<nums.length;i++){
            if(currentsum <0){
                currentsum= 0;
            }
            currentsum= currentsum + nums[i];
            if(currentsum > maxSum){
                maxSum=currentsum;
            }
            
        }
        return maxSum;
    }
}

public class LeetCode53 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(s.maxSubArray(nums));
    }
}
