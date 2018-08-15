package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr  = new int[n];
		for(int  i = 0; i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int serachableElement  = scanner.nextInt();
		if(arr[0] == serachableElement)
			System.out.println(0);
		else 
			System.out.println(exponentialSearch(arr,serachableElement,0,1,2));
		scanner.close();
	}

	private static int exponentialSearch(int[] arr, int serachableElement, int start, int end, int blockSize) {
		int index = -1;
		if(start >= arr.length)
			return -1;
		if(serachableElement < arr[end]) {
			return Arrays.binarySearch(arr,start,end,serachableElement);
		}if(serachableElement > arr[blockSize]) {
			start = end +1;
			end = end + (int) Math.pow(blockSize, 2);
			if(end >= arr.length)
				end = arr.length-1;
			return exponentialSearch(arr, serachableElement, start, end,  (int) Math.pow(blockSize, 2));
		}
		return index;
	}
	
}
