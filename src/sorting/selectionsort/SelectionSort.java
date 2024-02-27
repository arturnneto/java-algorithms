package sorting.selectionsort;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        // Iterates through the array using its indexes
        for (int i = 0; i < array.length; i++) {
            // Stores the minimum index that the value can occupy
            int minIndex = i;
            // Iterates through the array again, comparing values to determine if an item will swap place with another
            for (int j = i + 1; j < array.length; j++) {
                // If a value bigger than the one we are analyzing, we will save its index in minIndex
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            /*
            This three lines of code are used to swap the items places when needed, and it will only be executed
            if minIndex is not equal to i. For example, if we iterated through the list and there was not a bigger value
            than the one we are analyzing, it is already sorted, and we do not need to do any operations with it.
             */
            if (i != minIndex) {
                // If it is going to be changed, we save the previous i position in a temporary variable
                int temp = array[i];
                // Then we send i to the index it should occupy
                array[i] = array[minIndex];
                // And finally we
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
