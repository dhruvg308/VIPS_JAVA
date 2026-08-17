package Day_9;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;

            if(nums[i]>0 && nums[i]<= nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }

        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }

        } 

        return nums.length +1;
    }
}

public class LeetCode41 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[] = {3,4,-1,1};
        System.out.println(s.firstMissingPositive(arr));
    }
    
}
