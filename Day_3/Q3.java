/*
        @
        ##
        @@@
        ####
*/

package Day_3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height for the pattern: ");
        int h = sc.nextInt();

        for(int i=1; i<=h; i++){
            
            if(i%2!=0){
                for(int j=1; j<=i; j++){
                System.out.print("@");
                }
            }
            else{
                for(int j=1; j<=i; j++){
                System.out.print("#");
                }
            }
            System.out.println();
            

        }

        sc.close();
    }
    
}
