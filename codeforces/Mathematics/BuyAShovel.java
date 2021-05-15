/**
 * 
 */
package mathematics;

import java.util.Scanner;

/**
 * @author ashishkumar
 *
 */
public class BuyAShovel {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        System.out.println(solve(n, k));
    }

    public static int solve(int n, int k) {

        for(int i=1; ; i++) {
            int total = n * i;
            if(total%10==0) return i;
            int change = total%10;
            if(change==k) return i;
        }
    }

}
