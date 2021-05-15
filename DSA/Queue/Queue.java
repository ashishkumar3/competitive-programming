import java.util.*;

public class Queue {

    static final int MAX = 1000;
    int[] queue = new int[MAX];
    int rear, front;
    
    public Queue() {
        this.rear = -1;
        this.front = -1;
    }

    void enqueue(int data) {
        if(front >= MAX - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        if(front == -1) {
            front += 1;
            rear += 1;
        } else front += 1;
        queue[front] = data;
        System.out.println(data + " enqueued into the queue");
    }

    int dequeue() {
        if(rear > front || (rear == -1 && front == -1)) {
            System.out.println("Queue Underflow!");
            return -1;
        }

        int popped = queue[rear];
        rear += 1;
        System.out.println(popped + " dequeued from the queue");
        return popped;
    }

    int front() {
        return front;
    }
    
    int rear() {
        return rear;
    }

    void display() {
        int i = rear, j = front; 
        System.out.println();
        while(i <= j) {
            System.out.print(queue[i] + " ");
            i += 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.dequeue();
        queue.dequeue();
        
        queue.display();

        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
    }

    public static int solve(int n) {

        return 0;
    }
}

