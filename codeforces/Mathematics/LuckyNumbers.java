import java.util.*;

public class LuckyNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        solve(t);

        sc.close();
    }

    public static void solve(int n) {
        
        long count = 0;
        long k=2;

        for(int i=1; i<=n; i++) {
            count += k;
            k *= 2;
        }

        System.out.println(count);
    }
}

