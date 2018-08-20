package linkedLists;

import java.util.HashSet;

class Node {
	Node next;
	int data;
	boolean visitedNodes = false;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class SinglyLinkedLists {

	Node head;

	void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	void append(int newData) {
		Node newNode = new Node(newData);
		Node tnode = head;
		while (tnode.next != null) {
			tnode = tnode.next;
		}
		tnode.next = newNode;
	}

	void insert(int newData, int position) {
		Node newNode = new Node(newData);
		Node currentNode = head;
		for (int i = 0; i < position - 1; i++) {
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}

	void deleteNodeBasedOnKey(int key) {
		Node tnode = head;
		Node previousNode = null;
		if (head.data == key) {
			head = head.next;
			return;
		}
		while (tnode.next != null) {
			if (tnode.next.data == key) {
				previousNode = tnode;
				tnode = tnode.next;
				break;
			} else {
				tnode = tnode.next;
			}
		}
		if (previousNode != null) {
			previousNode.next = tnode.next;
		}
	}

	void deleteNodeBasedOnIndex(int deleteIndex) {
		if (deleteIndex == 0) {
			head = head.next;
			return;
		}
		Node previousNode = head;
		Node tnode = head.next;
		for (int index = 0; index < deleteIndex - 1; index++) {
			previousNode = tnode;
			tnode = tnode.next;
		}
		previousNode.next = tnode.next;
	}
	
	void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
		System.out.println();
	}

	void deleteList() {
		head = null;
	}

	void lengthIterative() {
		int counter = 0;
		Node tnode = head;
		while(tnode != null) {
			counter++;
			tnode = tnode.next;
		}
		System.out.println("Length of List "+ counter);
	}
	
	int lengthRecursive(Node tnode) {
		int count = 1;
		if(tnode.next == null) {
			return count;
		}
		return count + lengthRecursive(tnode.next);
	}
	
	int searchIteratively(int key) {
		Node tnode = head;
		while(tnode != null) {
			if(tnode.data == key) {
				return 1;
				
			}else {
				tnode = tnode.next;
			}
		}
		return 0;
	}
	
	int searchRecursively(Node tnode, int key) {
		if(tnode == null) {
			return 0;
		}
		if(tnode.data == key)
			return 1;
		else
			return searchRecursively(tnode.next, key);
	}
	
	int getNthNodeIteratively(int n) {
		Node tnode = head;
		for(int index = 0; index < n; index++) {
			tnode = tnode.next;
		}
		return tnode.data;
	}
	
	int findMiddle() {
		Node fastPointer = head;
		Node slowPointer = head;
		while(fastPointer != null && fastPointer.next != null) {
			
			fastPointer = fastPointer.next.next;
		    slowPointer = slowPointer.next;
			
		}
		return slowPointer.data;
	}
	
	int countNItem(Node tnode,int key) {
		int count = 0;
		if(tnode == null)
			return count;
		if(tnode.data == key) {
			count++;
		}
		return count + countNItem(tnode.next, key);
			
	}
	
	String detectLoopUsingHashing() {
		HashSet<Node> hs = new HashSet<Node>();
		Node tnode = head;
		while(tnode != null) {
			if(hs.contains(tnode)){
				return "Loop found";
			}
			hs.add(tnode);
			tnode = tnode.next;
		}
		return "Loop Not Found";
	}
	
	String detectLoopUsingVisitedNodes() {
		Node tnode = head;
		while(tnode != null) {
			if(tnode.visitedNodes == true) {
				return "Loop  Found";
			}
			tnode.visitedNodes = true;
			tnode = tnode.next;
		}
		return "Loop Not Found";
	}
	
	String detectLoopUsingTwoPointers() {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer != null && fastPointer.next != null) {
			
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if(fastPointer == slowPointer)
				return "Loop Found";
		}
		return "Loop Not Found";
	}
	
	int detectAndCountLoops() {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer != null && fastPointer.next != null) {
			
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if(fastPointer == slowPointer) {
				Node tempNode = fastPointer;
				int count = 1;
				
				while(slowPointer.next != tempNode) {
					count++;
					slowPointer = slowPointer.next;
					
				}
				
				return count;
			}
			
		   
		}
		return 0;
	}
	void removeLoop() {
		Node slowPointer = head;
		Node fastPointer = head;
		while(fastPointer != null && fastPointer.next != null) {
			
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if(fastPointer == slowPointer) {
				Node tempNode = fastPointer;
				while(slowPointer.next != tempNode) {
					slowPointer = slowPointer.next;
				}
				slowPointer.next = null;
				return;
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedLists sl = new SinglyLinkedLists();
		sl.push(5);
		sl.push(6);
		sl.push(10);
		sl.push(20);
		sl.push(200);
		sl.push(300);
		sl.push(400);
		sl.append(8);
		sl.insert(3, 1);
		sl.printList();
		System.out.println(sl.lengthRecursive(sl.head));
		sl.deleteNodeBasedOnKey(8);
		sl.printList();
		System.out.println(sl.lengthRecursive(sl.head));
		sl.deleteNodeBasedOnIndex(3);
		sl.printList();
		System.out.println(sl.getNthNodeIteratively(1));
		System.out.println(sl.lengthRecursive(sl.head));
		System.out.println(sl.searchIteratively(5) == 1 ? true : false);
		System.out.println(sl.searchRecursively(sl.head, 100) == 1 ? true : false);
		System.out.println(sl.findMiddle());
		System.out.println(sl.countNItem(sl.head,200));
		
		sl.head.next.next.next = sl.head;
		System.out.println(sl.detectLoopUsingHashing());
		System.out.println(sl.detectLoopUsingVisitedNodes());
		System.out.println(sl.detectLoopUsingTwoPointers());
		System.out.println(sl.detectAndCountLoops());
		sl.removeLoop();
		sl.printList();
	}
}
