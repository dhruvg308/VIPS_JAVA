package Day_9;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;

            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex]=temp;

            }
            else{
                i++;
            }
        }

        //seraching for the missing numbers
        List<Integer> ans = new ArrayList<>();

        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }

        return ans;
    }
}

public class LeetCode442 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = s.findDuplicates(nums);
        
        System.out.println(ans);
    }
    
}
