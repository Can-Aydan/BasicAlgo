import java.util.Scanner;

public class binarySearch {

	public static boolean binSearch(int[] arrBinary, int key) {
		boolean isFound = false;
		int firstIndex, lastIndex, midIndex;

		firstIndex = 0;
		lastIndex = arrBinary.length - 1;

		while (firstIndex <= lastIndex) {

			midIndex = (firstIndex + lastIndex) / 2;

			if (arrBinary[midIndex] == key) {
				isFound = true;
				break;
			}
			if (arrBinary[midIndex] < key) {
				firstIndex = midIndex + 1;
			} else {
				lastIndex = midIndex - 1;
			}

		}
		return isFound;
	}

	public static void main(String[] args) {
		int[] arrayBinary = { 1, 2, 5, 13, 26, 56, 65, 87, 105 };
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter a number: ");
		int key = scan.nextInt();

		if (binSearch(arrayBinary, key) == true) {
			System.out.println(key + " is found.");
		} else {
			System.out.println(key + " is not found.");
		}

		scan.close();

	}

}
