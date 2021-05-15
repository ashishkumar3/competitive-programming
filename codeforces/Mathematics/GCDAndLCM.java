import java.util.*;

public class GCDAndLCM {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;

        while(t-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(optimizedGCD(a, b) + " " + lcm(a, b));
        }

        sc.close();
    }

    public static int gcd(int a, int b) {
        /*
         * gcd(a, b) = gcd(b, a % b)
         */
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        /*
         * lcm(a, b) = (a * b) / gcd(a, b)
         */ 
        return (a * b) / gcd(a, b);
    }

    public static int optimizedGCD(int a, int b) {
        /*
         * 1. If both numbers are even then factor out 2 from both.
         * 2. If one of them is even then divide it by 2.
         * 3. If both of them are odd then subtract one from the other.
         */
        if(b == 0) return a;
        if(a % 2 == 0 && b % 2 == 0) return 2 * optimizedGCD(a/2, b/2);
        if(a % 2 == 0) return optimizedGCD(a/2, b);
        if(b % 2 == 0) return optimizedGCD(a, b/2);

        if(a > b) return optimizedGCD(b, a-b);
        return optimizedGCD(a, b - a);
    }
}

