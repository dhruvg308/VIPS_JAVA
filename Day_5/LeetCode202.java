package Day_5;

class Solution {
    public boolean isHappy(int n) {
        
        while(n>=5){

            int sum=0;
            while(n!=0){
                sum = sum+ (n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}

public class LeetCode202 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isHappy(7));

    }
    
}

/*

// Floyd's Cycle Detection Algorithm (also called the Tortoise and Hare Algorithm) is used to detect a cycle without using extra memory.
class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
//while loop is not used here because initially slow and 
//fast pointer will be equal only, so the loop won't run.
        do {
//slow moving one step ahead and fast moving two steps ahead

            slow = nextSquare(slow);
            fast = nextSquare(square(fast));
        } while (slow != fast);

//if a cycle exists, then the number is not a happy number
//and slow will have a value other than 1

        return slow == 1;
    }
    
//Finding the square of the digits of a number

    private int nextSquare(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }
}
*/