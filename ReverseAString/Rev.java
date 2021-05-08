package ReverseAString;

public class Rev {

    public static void main(String[] args) {
        
    }

    public static String reverseWord(String str)
    {
        // with using extra space
        String str2 = new String();

        for(int i=str.length()-1; i>=0; i--) {
            str2 += str.charAt(i);
        }

        return str2;
    }

    // public static String reverseWord2(String str)
    // {
    //     // without using extra space
    //     int i=0, j=str.length()-1;

    //     while(i < j) {

    //         // swap the characters of the string
            

    //         i++;
    //         j--;
    //     }
    // }

    
}