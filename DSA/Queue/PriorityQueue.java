import java.util.*;

public class PriorityQueue {

    static int[] H = new int[50];
    static int size = -1;

    static int parent(int i) {
        return (i-1)/2;
    }

    static int leftChild(int i) {
        return 2 * i + 1;
    }

    static int rightChild(int i) {
        return 2 * i + 2;
    }

    static void shiftUp(int i) {
        while(i > 0 && H[parent(i)] < H[i]) {
            swap(parent(i), i);

            i = parent(i);
        }
    }

    static void shiftDown(int i) {
        int maxIndex = i;
        int l = leftChild(i);
        
        if(l <= size && 
    
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

    public static int solve(int n) {

        return 0;
    }
}

