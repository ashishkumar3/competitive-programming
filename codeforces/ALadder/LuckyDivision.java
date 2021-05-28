import java.util.*;

public class LuckyDivision {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        solve(t);
        sc.close();
    }
    
    /*
     * Loop through 1 to n, and check if i is lucky then find n % i == 0
     */
    public static void solve(int n) {

        for(int i=1; i<=n; i++) {
            if(isLucky(i) && n % i == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static boolean isLucky(int i) {
        if(i % 4 == 0 || i % 7 == 0) return true;

        while(i > 0) {
            int last = i%10;

            if(last != 4 && last != 7) return false;

            i /= 10;
        }

        return true;
    }
}

