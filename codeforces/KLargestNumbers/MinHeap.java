import java.util.*;

public class MinHeap {
    
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        System.out.println(kLargest(arr, 6, 3));
    }

    /*
     * Time complexity: O(k + (n-k)Logk), for sorted: O(k + (n-k)logk + klogk)
    */
    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<k; i++) {
            minHeap.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++) {
            if(minHeap.peek() > arr[i]) continue;
            else {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        ArrayList<Integer> max_values = new ArrayList<>();

        for(int i=0; i<k; i++){
            max_values.add(minHeap.poll());
        }

        Collections.reverse(max_values);
        return max_values;
    }
}
