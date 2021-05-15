import java.util.*;

public class StackWithMin extends Stack<Integer> {
   
    /*
     * In addition to the methods like push(), pop(), isEmpty(), add another method getMin() which returns
     * the minimum from the stack and all these methods have the time complexity as O(1).
     */
    
    
    Stack<Integer> min = new Stack<>();

    void push(int data) {
        super.push(data);
        if(min.size() == 0) {
            min.push(data);
        } else {
            if(min.peek() > data) {
                min.push(min.peek());
            } else {
                min.push(data);
            }
        }
    }

    int pop() {
        super.pop();
        min.pop();
    }

    int getMin() {
        return min.peek();
    } 

    void display() {
        while(min.size() > 0) {
            System.out.println(super.pop() + " | " + min.pop());
        }
    }

    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();

        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        stack.push(40); 
        stack.push(50);

        stack.display(); 

        System.out.println(stack.getMin() + " <= The min in the stack");
    }
}

