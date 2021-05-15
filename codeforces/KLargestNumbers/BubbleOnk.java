// package KLargestNumbers;

import java.util.*;

public class BubbleOnk {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        System.out.println(kLargest(arr, 6, 3));
    }

    /*
     * Works in O(nk) complexity but gives TLE on geeksforgeeks
    */

    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
       // use bubble sort to run the outer loop k times
       
       for(int i=0; i<k; i++) {
           for(int j=0; j<arr.length - i - 1; j++) {
               if(arr[j] > arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       
       ArrayList<Integer> max_values = new ArrayList<>();
           
        for(int z=arr.length-1; z > arr.length-k-1; z--) {
            max_values.add(arr[z]);
        }
        
        return max_values;
    }
}