import java.util.*;

public class StackAsLinkedList {
    
    StackNode top;

    static class StackNode {
        StackNode next;
        int data;

        StackNode(int data) {
            this.data = data;
        }
    }

    boolean isEmpty() {
        if(top == null) return true;
        return false;
    }

    void push(int data) {
        StackNode nextNode = new StackNode(data);
        if(top == null) top = nextNode;
        else {
            StackNode temp = top;
            top = nextNode;
            top.next = temp;
        }

        System.out.println(data + " pushed into the stack!");
    }

    int pop() {

        int popped = Integer.MIN_VALUE;

        // check if not underflow
        if(top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        popped = top.data;
        top = top.next;
        System.out.println(popped + " removed from the stack!");
        return popped;
    }

    int peek() {
        if(top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println("The top element in the stack is: " + top.data);
        return top.data;
    }
    
    void display() {
        StackNode temp = top;
        System.out.println();
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackAsLinkedList stack = new StackAsLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        stack.pop();
        stack.pop();
        stack.peek();

        if(stack.isEmpty()) System.out.println("Stack is empty!");
        else System.out.println("Stack is not empty!");

        stack.display();
    }
}

