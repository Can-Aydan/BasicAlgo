package selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public void selectionSorting(int[] arr) {
		int midIndex, temp;
		for (int i = 0; i < arr.length; i++) {
			midIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[midIndex]) {
					midIndex = j;
				}
			}
			temp = arr[midIndex];
			arr[midIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] arr = { 2, 0, 2, 1, 1, 0 };
	}
}
