package arrays;

import java.util.Scanner;

public class Mini_Max_Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		long sumMin = 0;
		long sumMax = 0;
		readArray(scanner, arr);
		int maxElement = arr[0];
		int minElement = arr[0];
		for (int i = 0; i < 5; i++) {
			if (minElement > arr[i]) {
				minElement = arr[i];
			} else if(maxElement < arr[i]){
				maxElement = arr[i];
			}

		}
		for (int i = 0; i < 5; i++) {
			if (arr[i] == minElement) {
				minElement = 0;
			}else {
				sumMax += arr[i];
			}
			if (arr[i] == maxElement) {
				maxElement = 0;
			}else {
				sumMin += arr[i];
			}
		}
		System.out.println(minElement);
		System.out.println(maxElement);
		System.out.println(sumMin + " " + sumMax);
	}

	private static void readArray(Scanner scanner, int[] arr) {
		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
		}
	}

}
