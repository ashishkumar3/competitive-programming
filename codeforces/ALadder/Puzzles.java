import java.util.*;

public class Puzzles {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        solve(arr, t);

        sc.close();
    }

    public static void solve(int[] arr, int n) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        int start = 0, end = n-1;

        Arrays.sort(arr);
        while(end < arr.length) {
            // create a window and find the min in that window.
            for(int i=start; i<=end; i++) {
                if(arr[i] <= min) min = arr[i];
                if(arr[i] >= max) max = arr[i];
            }
            
            if((max - min) < res) res = max - min;
            end += 1;
            start += 1;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
        
        System.out.println(res);
    }
}

