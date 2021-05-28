import java.util.*;

public class CircularQueue {

    private int size, front, rear;

    private ArrayList<Integer> queue = new ArrayList<>();

    public CicularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }
    
    public void enQueue(int data) {
        // add an element to the queue. Element is added on the rear side.
        // if queue is full then display queue is full and return
        if(front == 0 && rear == (size - 1) || (rear == front-1)) {
            System.out.println("Queue is full");
            return;
        }

        // if queue is empty
        if(front == -1) {
            front = 0;
            rear = 0;
            queue.add(rear, data);
        } else if(rear == size - 1 && front != 0) {
            rear = 0;
            queue.add(rear, data);
        } else {
            rear = rear + 1;
            if(front <= rear) {
                // adding new element
                queue.add(rear, data);
            } else {
                // update the element
                queue.set(rear, data);
            }
        }

    }

    public int deQueue() {
        // delete an element from the queue. Element is deleted from the front position.
        if(front == -1) {
            System.out.println("Queue is empty!");
            return -1;
        }
        
        int temp = queue.get(front);

        if(front == rear) {
            // only one element
            front = -1;
            rear = front;
        } else if(front == size - 1) {
            front = 0;
        } else front = front + 1;

        return temp;
    }
            
}

