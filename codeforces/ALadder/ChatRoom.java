import java.util.*;

public class ChatRoom {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        solve(word);
        sc.close();
    }

    public static void solve(String word) {
        String hello = "hello";
        int i = 0, j = 0;

        while(i < hello.length() && j < word.length()) {
            if(hello.charAt(i) == word.charAt(j)) {
                i += 1;
            } 

            j += 1;
        }

        if(i == hello.length()) System.out.println("YES");
        else System.out.println("NO");
    }
}

