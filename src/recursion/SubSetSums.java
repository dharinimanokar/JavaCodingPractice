package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubSetSums {
  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		while(noOfTestCases-- != 0) {
			int n= scanner.nextInt();
			int[] arr = new int[n];
			ArrayList<Integer> sumSubset = new ArrayList<Integer>();
			for(int i = 0;i<n;i++) {
				arr[i] = scanner.nextInt();
				sumSubset.add(arr[i]);
			}
			sumSubset = printSubSet(arr, 0, 1,sumSubset);
			Collections.sort(sumSubset);
			for(int i = 0;i<sumSubset.size();i++) {
				System.out.print(sumSubset.get(i)+ " ");
			}
		}
		scanner.close();
	}

	private static ArrayList<Integer> printSubSet(int[] arr, int index,int index1,ArrayList<Integer> sumSubset) {
		if(index1<arr.length) {
			
			sumSubset.add(arr[index]+arr[index1]);
			index1 = index1+1;
			sumSubset= printSubSet(arr, index, index1, sumSubset);
			return sumSubset;
		}else if(index1 == arr.length && index<arr.length){
			index++;
			index1 = index+1;
			sumSubset= printSubSet(arr, index, index1, sumSubset);
			return sumSubset;
		}
		else {
			if(arr.length >2)
			sumSubset.add(Arrays.stream(arr).sum());
			sumSubset.add(0);
			return sumSubset;
		}
		
	}
}
