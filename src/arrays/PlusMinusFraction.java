package arrays;

import java.util.Scanner;

public class PlusMinusFraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = readArray(scanner, n);
		double positive = 0;
		double negative = 0;
		double zero = 0;
        
        for(int i = 0;i<n;i++){
           if(arr[i] < 0){
               negative++;
           }else if(arr[i]>0){
               positive++;
           }else if(arr[i] == 0){
               zero++;
           }
       }
		System.out.printf("%.4f%n", (positive/n));
		System.out.printf("%.4f%n", negative/n);
		System.out.printf("%.4f%n", zero/n);
	}

	private static int[] readArray(Scanner scanner, int n) {
		int arr[] = new int[n];
		for(int i =0 ; i< n; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	
}
