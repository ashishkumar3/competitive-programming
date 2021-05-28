import java.util.*;

public class PotionMaking {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;

        while(t-- > 0) {
            n = sc.nextInt();

            System.out.println(solve(n));
        }

        sc.close();
    }

    public static int solve(int k) {
        /*
         * We want n% of magic essence and (100 - n)% if water.
         * If we pour e litres of magic essence and w litres of water then it contains,
         * (e / (e + w) ) * 100% of essence and (w / (e + w)) * 100% of water.
         */

        int steps = 1;
        int essence = 1;
        int water = 0;
        int essenceQuantity = 1;
        int waterQuantity = 0;
        
        /*        
        if(100%k != 0) return 100;

        while(true) {
            essenceQuantity = (essence * 100) / (essence + water);
            waterQuantity = (water * 100) / (essence + water);

            if(essenceQuantity == k) break;
            if(essenceQuantity > k && waterQuantity < (100 - k)) {
                water += 1;
            } else if(essenceQuantity < k && waterQuantity > (100 - k)) {
                essence += 1;

            }
            steps += 1;
        }
        */

        if(100 % k == 0) {
            return 100 / k;
        }  

        return 100;
    }
}

