import java.util.*;

public class OddDivisor {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n;
        while(t-- > 0) {
            n = sc.nextLong();

            System.out.println(optimized(n));
        }

        sc.close();

    }

        public static String solve(long n) {
            long i = 3;

            if(n % 2 != 0) return "YES";
            
            while(n % 2 ==0) {
                n /= 2;
                
                if(n == 1) break;

                if(n % 2 != 0) return "YES";
            }

            return "NO";
        }

    public static String optimized(long n) {
        if(Math.ceil(log2(n)) == Math.floor(log2(n))) {
            return "NO";
        } else return "YES";
    }

    public static long log2(long n) {
        return (long)(Math.log(n) / Math.log(2));
    }
}
