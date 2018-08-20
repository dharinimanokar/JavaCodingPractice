package strings;

import java.util.Scanner;

public class ChangeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTc = scanner.nextInt();
		while(noOfTc-- !=0 ) {
			String s = scanner.next();
			if(Character.isUpperCase(s.charAt(0))) {
				System.out.println(s.toUpperCase());
			}else {
				System.out.println(s.toLowerCase());
			}
					
		}
		scanner.close();
	}
}
