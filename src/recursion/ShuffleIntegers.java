package recursion;

/*package whatever //do not write package name here */

import java.util.Scanner;

class ShuffleIntegers {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestcases = scanner.nextInt();
		while(noOfTestcases-- !=0){
		    int n = scanner.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0;i <n; i++){
		        arr[i] = scanner.nextInt();
		    }
		    shuffle(arr,0,n/2);
		}
	}
	public static void shuffle(int[] arr, int firstPointerIndex, int lastPointerIndex){
	   
	    int n = arr.length;
	    if(firstPointerIndex == n/2 || lastPointerIndex == n){
	        
	        if(lastPointerIndex == n-1 )
	         System.out.print(arr[lastPointerIndex]);
	        System.out.println();
	        return;
	    }
	    System.out.print(arr[firstPointerIndex]+" "+arr[lastPointerIndex]+" ");
	    shuffle(arr, firstPointerIndex+1, lastPointerIndex+1);
	}
}