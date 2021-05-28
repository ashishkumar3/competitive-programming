import java.util.*;

public class PermutationSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        
        while(t-- > 0) {
            n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(arr));
        }

        sc.close();
    }

    public static int solve(int[] arr) {
        
        int start = 0, end = 0;
        boolean isCheckedStart = false;

        for(int i=0; i<arr.length; i++) {
            if(i+1 != arr[i]) {
                // this is not its right place
                start = i;

                for(int j=i+1; j<arr.length; j++) {
                    if(j + 1 != arr[j]) {
                        end = j;
                    }

                    if(j + 1 == arr[j]) break;
                }
    }
}

