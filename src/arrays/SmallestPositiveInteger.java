package arrays;

 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class SmallestPositiveInteger {
    public static int solution(int[] arr) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int negativeNosCount = 0;
        for(int index=0;index<arr.length;index++){
            if(arr[index]<0){
                negativeNosCount++;
            }
        }
        if(negativeNosCount == n){
            return 1;
        }
        int[] array2 = new int[n-negativeNosCount];
        int indx1=0;
        for(int index =0 ; index < n; index++){
            if(arr[index]>0){
                array2[indx1] = arr[index];
                indx1++;
            }
        }
        int size = array2.length;
        Arrays.sort(array2);
        int smallest = 1;
        for(int index=0;index<size;index++) {
        	if(smallest == array2[index]) {
        		smallest++;
        		continue;
        	}
        }
        	
       
      return smallest;
     
      
        
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int array[] = new int[sizeOfArray];
        for(int index=0;index<sizeOfArray;index++){
            array[index] = scanner.nextInt();
        }
        int smallestPositiveInteger = solution(array) ;
        System.out.println(smallestPositiveInteger);
        scanner.close();
    }
}