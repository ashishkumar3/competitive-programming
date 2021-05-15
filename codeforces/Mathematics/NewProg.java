/**
 * 
 */
package mathematics;

import java.util.Scanner;

/**
 * @author ashishkumar
 *
 */
public class NewProg {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0; i<x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(solve(a, b, n));
        }

        sc.close();
    }

    public static int solve(int a, int b, int n) {

        int operations = 0;

        if(a > n || b > n) return operations;

        while(true) {
            if(a > b) {
                b += a;
                operations += 1;
            } else {
                a += b;
                operations += 1;
            }

            if(a > n || b > n) {
                break;
            }
        }

        return operations;
    }
}
