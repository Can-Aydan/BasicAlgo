package selectionSort;

import java.util.Arrays;

public class HeapSort {
	public static void heapify(int arrayHeap[], int length, int index) {
		/*
		 * if index starts at 0: The leftChild child 2*index+1 the rightChild child
		 * 2*index+2
		 * 
		 */
		int largest = index;
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;

		if (leftChild < length && arrayHeap[leftChild] > arrayHeap[largest]) {
			largest = leftChild;
		}
		if (rightChild < length && arrayHeap[rightChild] > arrayHeap[largest]) {
			largest = rightChild;
		}
		if (largest != index) {
			int temp = arrayHeap[index];
			arrayHeap[index] = arrayHeap[largest];
			arrayHeap[largest] = temp;
			heapify(arrayHeap, length, largest);
		}
	}

	public static void heapSorting(int arrayHeap[], int length) {
		for (int i = length / 2 - 1; i >= 0; i--)
			heapify(arrayHeap, length, i);
		for (int i = length - 1; i >= 0; i--) {
			int temp = arrayHeap[0];
			arrayHeap[0] = arrayHeap[i];
			arrayHeap[i] = temp;
			heapify(arrayHeap, i, 0);
		}
	}

	public static void main(String[] args) {
		int arrayHeap[] = { 45, 7, 20, 40, 25, 23, 105 };
		int length = arrayHeap.length;
		heapSorting(arrayHeap, length);
		System.out.println(Arrays.toString(arrayHeap));
	}

}
