import java.util.*;

public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        
        Node n1 = new Node(100);
        Node n2 = new Node(200);

        n1.next = n2;

        Node n3 = new Node(300);
        n2.next = n3;

        Node iter = n1;

        while(iter != null) {
            System.out.print(iter.data + " -> ");
            iter = iter.next;
        }
    }
}

