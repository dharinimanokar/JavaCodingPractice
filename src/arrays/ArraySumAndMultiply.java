package arrays;

import java.util.Scanner;
public class ArraySumAndMultiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int subArraysumA = 0;
		int subArraySumB = 0;
		int arr[]= new int[n];
		for(int index=0; index<n; index++) {
			arr[index] = scanner.nextInt();
 		}
		
		for(int index=0;index<n;index++) {
			if(index<(n/2)) {
				subArraysumA += arr[index];
			}else if(index >= (n/2)) {
				subArraySumB += arr[index];
			}
		}
		System.out.println(subArraysumA * subArraySumB +" ");
		
		scanner.close();
	}

}
