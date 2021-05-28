import java.util.*;

public class WeirdAlgorithm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        solve(t);
        sc.close();
    }

    public static void solve(long n) {
        
        while(n != 1) {
            System.out.print(n + " ");
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        }

        System.out.print(1);
    }
}

