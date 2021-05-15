/**
 * 
 */
package mathematics;

import java.util.Scanner;

/**
 * @author ashishkumar
 *
 */
public class Candies {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();

            System.out.println(solve(n));
        }

        sc.close();
    }

    public static int solve(int n) {

        double x = 0;

        for(int k=2; k<=35; k++) {
            double den = Math.pow(2, k) - 1;

            if(n%den != 0) continue;

            x = n / den;

            break;
        }

        return (int)x;
    }
}
