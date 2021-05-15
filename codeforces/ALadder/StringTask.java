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
        for(int i=0; i<word.length(); i++) {
            char ch = w.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                :
        }
    }
}

