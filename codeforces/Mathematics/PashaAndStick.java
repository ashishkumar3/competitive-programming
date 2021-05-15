import java.util.*;

public class PashaAndStick {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        solve(t);

        sc.close();
    }

    public static void solve(int n) {
        if(n % 2 != 0) {
            System.out.println(0);
            return;
        }

        // for even length stick
        int length = n / 2;

        /*
        if(length % 2 == 0) {
            // even length division
            System.out.println(length / 2);
            return;
        }

        */
        int cases = length - 1;
        System.out.println(cases / 2);
    }
}

