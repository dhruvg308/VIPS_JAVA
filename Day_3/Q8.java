// Q8. find the number of factors of the given number

package Day_3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The factors of the given number are: ");

        for(int i=1; i<=n; i++){
            if(n%i==0) {
                System.out.print(i + ", ");
            }
        }


        sc.close();
    }
    
}
