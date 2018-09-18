package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingQueues {
	
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new BinaryNode(1);
		binaryTree.root.left = new BinaryNode(2);
		binaryTree.root.right = new BinaryNode(3);
		binaryTree.root.left.left= new BinaryNode(4);
		binaryTree.root.left.right= new BinaryNode(5);
		binaryTree.root.right.left= new BinaryNode(6);
		binaryTree.root.right.right= new BinaryNode(7);
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(binaryTree.root);
		while(!queue.isEmpty()) {
			BinaryNode tempNode = queue.poll();
			System.out.print(tempNode.data+" ");
			if(tempNode.left != null)
			queue.add(tempNode.left);
			if(tempNode.right != null)
			queue.add(tempNode.right);
		}
		
	}
}





