package recursion;

import java.util.Scanner;

public class ReverseN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		while(noOfTestCases-- != 0) {
			int n = scanner.nextInt();
			n = trimZeros(n);
			reverse(n);
			
		}
		scanner.close();
	}

	private static int trimZeros(int n) {
		if(n%10 == 0) {
			return trimZeros(n/10);
		}else {
			return n;
		}
	}

	private static int reverse(int n) {
		String s = String.valueOf(n);
		if(s.length() == 1) {
			if(n !=0)
			System.out.println(n);
			return n;
		}
		int divisor = 10;
		System.out.print(n%divisor);
		return reverse(n/divisor);
	}
		
}
