/**
 * 
 */
package mathematics;

import java.util.Scanner;

/**
 * @author ashishkumar
 *
 */
public class NewYear {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        System.out.println(solve(n, k));
    }

    public static int solve(int n, int k) {
        int avail_time = 240 - k;
        int count = 0;
        int total_time = 0;

        for(int i=1; i<=n; i++) {
            total_time += 5 * i;
            if(total_time > avail_time) break;

            count+=1;
        }

        return count;
    }
}
