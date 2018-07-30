package decisionMakingAndLoops;

import java.util.Scanner;

public class SpiderSteps {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		while(noOfTestCases-- != 0) {
			int height = scanner.nextInt();
			int heightWall = height;
			int climbUp = scanner.nextInt();
			int slipDown = scanner.nextInt();
			int stepsTaken = 0;
			while(climbUp <= height) {
				stepsTaken++;
				height = height - (climbUp - slipDown);
				
			}
			if(height < heightWall) {
				stepsTaken++;
			}
			System.out.println(stepsTaken);
		}
		scanner.close();
	}
}
