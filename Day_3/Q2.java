// Q2. take a number and sum all number till that

package Day_3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum=0;

        for(int i=n; i>0; i--){
            sum+=i;
        }
        System.out.println("sum = "+ sum);
        sc.close();
    }
    
}
