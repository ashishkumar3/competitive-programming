/**
 * 
 */

import java.util.Scanner;

/**
 * @author ashishkumar
 *
 */
public class NewYearsNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
        	int n = sc.nextInt();
        	System.out.println(solve(n));
        }

        sc.close();
	}
	
	public static String solve(int n) {
		
	    int a = n / 2020; // number of 2020s we have used
        int b = n % 2020; // number needed to be added to make the sum 

        if(a >= b) return "YES";
        return "NO";
	}
}
