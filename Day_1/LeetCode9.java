package Day_2;



class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        
        int original = x;
        int reverse = 0;
        
        while(original>0){
            reverse = (reverse*10) + (original%10);
            original/=10;
        }

        if(x==reverse) return true;
        else return false;


    }
}



public class LeetCode9 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(-121));
    }
}
