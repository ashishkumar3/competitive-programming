import java.util.*;

public class ArrivalOfTheGeneral {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        for(int i=0; i<t; i++) {
            arr[i] = sc.nextInt();
        }

        solve(arr);

        sc.close();
    }

    public static void solve(int[] arr) {
        
        int diff = 0;
        int maxi = -1, mini = -1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxi = i;
            }
            if(arr[i] <= min) {
                min = arr[i];
                mini = i;
            }
        }
        
        if(maxi < mini) diff = 0;
        else diff = 1;

        System.out.println(maxi + (arr.length  - 1 - mini) - diff);
    }
}

