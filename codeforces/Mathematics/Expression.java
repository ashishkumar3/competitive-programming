import java.util.*;

public class Expression {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(solve(a, b, c));
        
        sc.close();
    }

    public static int solve(int a, int b, int c) {
        int r1 = a + (b * c);
        int r2 = a * (b + c);
        int r3 = a * b * c;
        int r4 = (a + b) * c;
        int r5 = a + b + c;

        return Math.max(r1, Math.max(r2, Math.max(r3, Math.max(r4, r5)))); 
    }
}

