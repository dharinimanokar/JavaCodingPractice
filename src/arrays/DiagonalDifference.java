package arrays;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[][] = new int[n][n];
		readSquareMatrix(scanner, n, arr);
		printSquareMatrix(n, arr);
		int primaryDiagonal = getPrimaryDiagonalSum(n, arr);
		int secondaryDiagonal = getSecondaryDiagonalSum(n, arr);
		
		System.out.println("Sum of Primary Diagonal "+ primaryDiagonal);
		System.out.println("Sum of Secondary Diagonal "+ secondaryDiagonal);
		System.out.println("Absolute Difference "+ Math.abs(primaryDiagonal - secondaryDiagonal));
	}

	private static int getSecondaryDiagonalSum(int n, int[][] arr) {
		int secondaryDiagonal = 0;
		for(int i=0,j=n-1; i<n && j>=0; i++,j--) {
				secondaryDiagonal += arr[i][j];
			
		}
		return secondaryDiagonal;
	}

	private static int getPrimaryDiagonalSum(int n, int[][] arr) {
		int primaryDiagonal =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == j) {
					primaryDiagonal += arr[i][j];
				}
			}
			
		}
		return primaryDiagonal;
	}

	private static void readSquareMatrix(Scanner scanner, int n, int[][] arr) {
		for(int i=0;i<n;i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
	}

	private static void printSquareMatrix(int n, int[][] arr) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
