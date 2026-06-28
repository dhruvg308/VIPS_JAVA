/*
===============================================================================
258. Add Digits (Easy)
===============================================================================

Given an integer num, repeatedly add all of its digits until the result
has only one digit. Return that single-digit result.

Example 1:
Input:  num = 38
Output: 2

Explanation:
38 -> 3 + 8 = 11
11 -> 1 + 1 = 2

Example 2:
Input:  num = 0
Output: 0

Constraints:
0 <= num <= 2^31 - 1

Follow-up:
Can you solve it without using loops or recursion and in O(1) time?

===============================================================================
================= Given Code: ================================================
class Solution {
    public int addDigits(int num) {
         
    }
}
*/

package Day_1;


class Solution{
    public int addDigits(int num){
        

        while(num>=10){
            int sum = 0;

            while(num>0){
                sum = sum + (num%10);
                num = num/10;
            }
            num=sum;
        }
        return num;
    }
}

//----------------------------------------------------------------------
class Solution2{
    public int addDigits(int num){
        if(num==0){
            return 0;
        }

        return 1+ (num-1)%9;    // digital roots
    }
}


// ------------------------------------MAIN-------------------------------

public class LeetCode258{
    public static void main(String[] args) {

        Solution s = new Solution();
        int ans = s.addDigits(5334);
        System.out.println("The sum of individual digit is: " + ans);

        Solution2 s2 = new Solution2();
        int ans2 = s2.addDigits(5334);
        System.out.println("The sum of individual digit (solution2) is: " + ans2);

        
    }
}