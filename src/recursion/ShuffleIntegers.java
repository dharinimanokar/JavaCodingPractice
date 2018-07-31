package recursion;

import java.util.Scanner;

public class ShuffleIntegers {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int noOfTestCases = scanner.nextInt();
	 while(noOfTestCases-- != 0) {
		 int n = scanner.nextInt();
		 int[] arr = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i] = scanner.nextInt();
		 }
		 shuffle(arr, 0, n/2);
	 }
	 scanner.close();
 }

private static int[] shuffle(int[] arr, int i, int n) {
	
	    if(n==arr.length) {
		  return arr;
	    }
		System.out.print(arr[i]+" ");
		System.out.print(arr[n]+" ");
		i++;
	    return shuffle(arr, i , (arr.length/2)+i);
}

}
