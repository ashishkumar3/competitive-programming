import java.util.*;

public class Chocolate {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        for(int i=0; i<t; i++) {
            arr[i] = sc.nextInt();
        }

        solve(arr);

        sc.close();
    }

    public static void solve(int[] arr) {
        int count = 0;
        long total = 1;
        int nuts = 0;

        for(int i=0; i<arr.length; i++) if(arr[i] == 1) nuts += 1;

        if(nuts <= 1) {
            System.out.println(nuts);
            return;
        }

        // find the number of 0s in between 1s.
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                if(!stack.empty()) {
                    int distance = i - stack.peek();
                    total *= distance;
                }
                stack.push(i);
            }
        }

        System.out.println(total);
    }
}

