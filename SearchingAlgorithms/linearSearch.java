import java.util.Scanner;

public class linearSearch {

	public static boolean linSearch(int[] arrLinear, int key) {
		boolean isFound = false;
		for (int i = 0; i < arrLinear.length; i++) {
			if (arrLinear[i] == key) {
				isFound = true;
			}
		}

		return isFound;
	}

	public static void main(String[] args) {
		int[] arrayLinear = { 2, 5, 13, 15, 26, 58, 65, 105 };
		int key;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter a Number: ");
		key = (int) scan.nextInt();

		if (linSearch(arrayLinear, key) == true) {
			System.out.println(key + " is found.");
		} else {
			System.out.println(key + " is not found.");
		}

		scan.close();
	}

}
