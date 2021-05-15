/**
 * 
 */
package mathematics;

import java.util.Scanner;

/**
 * @author ashishkumar
 *
 */
public class VasyaAndSocks {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(solve(n, m));
		
		sc.close();
	}
	
	public static int solve(int n, int m) {
		
		int count = 0, i = 1;
		while(n > 0) {
			
			count += 1; // days count
			n -= 1; // one pair of sock used
			
			if(i % m == 0) {
				n += 1;
			}
			i += 1;
		}
		
		return count;
	}
}
