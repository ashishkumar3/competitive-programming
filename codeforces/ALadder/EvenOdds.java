import java.util.*;

public class EvenOdds {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long n = sc.nextLong();

        solve(t, n);
        sc.close();
    }

    public static void solve(long n, long k) {
        
        if(n % 2 != 0) {
            if(k <= (n/2) + 1) {
                System.out.println(2*k-1);
            } else {
                System.out.println(2 * (k - (n/2) - 1));
            }
        } else {
            if(k <= n/2) {
                System.out.println(2*k-1);
            } else {
                System.out.println(2 * (k - n/2));
            }
        }

    }
}

