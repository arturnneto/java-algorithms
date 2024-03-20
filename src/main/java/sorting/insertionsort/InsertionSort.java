package sorting.insertionsort;
import java.util.Arrays;

/*
Insertion Sort:
- Starts with the second item on the list.
- It is compared with all values before it.
- If a previous value is smaller than it, we swap their places.
- The comparison goes on until the list in sorted.
- Big Os:
  - Best Case: O(N) - When the array is already sorted;
  - Average Case: O(N^2);
  - Worst Case: O(N^2) - When the array is sorted in reverse;
  - Space Complexity: O(1).
 */

public class InsertionSort {
    public static void insertionSort(int[] array) {
        // Iterates through the array, starting with the second item of the array
        for (int i = 1; i < array.length; i++) {
            // Stores the value of i
            int temp = array[i];
            // Stores the value before i
            int j = i - 1;
            /*
             Iterates through the list comparing the values of i and j, until i is bigger than j. j > -1 prevents j's
             index to being less than 0.
             */
            while (j > -1 && temp < array[j]) {
                // If i is smaller than j, we swap their places
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
