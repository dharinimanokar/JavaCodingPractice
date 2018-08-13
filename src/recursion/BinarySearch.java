package recursion;

import java.util.Scanner;

public class BinarySearch {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 int[] arr = new int[n];
		 for(int i = 0 ;i< n; i++) {
			 arr[i] = scanner.nextInt();
		 }
		 int searchableElement = scanner.nextInt();
		 int start = 0;
		 int end = n;
		 int index = binarySearch(searchableElement, arr, start, end);
		 System.out.println(index);
		 scanner.close();
	 }

	private static int binarySearch(int searchableElement, int[] arr, int start, int end) {
		int index = -1;
		if(start > end)
			 return index;
		int mid = (start + end)/2;
		if(searchableElement > arr[mid]) {
			index = binarySearch(searchableElement, arr,  mid+1,  end);
		}if(searchableElement < arr[mid]) {
			index = binarySearch(searchableElement, arr,  start,  mid-1);
		}if(searchableElement == arr[mid])
			index= mid;
		return index;
	}
}
