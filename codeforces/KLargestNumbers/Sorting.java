import java.util.*;

public class Sorting {
   
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        System.out.println(kLargest(arr, 6, 3));
    }

    /*
    * Time complexity: O(nLogn)
    */

    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        Arrays.sort(arr);

        ArrayList<Integer> max_values = new ArrayList<>();
        for(int i=arr.length-1; i>arr.length-k-1; i--) {
            max_values.add(arr[i]);
        }

        return max_values;
    }
}
