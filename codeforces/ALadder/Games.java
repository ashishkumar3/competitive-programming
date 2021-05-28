import java.util.*;

public class Games {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        int[] arr1 = new int[t];
        int[] arr2 = new int[t];
        
        int i=0, j=0;
        while(t-- > 0) {
            arr1[i] = sc.nextInt();
            arr2[j] = sc.nextInt();
            i += 1;
            j += 1; 
        }
        
        solve(arr1, arr2);
        sc.close();
    }

    public static void solve(int[] arr1, int[] arr2) {
        
        // arr1 = [100, 42, 5, 100]
        // arr2 = [42, 100, 42, 5]
        int num = 0;

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    num += 1;
                }
            }
        }

        System.out.println(num);
    }
}

