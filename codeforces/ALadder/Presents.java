import java.util.*;

public class Presents {
    
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
        int[] arr2 = new int[arr.length];

        for(int i=0; i<arr2.length; i++) {
            arr2[arr[i] - 1] = i+1;
        }

        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

