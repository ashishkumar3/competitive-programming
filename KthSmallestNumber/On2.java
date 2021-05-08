package KthSmallestNumber;

public class On2 {
    
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr, 1));
    }

    public static int kthSmallest(int[] arr, int k) { 
        int total_itr = k;
        
        for(int i=0; i<total_itr; i++) {
            int min = arr[0];
            int min_idx = 0;
            
            for(int j=0; j<arr.length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    min_idx = j;
                }
            }
            
            arr[min_idx] = Integer.MAX_VALUE;
            if(k == 1) return min;
            k--;
        }
        return -1;
    }
}
