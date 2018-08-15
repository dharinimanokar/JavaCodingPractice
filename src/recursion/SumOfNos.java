package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNos {

	public static void main(String[] args) {
		
		 int[] nums = {10, 2, 2, 5};
		 System.out.println(groupSum(0, nums, 17));
		 
	}

	public static boolean groupSum(int start, int[] nums, int target) {
		  if(start >= nums.length)
		   return target == 0;
		  
		   
		   if(groupSum(start+1,  nums,  target-nums[start])) {
			   System.out.println(start+1);
			   System.out.println(target);
			   return true;
		   }
		    
		   if(groupSum(start+1,  nums, target)) {
			   System.out.println(start+1);
			   System.out.println(target);
			   return true;
		   }
		    
		   
		   return false;
		}


}