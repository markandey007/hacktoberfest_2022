// Jump Search Algorithm
/* Jump search (also known as block search) is an algorithm for finding the position of an element in a sorted
array. Unlike the linear search, it doesn't compare each element of an array with the target value. Instead, to
find the target value, we can represent the array as a sequence of blocks.
The optimal block size is sqrt(n), where n is the size of the array. In this case, the algorithm performs
sqrt(n) + sqrt(n) comparisons in the worst case, so the time complexity is O(sqrt(n)).
This algorithm is more efficient than the linear search algorithm. */

import java.io.*;
import java.util.*;

public class JumpSearch {
	public static void main(String[] args) {
		System.out.print("\n***To Perform Jump Search, the array must be a sorted array***\n");
		
		int[] arr = {1, 2, 6, 8, 15, 17, 33, 35, 50, 60, 89, 99, 111, 200, 254};
		System.out.println("The array is: " + Arrays.toString(arr));

		int key = 15;

		int key_idx = jumpSearch(arr, key);

		if (key_idx == -1) {
			System.out.println("\nElement " + key + " is not present in the array.\n");
		} else {
			System.out.println("\nThe element " + key + " is found at index " + key_idx + " in the array.\n");
		}

		key = 150;

		key_idx = jumpSearch(arr, key);

		if (key_idx == -1) {
			System.out.println("\nElement " + key + " is not present in the array.\n");
		} else {
			System.out.println("\nThe element " + key + " is found at index " + key_idx + " in the array.\n");
		}
	}

	// Time Complexity: O(sqrt(n))
	public static int jumpSearch(int[] arr, int key) {
		int n = arr.length;
		int blockSize = (int) Math.floor(Math.sqrt(n));
		int prevIdx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				return i;
			}
			if (arr[i] < key) {
				prevIdx = i;
				i += blockSize;
			} else if (arr [i] > key) {
				n = i;
				i = prevIdx;
			}
		}
		return -1;
	}
}
