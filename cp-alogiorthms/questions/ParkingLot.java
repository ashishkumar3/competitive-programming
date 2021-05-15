import java.util.*;

public class ParkingLot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        System.out.println(solve(t));

        sc.close();
    }

    public static long solve(int n) {

        return factorial(n) * (2 * n - 2);
    }

    public static long factorial(int n) {
        if(n <= 1) return 1;

        return factorial(n-1) * n;
    }

}

