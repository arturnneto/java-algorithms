package sorting.bubblesort;
import java.util.Arrays;

/*
Bubble Sort:
- Starts with the first item on the list.
- Compares it with the second item, and swap their places if needed.
- Then, compares the second with the third, and the comparison goes on until the item is sorted.
- We can make an analogy with bubbles saying that bigger items will "float" to the top of the data structure being sorted.
- Big Os:
  - Best Case: O(N) - When the array is already sorted;
  - Average Case: O(N^2);
  - Worst Case: O(N^2) - When the array is sorted in reverse;
  - Space Complexity: O(1).
 */

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        // Iterates through the list using a specific index
        for (int i = array.length - 1; i > 0; i--) {
            // Iterates again, comparing the two loops values
            for (int j = 0; j < i; j++) {
                // If we find a bigger value than the one we are analyzing in the first loop
                if (array[j] > array[j+1]) {
                    // We swap their places
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
