package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Iterator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noofTestCases = scanner.nextInt();
		while(noofTestCases-- != 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int index = 0; index<n; index++) {
				list.add(scanner.nextInt());
			}
			Collections.sort(list);
			ListIterator<Integer> listIterator = list.listIterator();
			
			while(listIterator.hasNext()) {
				if(listIterator.next() < k) {
					listIterator.remove();
				}
			}
			System.out.println(Arrays.toString(list.toArray()));
		}
		scanner.close();
	}

}
