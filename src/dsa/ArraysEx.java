package dsa;

import java.util.Arrays;

public class ArraysEx {

	// Is array empty

	public boolean isEmptyArr(int[] arr) {
		boolean isEmpty = arr.length == 0;
		return isEmpty;
	}

	// Size of array (count number of elements)

	public int sizeArr(int[] arr) {
		int counter = 0;
		if (isEmptyArr(arr)) {
			return 0;
		} else {
			for (int i = 0; i < arr.length; i++) {
				counter++;
			}
		}
		return counter;
	}

	// Reverse an array

	public int[] reverseArray(int[] arr) {
		int[] invertedArr = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			invertedArr[index] = arr[i];
			index++;
		}
		return invertedArr;
	}

	// Push element on top of array

	public int[] pushTopOfArray(int[] arr, int number) {
		int[] pushedArr = new int[arr.length + 1];
		pushedArr[0] = number;
		for (int i = 0; i < arr.length; i++) {
			pushedArr[i + 1] = arr[i];
		}
		return pushedArr;
	}

	// Pop element from bottom of array

	public int[] popBottomArray(int[] arr) {
		int[] poppedArr = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			poppedArr[i] = arr[i];
		}
		return poppedArr;
	}

	// Push element on index n of an array

	public int[] pushIndexArray(int[] arr, int index, int number) {
		int[] pushedArr = new int[arr.length + 1];
		int j = 0;
		for (int i = 0; i < arr.length + 1; i++) {
			if (i == index) {
				pushedArr[i] = number;
				j++;
				pushedArr[i + 1] = arr[i];
				i++;
			} else {
				pushedArr[i] = arr[j];
				j++;
			}
		}
		return pushedArr;
	}

	// Binary search: search element in array, return position index or -1 if not
	// found. The array *must* be ordered.

	public int searchElement(int[] arr, int number) {
		
		if (number > arr[arr.length - 1] || number < arr[0]) {
			return -1;
		}
		int begin = 0;
		int end = arr.length;
		int lookout = end / 2;
		while (begin != end) {
			if (arr[lookout] == number) {
				return lookout;
			} else if (arr[lookout] > number) {
				end = lookout;
				lookout = end / 2;
			} else if (arr[lookout] < number) {
				begin = lookout;
				lookout = (begin + end) / 2;
			}
		}
		return -1;
	}

	// Rotate one element in array, clockwise

	public int[] rotateClockwise(int[] arr) {
		int[] rotatedArr = new int[arr.length];
		rotatedArr[0] = arr[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			rotatedArr[i] = arr[i - 1];
		}
		return rotatedArr;
	}
}
