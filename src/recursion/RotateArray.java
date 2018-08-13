package recursion;

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
    rotatedArray = leftrotate(arr,rotation);
    for(int i = 0;i<n;i++)
    	System.out.println(rotatedArray[i]);
    scanner.close();
	
}

private static int[] leftrotate(int[] arr, int n) {
	if(n==0)
		return arr;
    int temp = arr[0];
    for (int i = 0; i < arr.length-1; i++)
        arr[i] = arr[i +1];
	arr[arr.length-1] = temp;
	return leftrotate(arr,n-1);
	
}
}
