import java.util.*;

public class PermutationPartitions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong(); // size of the segment
        long[] arr = new long[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLong();
        }
        
        solve(arr, k);

        sc.close();
    }

    public static void solve(long[] arr, long k) {
        
        /*
         * The maximum sum of partitions will be the last k numbers in the sequence.
         * Find the number of numbers in between the largest numbers in the sequence.
         * Then take those numbers + 1 as the possible ways between 2 largest numbers.
         * Multiply the possible ways to get the final result.
         */


        // Find the largest k numbers and out of them fin the largest and the smallest one to get the range. 
        ArrayList<Integer> maxk = new ArrayList<>();
        long smallest = arr.length - k + 1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= smallest) {
                maxk.add(i);
            }
        }

        Collections.sort(maxk);
        long totalWays = 1;
        long maxkSum = arr[(int)maxk.get(0)];

        for(int i=1; i<maxk.size(); i++) {
            totalWays = mul(totalWays, (maxk.get(i) - maxk.get(i-1)), 998244353L);
            maxkSum += arr[maxk.get(i)];
        }

        System.out.println(maxkSum + " " + totalWays);
    }

    public static long mul(long a, long b, long m) {
        return mod(mod(a, m) * mod(b, m), m); 
    }

    public static long mod(long a, long m) {
        return (a % m + m) % m; 
    }
}

