// given a number and reverse it

package Day_3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int reverse = 0;

        while(n!=0){
            reverse = reverse*10 + n%10;
            n/=10;
        }
        System.out.println("Reversed no.= " + reverse);
        sc.close();
    }
    
}
