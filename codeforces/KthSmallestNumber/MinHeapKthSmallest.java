import java.util.*;

public class MinHeapKthSmallest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr, 3));
    }

    /*
     * Time complexity: O(k + (n-k)Logk), for sorted: O(k + (n-k)logk + klogk)
    */
    public static int kthSmallest(int arr[], int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<k; i++) {
            minHeap.add(arr[i]);
        }

        System.out.println(minHeap);

        for(int i=0; i<arr.length; i++) {
            if(minHeap.peek() > arr[i]) continue;
            else {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        
        System.out.println(minHeap);

        int kthSmallest = 0;
        
        return kthSmallest;
    }
}
