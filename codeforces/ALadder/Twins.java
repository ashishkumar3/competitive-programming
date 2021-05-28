import java.util.*;

public class Twins {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        
        for(int i=0; i<t; i++) arr[i] = sc.nextInt();

        solve(arr);

        sc.close();
    }

    public static void solve(int[] arr) {
        
        // find the sum
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        Arrays.sort(arr);
        int required = (sum / 2) + 1;
        int coins = 0;
        for(int i=arr.length-1; i>=0; i--) {
            coins += 1;
            required -= arr[i];
            if(required <= 0) {
                break;
            }
        }

        System.out.println(coins);
    }
}

