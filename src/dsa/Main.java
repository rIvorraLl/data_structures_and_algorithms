package dsa;

import java.util.Arrays;

public class Main {

	private static int[] testArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private static int[] test2 = {};
	private static int[] test3 = { 112, 134, 1000, 1001, 2002, 2500, 2600, 3000, 40000, 41000, 100000 };

	public static void main(String[] args) {
		ArraysEx arrEx = new ArraysEx();
		System.out.println("Is array empty? " + arrEx.isEmptyArr(testArr));
		System.out.println("Is array empty? " + arrEx.isEmptyArr(test2));
		System.out.println("Size of array: " + arrEx.sizeArr(testArr));
		System.out.println("Size of array: " + arrEx.sizeArr(test2));
		System.out.println("Reversed array: " + Arrays.toString(arrEx.reverseArray(testArr)));
		System.out.println("ArraysEx push element on top: " + Arrays.toString(arrEx.pushTopOfArray(testArr, 100)));
		System.out.println("ArraysEx pop element: " + Arrays.toString(arrEx.popBottomArray(testArr)));
		System.out.println(
				"ArraysEx push element on position 2: " + Arrays.toString(arrEx.pushIndexArray(testArr, 2, 100)));
		System.out.println("Search  if integer 9 is on array, return position: " + arrEx.searchElement(testArr, 9));
		System.out.println("Search if integer 2600 is on array, return position: " + arrEx.searchElement(test3, 2600));
		System.out.println("Rotate one element clockwise: " + Arrays.toString(arrEx.rotateClockwise(testArr)));

	}
}
