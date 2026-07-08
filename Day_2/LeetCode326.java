/*
===============================================================================
326. Power of Three (Easy)
===============================================================================

Given an integer n, return true if it is a power of three. Otherwise,
return false.

An integer n is a power of three if there exists an integer x such that
n == 3^x.

Example 1:
Input:  n = 27
Output: true

Explanation:
3^3 = 27

Example 2:
Input:  n = 0
Output: false

Explanation:
There is no x where 3^x = 0.

Example 3:
Input:  n = -1
Output: false

Explanation:
There is no x where 3^x = -1.

Constraints:
-2^31 <= n <= 2^31 - 1

Follow-up:
Could you solve it without loops/recursion?

===============================================================================
================= Given Code: ================================================
class Solution {
    public boolean isPowerOfThree(int n) {

    }
}
*/

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