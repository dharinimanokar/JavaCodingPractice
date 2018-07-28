package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotatedNTimes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		while(noOfTestCases-- != 0) {
			int n =  scanner.nextInt();
			int arr[] = new int[n];
			int tempArr[] = new int[n];
			for(int index=0;index<n;index++) {
				arr[index] =  scanner.nextInt();
				tempArr[index] = arr[index];
			}
			Arrays.sort(tempArr);
			int lastNo = tempArr[tempArr.length -1];
			int rotation = 0;
			for(int index=0;index<n;index++) {
				rotation++;
				 if(lastNo == arr[index] && index!=n-1 &&arr[index] != arr[index+1]){
					break;
				}
			}
			if(rotation == n) {
				rotation = 0;
			}
			System.out.println(rotation);
		}
		
	}

}
