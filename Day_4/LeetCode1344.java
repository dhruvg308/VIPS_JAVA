

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