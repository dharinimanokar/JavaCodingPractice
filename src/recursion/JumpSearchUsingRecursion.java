package recursion;

import java.util.Scanner;

public class JumpSearchUsingRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int index = 0; index<n;index++) {
			arr[index] = scanner.nextInt();
		}
		
		int searchableElement = scanner.nextInt();
        System.out.println(jumpsearch(arr,0, 3, searchableElement));
		
		scanner.close();
	}

	private static int jumpsearch(int[] arr, int start, int end, int searchableElement) {
       int index = -1;
       if(end > arr.length)
    	    return index;
       if(arr[end] < searchableElement ) {
    	   return jumpsearch(arr,  start+4,  end+4,  searchableElement) ;
       }else if(arr[end] >= searchableElement) {
    	   for(int index1 = start; index1<end;index1++) {
    		   if(arr[index1] == searchableElement) {
    			   index = index1;
    			   break;
    		   }
    	   
    	   }
       }
		return index;
	}

}
