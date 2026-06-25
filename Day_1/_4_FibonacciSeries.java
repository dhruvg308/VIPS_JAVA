// 0 1 1 2 3 5 8 13 21 34 .......

package Day_1;

public class _4_FibonacciSeries{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        int n=0;
        while(n<10){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
            n++;

        }
    }

}