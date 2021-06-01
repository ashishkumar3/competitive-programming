import java.util.*;

public class SortZerosOnesAndTwos {

    /*
     * Sort the elements using any algorithm.
     * TC: O(nlogn)
     */

    public static int[] sort1(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /*
     * Use count sort and count the number of 0s, 1s and 2s and place them into the array.
     * TC: O(2n)
     */

    public static int[] sort2(int[] arr) {
        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) zeroes += 1;
            else if(arr[i] == 1) ones += 1;
            else if(arr[i] == 2) twos += 1;
        }

        for(int i=0; i<arr.length; i++) {
            if(zeroes > 0) {
                arr[i] = 0;
                zeroes -= 1;
            } else if(ones > 0) {
                arr[i] = 1;
                ones -= 1;
            } else if(twos > 0) {
                arr[i] = 2;
                twos -= 1;
            }
        }

        return arr;
    }

    /*
     * Dutch National Flag Algorithm.
     * 3 way partitioning.
     * Take 3 pointers. low, mid and high. All the numbers to the left of low are 0s, all the numbers to the 
     * right of high are 2s. Rest are 1s.
     */

    public static int[] sort3(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length-1;
        int temp;

        while(mid <= high) {
            switch(arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low += 1;
                    mid += 1;
                    break;
                case 1:
                    mid += 1;
                    break;
                case 2:
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high -= 1;
                    break;
            }
        }

        return arr;
    }
    
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 1, 2, 0, 0, 0, 2};

        int[] arr2 = sort3(arr);

        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void solve(int n) {
        

    }
}

