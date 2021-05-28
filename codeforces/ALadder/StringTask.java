import java.util.*;

public class StringTask {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String word = sc.nextLine();

        solve(word);

        sc.close();
    }

    public static void solve(String word) {
        String w = word.toLowerCase(); 
        int i = 0;
        while(i < w.length()) {
            char ch = w.charAt(i);

            if(isVowel(ch)) {
                w = w.substring(0, i) + w.substring(i+1, w.length());
            } else i += 1;
        }

        for(int j=0; j<w.length(); j++) {
            System.out.print("." + w.charAt(j));
        }
    }

    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') return true;
        return false;
    }
}

