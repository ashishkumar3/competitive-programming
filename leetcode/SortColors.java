import java.util.*;

public class SortColors {
    
    public static void main(String[] args) {
    }

    public static void solve(int[] arr) {
        
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
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
    }
}

