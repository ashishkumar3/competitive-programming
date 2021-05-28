import java.util.*;

public class Repititions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        solve(str);
        sc.close();
    }

    public static void solve(String str) {
        
        int[] arr = new int[26];
            
        char ch = str.charAt(0);
        int count = 1;

        for(int i=1; i<=str.length(); i++) {
            if(i < str.length() && str.charAt(i) == ch) {
                count += 1;
                continue;
            } else {
                int curr = arr[ch%65];
                if(count > curr) arr[ch%65] = count;
                count = 1;
                ch = (i < str.length()) ? str.charAt(i) : '0';
            }
        }
        
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }

        System.out.println(max);
    }
}

