import java.util.*;

public class Dubstep {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String song = sc.nextLine();
        //System.out.println(removeFromStart(song));
        //System.out.println(removeFromEnd(song));
        solve(song);
        sc.close();
    }

    public static void solve(String song) {
        String str = removeFromStart(song);
        str = removeFromEnd(str);
        
        String wub = "WUB"; 
        int i = 0, j = 0, start = 0;
        String result = "";
    
        /*
         * 1) Find 2) Erase
         */

        while(i < str.length()) {
            if(j == 3) j = 0;
            if(str.charAt(i) == wub.charAt(j)) {
                if(j == 2) {
                    // erase wub
                    result += str.subtring(
                }
                j += 1;
            } else {
                j = 0;
                start = i;
            }
            i += 1;
        }

        System.out.println(str);
    }

    public static String removeFromStart(String str) {
        
        String wub = "WUB";
        boolean found = false;
        int strIndex = 0, wubIndex = 0;

        while(!found) {
            if(wubIndex == 3) wubIndex = 0;
            if(str.charAt(strIndex) == wub.charAt(wubIndex)) {
                strIndex += 1;
                wubIndex += 1;
                continue;
            }

            found = true;
        }

        return str.substring(strIndex, str.length());
    }

    public static String removeFromEnd(String str) {
        String wub = "WUB";
        boolean found = false;
        int strIndex = str.length()-1, wubIndex = wub.length()-1;
        
        while(!found) {
            if(wubIndex == -1) wubIndex = wub.length()-1;
            if(str.charAt(strIndex) == wub.charAt(wubIndex)) {
                strIndex -= 1;
                wubIndex -= 1;
                continue;
            }

            found = true;
        }

        return str.substring(0, strIndex+1);
    }
}

      
