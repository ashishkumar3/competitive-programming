import java.util.*;

public class QueueUsingStacks {
    /*
     * Take 2 stacks, use 1st for pushing the elements and the 2nd for popping the elements.
     * If the 2nd stack is empty then take all the elements in the 1st stack and push them into the 2nd stack.
     */

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public static void push(int n) {
        stack1.push(n); 
    }

    public static int pop() {
        if(stack1.empty() && stack2.empty()) return -1;

        if(s2.empty()) {
            while(!s1.empty())
                s2.push(s1.pop());
        }

        return s2.pop();
    }
}

