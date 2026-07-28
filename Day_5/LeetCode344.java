package DAY_5;

import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(s));
    }
}

class Solution2 {

    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }

}
// --------------------fastest and least memory usage-----------------
class Solution3{
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        while(i<=j/2){
            char temp = s[i];
            s[i] = s[j-i];
            s[j-i] = temp;
            i++;
        
        }
        
    }
}

public class LeetCode344 {
    public static void main(String[] args) {
        Solution s = new Solution();

        char arr[] = { 'h', 'e', 'l', 'l', 'o' };
        s.reverseString(arr);
    }

}
