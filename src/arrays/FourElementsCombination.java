package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FourElementsCombination {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int noOfTestCases = scanner.nextInt();
	  while(noOfTestCases-- != 0) {
		  int n = scanner.nextInt();
		  int arr[] = new int[n];
		  for(int index=0;index<n; index++) {
			  arr[index] = scanner.nextInt();
		  }
		  int combinationNo = 2;
		  int fixedIndex = 0;
		  int variableIndex=1;
		  int temp[] = new int[combinationNo];
		  if(combinationNo == 1) {
			  for(int index=0;index<n; index++) {
				  System.out.println(arr[index]);
			  }
			  
		  }else {
			  temp[fixedIndex] = arr[fixedIndex];
			  for(fixedIndex = 0; fixedIndex<n;fixedIndex++) {
			  for(int index=variableIndex;index<n && index<combinationNo; index++) {
				  temp[index] = arr[index];
			  }
			  for(int index=0;index<combinationNo; index++) {
				  System.out.print(temp[index]+" ");
			  }
			  System.out.println();
			  variableIndex = fixedIndex+1;
			  }
		  }
		  
		  
	  }
	  scanner.close();
  }
}
