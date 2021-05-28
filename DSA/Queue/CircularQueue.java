import java.util.*;

public class CircularQueue {

    private int size, front, rear;

    private ArrayList<Integer> queue = new ArrayList<>();

    public CicularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }
    
    public void enQueue(int data) {
        // if queue is full
        if(front == 0 && rear == (size - 1) || (rear == front-1)) {
            System.out.println("Queue is full");
            return;
        }

        if(rear == size - 1 && front != 0) {
            rear = 0;
            // insert the element
        }
    }

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

