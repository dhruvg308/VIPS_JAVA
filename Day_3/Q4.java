// Q4. given a number , find the largest digit from the number

package Day_3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int max=0;

        while(n!=0){
            if(n%10 > max){
                max = n%10;
                n/=10;
            }
            else{
                n/=10;
            }
        }
        System.out.println("The largest digit from the number is: " + max);



        sc.close();
    }
    
}
