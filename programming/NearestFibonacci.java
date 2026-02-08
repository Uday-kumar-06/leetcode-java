import java.util.*;

public class Main {

    public static void nearestFibonacci(int n) {

        int a = 0, b = 1;
        int c = 0;
        // Edge case
        if (n == 0) {
            System.out.println(0);
            return;
        }

        // Generate Fibonacci until b >= n
        while (b < n) {
            c = a + b;
            a = b;
            b = c;
        }
        int before;
        int after;
        if(b != n){
            before = a;
            after = b; 
        }else{
            before = a;
            after = a+b;
        }

        

        int diffBefore = n - before;
        int diffAfter = after - n;

        if (diffBefore == diffAfter) {
            System.out.println(before + " " + after);
        } else if (diffBefore < diffAfter) {
            System.out.println(before);
        } else {
            System.out.println(after);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nearestFibonacci(n);
    }
}
