import java.util.*;

public class MissingNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long[] arr = new long[(int)t];
        
        for(int i=0; i<arr.length-1; i++) {
            long num = sc.nextLong();
            arr[(int)num - 1] += 1;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                System.out.println(i+1);
                break;
            }
        }

        sc.close();
    }

    public static void solve(long[] arr) {
        
        long expectedSum = (arr.length * (arr.length + 1)) / 2;
        long actualSum = 0;
        for(int i=0; i<arr.length; i++) actualSum += arr[i];
        System.out.println(expectedSum - actualSum);
    }
}

