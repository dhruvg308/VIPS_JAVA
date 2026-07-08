package Day_2;

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}

class Solution2{
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        else if (n == 1) return true;
        else if (n %3 != 0) return false;
        else return isPowerOfThree(n/3);

}}

class Solution3{
    public boolean isPowerOfThree(int n) {      // 3^19 = 1162261467 this is the largest power that fits into 32 bit signed integer
        return n > 0 && 1162261467 % n == 0;   // 3^19 = 3^(19-k) × 3^k --> it is always divisible by 3^k.
    }
}


public class LeetCode326 {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.isPowerOfThree(303);
        System.out.println("The answer is: " + ans);

        Solution2 s2 = new Solution2();
        boolean ans2 = s2.isPowerOfThree(303);
        System.out.println("The answer is: " + ans2);

        Solution3 s3 = new Solution3();
        System.out.println("The answer is: " + s3.isPowerOfThree(303));
}
}