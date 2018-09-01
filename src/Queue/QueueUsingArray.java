package Queue;


public class QueueUsingArray {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println("Popped Element" + queue.dequeue());
		System.out.println("Popped Element" + queue.dequeue());
		System.out.println("Popped Element" + queue.dequeue());
		System.out.println("Popped Element" + queue.dequeue());
		  
	  }
}

class Queue{
	int rear;
	int front;
	int Max = 1000;
	int[] queue = new int[1000];
	int size ;
	
	Queue() {
		rear = -1;
		front = -1;
		size = 0;
	}
	
	public void enqueue(int element) {
		if(size == Max) {
			System.out.println("Queue Full");
		}else {
			rear++;
			size++;
			queue[rear] = element;
			if(front == -1)
				front++;
		}
		
	}
	
	int dequeue() {
		if(size == 0) {
			System.out.println("Queue Empty");
			return 0;
		}else {
			int element = queue[front];
			front++;
			size--;
			return element;
		}
		
	}
}