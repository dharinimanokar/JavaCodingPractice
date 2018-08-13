package arrays;

import java.util.Scanner;

public class RotateArray {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] arr = new int[n];
	int[] rotatedArray = new int[n];
	for(int index =0 ;index<n;index++) {
		arr[index] = scanner.nextInt();
	}
    int rotation = scanner.nextInt();
    rotation = rotation % n;
    int[] tempArr = new int[rotation];
    for (int index = 0;index< rotation;index++) {
    	tempArr[index] = arr[index];
	}
    for (int index = rotation, resultIndex = 0;index< n;index++,resultIndex++) {
    	rotatedArray[resultIndex] = arr[index];
	}
    for (int index = 0, resultIndex = n-tempArr.length;index< tempArr.length;index++,resultIndex++) {
    	rotatedArray[resultIndex] = tempArr[index];
	}
    for (int index = 0;index< rotatedArray.length;index++) {
    	System.out.println(rotatedArray[index]);
	}
	
}
}
