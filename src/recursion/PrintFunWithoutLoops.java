package recursion;

import java.util.Scanner;

public class PrintFunWithoutLoops {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int noOfTestCases = scanner.nextInt();
	 while(noOfTestCases-- != 0) {
		 int n = scanner.nextInt();
		 int i=1;
		 printFun(i,n);
	 }
	 scanner.close();
 }

private static void printFun(int index, int n) {
	
	if(index<=n) {
		System.out.print(index+" ");
		printFun(index+1,n);
	}else {
		return;
	}
	
}
}
