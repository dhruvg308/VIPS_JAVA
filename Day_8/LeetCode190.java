package Day_8;

import java.util.*;

class Solution {
    public int reverseBits(int n) {
        int ans=0;

        for(int i=0; i<32; i++){
            int lastBit= n&1;
            ans = (ans<<1) | lastBit;
            n = n>>>1;

        }
        return ans;
    }
}


class Solution2 {
    public int reverseBits(int n) {
        int ans=0;

        for(int i=0; i<32; i++){
            ans = ans<<1;
            ans = ans | (n&1);
            n = n>>>1;
        }
        return ans;
    }
}

class Solution3 {
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
}

public class LeetCode190 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 43261596;

        System.out.println(s.reverseBits(n));
        // expected outcome: 964176192

        Solution3 s3 = new Solution3();
        System.out.println(s3.reverseBits(n));
    }
    
}
