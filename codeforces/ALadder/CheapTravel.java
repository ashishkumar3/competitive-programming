import java.util.*;

public class CheapTravel {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        solve(n, m, a, b);
        sc.close();
    }

    public static void solve(int n, int m, int a, int b) {
        
        int oneway = n * a;
        if(n%m == 0) {
            if(oneway < (n/m) * b) {
                System.out.println(oneway);
            } else {
                System.out.println((n/m)*b);
            }
        } else {
            int extra = n%m;
            if((n%m) * a + (n/m)*b < a * n) {
                System.out.println((n%m)*a+(n/m)*b);
            } else System.out.println(a * n);
        }
    }
}

