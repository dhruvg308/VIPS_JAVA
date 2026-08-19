package Day_9;

// -------------both ans almost same----------------
class Solution {
    public int findDuplicate(int[] nums) {
        // sorting the array
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i]= nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }

        return nums[nums.length-1];
    }
}

// ---------------both ans almost same------------
class Solution2 {
    public int findDuplicate(int[] nums) {
        
        int i =0;           // sorting along with checking for the duplicate number
        while(i<nums.length){
            if(nums[i] != i+1){
                    int correctIndex = nums[i]-1;
                     if(nums[i] != nums[correctIndex]){
                        int temp = nums[i];
                        nums[i]= nums[correctIndex];
                        nums[correctIndex] = temp;
                    }
                    else{     //checking for the duplicate number here
                        return nums[i];
                    }
            }
               
            else{
                i++;
            }
        }

        return -1;
    
    }
}



public class LeetCode287 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {1,3,4,2,2};
        System.out.println(s.findDuplicate(nums));


        Solution2 s2 = new Solution2();
        int nums2[] = {1,3,4,2,2};
        System.out.println(s2.findDuplicate(nums2));
    }
    
}
