/*
===============================================================================
1344. Angle Between Hands of a Clock (Medium)
===============================================================================

Given two numbers, hour and minutes, return the smaller angle (in degrees)
formed between the hour and the minute hand.

Answers within 10^-5 of the actual value will be accepted as correct.

Example 1:
Input:  hour = 12, minutes = 30
Output: 165

Explanation:
The minute hand points at 180°.
The hour hand points at 15°.
The smaller angle between them is 165°.

Example 2:
Input:  hour = 3, minutes = 30
Output: 75

Explanation:
The minute hand points at 180°.
The hour hand points at 105°.
The smaller angle between them is 75°.

Example 3:
Input:  hour = 3, minutes = 15
Output: 7.5

Explanation:
The minute hand points at 90°.
The hour hand points at 97.5°.
The smaller angle between them is 7.5°.

Constraints:
1 <= hour <= 12
0 <= minutes <= 59

===============================================================================
================= Given Code: ================================================
class Solution {
    public double angleClock(int hour, int minutes) {

    }
}
*/

class Solution {
    public double angleClock(int hour, int minutes) {

        int m = 6*minutes;
        double h = 30*hour + 0.5*minutes;

        double angle = Math.abs(h - m);

        return Math.min(angle, 360.0 - angle);
    }
}

public class LeetCode1344{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.angleClock(12,30));

        
    }
}