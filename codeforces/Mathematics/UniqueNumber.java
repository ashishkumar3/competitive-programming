import java.util.*;

public class UniqueNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;

        while(t-- > 0) {
            n = sc.nextInt();
            
            solve(n);    
        }

        sc.close();
    }

    public static void solve(int n) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0, last = 9;

        while(sum < n && last > 0) {
            arr.add(Math.min(n - sum, last));
            sum += last;
            last -= 1;
        }

        if(sum < n) {
            System.out.print(-1);
        } else {
        
        for(int i=arr.size()-1; i>=0; i--) {
            System.out.print(arr.get(i));
        }
        }
        System.out.println();

    }
}

