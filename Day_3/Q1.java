// Q1. take a number and print all prime number till that number

package Day_3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int j = 2; j <= n; j++) {
            boolean flag = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                flag = false;
                break;
                }
             }

            if (flag) System.out.print(j + " ");

        }
        sc.close();
    }
}
