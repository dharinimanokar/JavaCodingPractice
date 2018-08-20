package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTc = scanner.nextInt();
		while(noOfTc-- != 0) {
			String s = scanner.next();
			char[] charArray = s.toCharArray();
			System.out.println(reverse(charArray,charArray.length-1));
			
		}
		scanner.close();
	}

	private static String reverse(char[] cs,int index) {
		String s = "";
		if(index < 0)
			return s;
		
		s = s+cs[index];
		return s + reverse(cs,index-1);
		 
	}
}
