package selectionSort;

import java.util.Arrays;

public class InsertionSort {
	public void insertionSorting(int[] arrSort) {
		int length = arrSort.length;
		int temp = 0;
		int j = 0;
		for (int i = 1; i < length; i++) {
			temp = arrSort[i];
			j = i - 1;
			while ((j > -1) && (arrSort[j] > temp)) {
				arrSort[j + 1] = arrSort[j];
				j--;
			}
			arrSort[j + 1] = temp;
		}
		System.out.println(Arrays.toString(arrSort));
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] arraySort = { 1, 56, 5, 65, 2, 87, 13, 105 };
		insertionSort.insertionSorting(arraySort);
	}
}
