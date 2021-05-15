import java.util.*;

public class RandomTeams {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        minmax(n, m);

        sc.close();
    }

    public static void minmax(long n, long m) {
        // for 1 group min and max will be same
        if(m == 1) {
            long friends = (n * (n-1)) / 2;
            System.out.println(friends + " " + friends);
            return;
        }

        long maxFriends = (n - m + 1) * (n - m) / 2;

        // for min case we have to evenly divide them into groups
        long size = (n / m);
        long rem = n % m;

        long minFriends = rem * (size + 1) * size / 2 + (m - rem) * size * (size - 1) / 2;

        System.out.println(minFriends + " " + maxFriends);
    }
}

