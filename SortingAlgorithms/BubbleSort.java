package selectionSort;

import java.util.Arrays;

public class BubbleSort {

	public void bubbleSorting(int[] arr) {
		boolean swap = true;
		int temp;
		while (swap == true) {
			swap = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap = true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = { 2, 6, 4, 8, 7, 1, 5, 10, 9 };
		bubbleSort.bubbleSorting(arr);
	}

}
