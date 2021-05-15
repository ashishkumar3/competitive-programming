import java.util.*;

public class TempArr {
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        System.out.println(kLargest(arr, 6, 3));
    }

    /*
     * Time complexity: O(n-k)*k
     * NOT WORKING
    */
    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {

        // int[] tempArr = new int[k];
        ArrayList<Integer> temp = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int min_idx = 0;

        // store the first k elements in the temp array
        for(int i=0; i<k; i++) {
            temp.add(arr[i]);
            if(min > arr[i]) {
                min = arr[i];
                min_idx = i;
            }
        }

        // smallest in temp array

        for(int i=k; i<arr.length; i++) {
            // if current element is greater than min then remove min from temp and add current element there.
            if(arr[i] > min) {
                temp.remove(min_idx);
                temp.add(arr[i]);
                min = Collections.min(temp);
            }
        }

        return temp;
    }
}