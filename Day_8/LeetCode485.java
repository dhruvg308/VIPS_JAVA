package Day_8;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count=0;

        for(int i=0; i<nums.length; i++){
            
            if(nums[i]==1){
                count+=1;
            }
            else{
                if(count>maxCount) {maxCount = count;}
                count=0;
            }
        }

        return Math.max(count,maxCount);
    }
}


class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int num:nums){
            if(num==1){
                count++;
                max=Math.max(max,count);
            }
            else count=0;
        }
        return max;
    }
}


public class LeetCode485 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {1,1,0,1,1,1};

        System.out.println(s.findMaxConsecutiveOnes(arr));
    }
}
