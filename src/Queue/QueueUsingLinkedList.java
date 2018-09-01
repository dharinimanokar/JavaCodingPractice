package Queue;

public class QueueUsingLinkedList {
	public static void main(String[] args) {
		Queues queue = new Queues();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println("Popped Element" + queue.dequeue());
		System.out.println("Popped Element" + queue.dequeue());
		System.out.println("Popped Element" + queue.dequeue());
		System.out.println("Popped Element" + queue.dequeue());
		  
	  }
}

class Queues{
	Node rear;
	Node front;
    int size = 0;
  
    void enqueue(int d) {
    	Node node = new Node(d);
    	if(this.size == 0) {
    		this.rear = node;
    		this.front = node;
    	}else {
    		this.rear.next = node;
    		this.rear = this.rear.next;
    		
    	
    	}
    	size++;
    }
    
    boolean isEmpty() {
    	return (this.size == 0);
    }
    
    int dequeue() {
    	if(this.size == 0) {
    		System.out.println("Queue empty");
    		return 0;
    	}
    	int ele = this.front.data;
    	this.front = this.front.next;
    	this.size --;
    	return ele;
    }
	
}

class Node{
	
	int data;
	Node next;
	Node(int d){
		this.data = d;
		this.next=null;
	}
}