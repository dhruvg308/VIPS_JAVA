/*
===============================================================================
171. Excel Sheet Column Number (Easy)
===============================================================================

Given a string columnTitle that represents the column title as appears in an 
Excel sheet, return its corresponding column number.

For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:
Input: columnTitle = "A"
Output: 1

Example 2:
Input: columnTitle = "AB"
Output: 28

Example 3:
Input: columnTitle = "ZY"
Output: 701

Constraints:
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].

===============================================================================
================= Given Code: ================================================
class Solution {
    public int titleToNumber(String columnTitle) {
        
    }
}
*/

package Day_2;

class Solution{
    public int titleToNumber(String columnTitle) {
        char letters[] = columnTitle.toCharArray();
        int sum=0;

        for(char ch:letters){
        sum = sum*26 + (ch - 'A' + 1);
        }

        return sum;
    }
}

public class LeetCode171 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.titleToNumber("ZY"));
    }
}