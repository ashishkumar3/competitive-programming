import java.util.*;

public class Power {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();

        solve(t, n);
        sc.close();
    }

    public static void solve(int a, int b) {
        long res = 1;
        int A = a;
        int B = b;

        while(B != 0) {
            if(B % 2 == 0) {
                A *= A;
                B /= 2;
            } else {
                res *= A;
                B -= 1;
            }
        }

        System.out.println(res);
    }
}

