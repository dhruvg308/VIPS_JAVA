/*
3 methods of swapping : 1) temp variable
                        2) add & subtract
                        3) XOR (bitwise operator) --> binary number
 */

package Day_1;

public class _1_Swapping_num {
    static void swap_method1(int a, int b){
        int temp =a;
        a =b;
        b = temp;

        System.out.println("a= " + a + "\nb= " + b);
    }

    static void swap_method2(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a= " + a + "\nb= " + b);
    }

    static void swap_method3(int a,int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a= " + a + "\nb= " + b);
    }

// ---------------------------------- MAIN----------------------------------------
    public static void main(String args[]){
        int a= 10;
        int b= 20;
        System.out.println("INITIAL VALUES\na= " + a + "\nb= " + b + "\n");

        swap_method1(a,b);
        System.out.println();

        swap_method2(a,b);
        System.out.println();

        swap_method3(a,b);
        System.out.println();


        System.out.println("Values outside the functions");
        System.out.println("a= " + a + "\nb= " + b);
    }
}
