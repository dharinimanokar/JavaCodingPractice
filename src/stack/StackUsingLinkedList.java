package stack;

public class StackUsingLinkedList {
	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		  stack.push(10);
		  stack.push(20);
		  stack.push(30);
		  System.out.println("Popped Element" + stack.pop());
	}
	
}

class Node{
	int element;
	Node next;
	Node(int element){
		this.element = element;
		this.next = null;
	}
}

class StackLinkedList{
	Node top = null;
	
	void push(int element){
		if(this.top == null) {
			Node node = new Node(element);
			this.top = node;
		}else {
			Node node = new Node(element);
			node.next = this.top;
			this.top = node;
	}
	}
	
	boolean isEmpty() {
		return (this.top == null);
	}
	
	int pop() {
		int element = this.top.element;
		this.top  = this.top.next;
		return element;
		
	}
	
	
}