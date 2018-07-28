package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInPendulam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		int pendulamArr[] = new int[n];
		int pendulamStartPos = (n%2 != 0) ? n/2: (n-1)/2 ;
		int pendulamPos = 0;
		int counter = 1;
		for(int index=0;index<n;index++) {
			if(index == 0) {
				pendulamPos = pendulamStartPos;
			}else if( index%2 == 1){
				pendulamPos = pendulamStartPos + counter;
			}else if(index%2 != 1) {
				pendulamPos = pendulamStartPos - counter;
				counter ++;
			}
			pendulamArr[pendulamPos] = arr[index];
		}
		System.out.print("Pendulam Array");
		for(int i=0;i<n;i++) {
			System.out.print(" "+pendulamArr[i]);
		}
		scanner.close();
	}

}
