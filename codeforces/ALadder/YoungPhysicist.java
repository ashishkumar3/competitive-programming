import java.util.*;

public class YoungPhysicist {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = {0, 0, 0}; 

        while(t-- > 0) {
            for(int i=0; i<3; i++)
                arr[i] += sc.nextInt();
        }
        
        if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) System.out.println("YES");
        else System.out.println("NO");

        sc.close();
    }

    public static int solve(int n) {

        return 0;
    }
}

