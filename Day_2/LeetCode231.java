/*
===============================================================================
231. Power of Two (Easy)
===============================================================================

Given an integer n, return true if it is a power of two. Otherwise,
return false.

An integer n is a power of two if there exists an integer x such that
n == 2^x.

Example 1:
Input:  n = 1
Output: true

Explanation:
2^0 = 1

Example 2:
Input:  n = 16
Output: true

Explanation:
2^4 = 16

Example 3:
Input:  n = 3
Output: false

Constraints:
-2^31 <= n <= 2^31 - 1

Follow-up:
Could you solve it without loops/recursion?

===============================================================================
================= Given Code: ================================================
class Solution {
    public boolean isPowerOfTwo(int n) {

    }
}
*/

package Day_2;

// ---------------------- not recommended--------------------
class Solution {
    public boolean isPowerOfTwo(int n) {
        if((n%2 != 0 && n!=1) || n<0) return false;
  
        boolean flag = false;
        int i=0;

        while(flag!=true && i<=n/2){  
            if(Math.pow(2,i)==n){
                flag= true;
                break;
            }
            i++;
        }
        
        if(flag==true) return true;
        else return false;  

    }
}

class Solution2 {
    public boolean isPowerOfTwo(int n) {
        //if((n%2 != 0 && n!=1) || n<0) return false;
  
        if(n<=0) return false;
        while(n%2==0){
            n/=2;
        }

        return n==1;

    }
}
//------------------------without loops and recursion------------------------------
class Solution3 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;           // a power of two has only one bit=1 in its binary representaion
    }                                                // and when the num of power of 2 is subtracted by num-1 then we get 0
}

class Solution4 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && 1073741824 % n == 0;
    }
}

public class LeetCode231 {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.isPowerOfTwo(2147483646);
        System.out.println("The answer is: " + ans);

        Solution2 s2 = new Solution2();
        System.out.println(s2.isPowerOfTwo(21474860));

        Solution3 s3 = new Solution3();
        System.out.println(s3.isPowerOfTwo(21474860));

        Solution4 s4 = new Solution4();
        System.out.println(s4.isPowerOfTwo(21474860));
    }
    
}
