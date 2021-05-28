import java.util.*;

public class GameWithSticks {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();

        solve(t, n);

        sc.close();
    }

    public static void solve(int n, int m) {
/*        
        if(n == 1 || m == 1) {
            System.out.println("Akshat");
            return;
        }

        int total = n + m;

        int turn = 1;

        while(total > 1) {
            total -= 2;
            turn += 1;
        }

        if(turn%2 == 0) System.out.println("Akshat");
        else System.out.println("Malvika");
        */

        if(Math.min(n, m)%2 != 0) System.out.println("Akshat");
        else System.out.println("Malvika");
    }
}

