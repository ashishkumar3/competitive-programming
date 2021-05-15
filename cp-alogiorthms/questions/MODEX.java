import java.util.*;

public class MODEX {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {    
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solve(x, y, n));

        }
        
        sc.close();
    }

    public static long solve(int x, int y, int m) {
        
        x %= m; 
        long res = 1;

        while(y > 0) {
            if((y & 1) != 0) {
                res = res * x % m;
            }
            x = x * x % m;
            y >>= 1;
        }
        return res;
    }
}

