/*
        * * * *
          * * * 
            * *
              *
*/
package Day_1;

import java.util.Scanner;

public class _3_InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height of the Inverted pyramid: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=n-i; j++){
                System.out.print(" *");
            }
            System.out.println();

        }
        sc.close();
    }
}
