# Algorithms - Java

This folder contains a wide range of content about algorithms in Java. Additionally, this README file is also a quick review about them.  

![Big O table for sorting algorithms](https://lamfo-unb.github.io/img/Sorting-algorithms/Complexity.png)  
Useful website for checking time and space complexities: https://www.bigocheatsheet.com/  
Data Structures repository: https://github.com/arturnneto/java-data-structures

---

### Bubble Sort:
- Starts with the first item on the list.
- Compares it with the second item, and swap their places if needed.
- Then, compares the second with the third, and the comparison goes on until the item is sorted.
- We can make an analogy with bubbles saying that bigger items will "float" to the top of the data structure being sorted.
- Big Os:
  - Best Case: O(N) - When the array is already sorted;
  - Average Case: O(N^2);
  - Worst Case: O(N^2) - When the array is sorted in reverse;
  - Space Complexity: O(1).

---

### Insertion Sort:
- Starts with the second item on the list.
- It is compared with all values before it.
- If a previous value is smaller than it, we swap their places.
- The comparison goes on until the list in sorted.
- Big Os:
  - Best Case: O(N) - When the array is already sorted;
  - Average Case: O(N^2);
  - Worst Case: O(N^2) - When the array is sorted in reverse;
  - Space Complexity: O(1).

---

### Selection Sort:
- Starts with the first item on the list.
- It is going to look for the index that contains the smallest value in the array, and we will store its **index**.
- The index will be stored at a variable called minIndex.
- Then it loops starting from the next item, checking if the value in a specific index is lower than the one we are checking.
- If it is, we update the minIndex to be this specific item index.
- After the loop ends, we will have the minimum index that this item should occupy, and we will swap the values at this
index and the previous item's index.
- Big Os:
    - Best Case: O(N^2);
    - Average Case: O(N^2);
    - Worst Case: O(N^2);
    - Space Complexity: O(1).
