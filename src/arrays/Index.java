package arrays;

import java.util.Scanner;

public class Index {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int noOfTc = scanner.nextInt();
	while(noOfTc-- != 0) {
		 int n = scanner.nextInt();
		  int[] arr = new int[n];
		  for(int index = 0;index<n;index++) {
			  arr[index] = scanner.nextInt();
		  }
		  int searchEle = scanner.nextInt();
		  System.out.print(leftSearch(arr,searchEle,0)+" ");
		  System.out.print(rightSearch(arr,searchEle,arr.length-1)+" ");
	}
	scanner.close();
}

private static int rightSearch(int[] arr, int searchEle, int searchIndex) {

	int index = -1;
	if(searchIndex == -1) {
		return index;
	}
		if(searchEle == arr[searchIndex])
			index= searchIndex;
		else {
			index = rightSearch( arr,  searchEle,  searchIndex-1);
		}
	return index;

}

private static int leftSearch(int[] arr, int searchEle, int searchIndex) {
	int index = -1;
	if(searchIndex > arr.length) {
	 return index;
	}
		if(searchEle == arr[searchIndex])
			index = searchIndex;
		else {
			index = leftSearch( arr,  searchEle,  searchIndex+1);
		}
	
	return index;
}

}
