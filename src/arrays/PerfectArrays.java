package arrays;

import java.util.Scanner;

public class PerfectArrays {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int noOfTc = scanner.nextInt();
	  while(noOfTc-- != 0) {
		  int n = scanner.nextInt();
		  int[] arr = new int[n];
		  for(int index = 0;index<n;index++) {
			  arr[index] = scanner.nextInt();
		  }
		  if(findArrayPosition(arr, 0 , n-1) == -1) {
			  System.out.println("NOT PERFECT");
		  }else {
			  System.out.println("PERFECT");
		  }
	  }
	  scanner.close();
  }

private static int findArrayPosition(int[] arr, int start, int end) {
	int index = 1;
	if(start > end) {
		return index;
	}else
	{
		if(arr[start] == arr[end]) {
			 index= findArrayPosition(arr,  start+1,  end-1);
		}else {
			return -1;
		}
		
	}
	return index;
	
}
}
