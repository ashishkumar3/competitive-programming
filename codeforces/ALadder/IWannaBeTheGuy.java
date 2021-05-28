import java.util.*;

public class IWannaBeTheGuy {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = sc.nextInt();
        int[] arr1 = new int[a];

        for(int i=0; i<a; i++) {
            arr1[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arr2 = new int[b];

        for(int i=0; i<b; i++) {
            arr2[i] = sc.nextInt();
        }

        solve(arr1, arr2, n);

        sc.close();
    }

    public static void solve(int[] arr1, int[] arr2, int n) {
        
        int[] arr = new int[n];
        for(int i=0; i<arr1.length; i++) {
            arr[arr1[i]-1] += 1;
        }

        for(int i=0; i<arr2.length; i++) {
            arr[arr2[i]-1] += 1;
        }

        boolean result = true;

        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                result = false;
            }
        }

        System.out.println(result ? "I become the guy." : "Oh, my keyboard!");
    }
}

