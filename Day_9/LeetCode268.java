package Day_9;

//----------------------- USING CYCLIC SORT------------------
class Solution {
    public int missingNumber(int[] nums) {
        // sorting the array
        int i=0;
        while(i< nums.length){
           
            int correctIndex = nums[i]; 

            if(nums[i]<nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }


        // seraching for the missing element
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }


        return nums.length; 
        
    }
}

//--------------- USING DIRECT SOLUTION-------------------
class Solution2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;

        int actualSum = 0;
        for(int num : nums) actualSum += num;

        return totalSum - actualSum;
    }
}


public class LeetCode268 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[] ={3,0,1};
        System.out.println(s.missingNumber(arr));
    }
}
