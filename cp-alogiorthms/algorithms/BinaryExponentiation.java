import java.util.*;

public class BinaryExponentiation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(recursiveApproach(t, n));
        System.out.println(nonRecursiveApproach(t, n));
        
        sc.close();
    }

    public static long recursiveApproach(int t, int n) {
        if(n == 0) return 1;
        
        long res = recursiveApproach(t, n / 2);
        if(n % 2 != 0) {
            // if n is odd
            return res * res * t;
        } else {
            // if n is even
            return res * res;
        }
    }

    public static long nonRecursiveApproach(int t, int n) {
        int res = 1;
        while(n > 0) {
            if((n & 1) != 0) {
                res = res * t;
            }
            t = t * t;
            n >>= 1;
        }
        return res;
    }
    
}

