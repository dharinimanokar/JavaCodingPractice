package stack;

public class StackUsingArray {
	
  public static void main(String[] args) {
	  Stack stack = new Stack();
	  stack.push(10);
	  stack.push(20);
	  stack.push(30);
	  System.out.println("Popped Element" + stack.pop());
	  
  }
	
}

class Stack{
	int Max = 100;
	int top = -1;
    int[] stack = new int[Max];
    
    boolean isEmpty() {
    	return (top < 0);
    }
     void push(int element) {
    	 if(top> Max) {
    		 System.out.println("Stack Overflow");
    	 }else {
    		 top++;
        	 stack[top] = element;
    	 }
    	
     }
     
     int pop() {
    	 if(top<0) {
    		 System.out.println("Stack Underflow");
    		 return 0;
    	 }else {
    		 int element = stack[top];
       	   top--;
       	    return element;
    	 }
    	
     }
     

}
