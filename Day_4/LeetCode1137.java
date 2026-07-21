


class Solution {
    public int tribonacci(int n) {
        int a = 0, b=1 , c=1, i=0;

        while(i<n){
            int d = a+b+c;
            a=b;
            b=c;
            c=d;
            i++;            
        }
        return a;
        
    }
}


public class LeetCode1137{
    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.tribonacci(37));

    }
}