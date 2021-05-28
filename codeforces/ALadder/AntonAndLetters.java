import java.util.*;

public class AntonAndLetters {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String set = sc.nextLine();


        solve(set);
        sc.close();
    }

    public static void solve(String set) {
        
        int[] arr = new int[26];

        for(int i=0; i<set.length(); i++) {
            if(set.charAt(i) >= 97 && set.charAt(i) <= 122) {
                char ch = set.charAt(i);
                arr[ch%97] += 1;
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= 1) count += 1;
        }

        System.out.println(count);
    }
}

