import java.util.Scanner;

public class BalancedArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
 
        sc.close();
    }

    public static String solve(int n) {        
        if(n == 2) return "NO";

        int lsum = 0;
        int[] arr = new int[n];
        int i=0, curr = 2;

        while(i < n/2) {
            lsum += curr;
            arr[i] = curr;

            i++;
            curr+=2;
        }

        curr = 1;
        int rsum = 0;

        while(i < n) {
            if(lsum == rsum) {
                return "YES";
            }

            rsum += curr;
            arr[i] = curr;

            i++;
            curr+=2;
        }

        return "NO";
    }
}
