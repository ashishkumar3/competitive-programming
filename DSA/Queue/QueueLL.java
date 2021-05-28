import java.util.*;

public class QueueLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front, rear;

    public QueueLL() {
        this.front = this.rear = null;
    }

    void enqueue(int key) {
        Node temp = new Node(key);
        if(this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    
    void dequeue() {
        if(this.front == null) return;
        Node temp = this.front;
        this.front = this.front.next;
        if(this.front == null) this.rear = null;
    }
    
    public static void main(String[] args) {

    }
}

