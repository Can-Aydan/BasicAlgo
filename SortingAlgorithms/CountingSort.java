package selectionSort;

import java.util.Arrays;

public class CountingSort {
	public int biggestNumber(int arrayCounting[], int length) {
		int biggest = arrayCounting[0];
		for (int i = 0; i < length; i++) {
			if (arrayCounting[i] > biggest) {
				biggest = arrayCounting[i];
			}
		}
		return biggest;
	}

	public void countSorting(int arrayCounting[], int length) {
		int result[] = new int[length + 1];
		int big = biggestNumber(arrayCounting, length);
		int countArray[] = new int[big + 1];
		for (int i = 0; i <= big; ++i) {
			// look above
			countArray[i] = 0;
		}
		for (int i = 0; i < length; i++) {
			countArray[arrayCounting[i]]++;
		}
		for (int i = 1; i <= big; i++) {
			countArray[i] += countArray[i - 1];
		}
		for (int i = length - 1; i >= 0; i--) {
			result[countArray[arrayCounting[i]] - 1] = arrayCounting[i];
			countArray[arrayCounting[i]]--;
		}
		for (int i = 0; i < length; i++) {
			arrayCounting[i] = result[i];
		}
	}

	public static void main(String[] args) {
		int arrayCounting[] = { 15, 31, 5, 13, 1, 23, 56, 65 };
		int length = arrayCounting.length;
		CountingSort countingSort = new CountingSort();
		countingSort.countSorting(arrayCounting, length);
		System.out.println(Arrays.toString(arrayCounting));
	}
}
