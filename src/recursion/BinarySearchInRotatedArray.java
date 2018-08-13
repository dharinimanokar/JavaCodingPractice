package recursion;

import java.util.Scanner;

public class BinarySearchInRotatedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int index=0;index<n;index++) {
			arr[index] = scanner.nextInt();
		}
		int element = scanner.nextInt();
		int pivot = findPivotElement(arr);
		int elementIndex = -1;
		if(element > arr[0]) {
			
			 elementIndex = binarySearchLeftSubArray(arr,element,0,pivot);
		}else {
			 elementIndex = binarySearchLeftSubArray(arr,element,pivot+1,n);
		}
		System.out.println(elementIndex);
		scanner.close();
	}

	private static int binarySearchLeftSubArray(int[] arr, int element, int start, int end) {
		int index = -1;
		if(start > end)
			 return index;
		int mid = (start + end)/2;
		if(element > arr[mid]) {
			index = binarySearchLeftSubArray(arr, element,  mid+1,  end);
		}if(element < arr[mid]) {
			index = binarySearchLeftSubArray(arr, element,  start,  mid-1);
		}if(element == arr[mid])
			index= mid;
		return index;
	}

	private static int findPivotElement(int[] arr) {
		int index = 0;
		for(int i =0 ; i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
