import java.util.*;

// Follows Last In First Out principle.
public class Stack {
    
    static final int MAX = 1000; // size of the stack
    int top;
    int[] stack = new int[MAX];

    public Stack() {
        top = -1;
    }

    public boolean isEmpty() {
        return top >= 0 ? false : true;
    }

    public void push(int a) {
        if(top >= MAX - 1) {
            // stack already filled
            System.out.println("Stack Overflow");
            return;
        }
        top += 1;
        stack[top] = a;
        System.out.println(a + " pushed into the stack");
    }

    public int pop() {
        // removes the top element
        if(!isEmpty()) {
            int topItem = stack[top];
            top -= 1;
            return topItem;
        }
        // Stack is empty, no element to remove
        System.out.println("Stack Underflow");
        return -1;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top];
    }

    public void display() {
        System.out.println();
        for(int i=0; i<=top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
        s.display();
        System.out.println("Removing top element => top: " + s.top + " item: " + s.pop());

        s.display();
        System.out.println("Top element currently is: " + s.peek());
        System.out.println("Removing top 2 elements, current top: " + s.top);

        s.pop();
        s.pop();

        System.out.println("Checking if empty?: " + s.isEmpty());
        
        System.out.println(s.top + " : top value " + s.peek() + ": top item");
        s.display();
    }
}

