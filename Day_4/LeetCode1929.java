
import java.util.*;

class Solution1{
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }

        return ans;
    }
}

public class LeetCode1929{
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int result[] = s.getConcatenation(new int[]{1,3,2,1});
        System.out.println(Arrays.toString(result));        
    }
}