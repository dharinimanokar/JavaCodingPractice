package trees;

import java.util.Stack;

class InorderTraversal {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new BinaryNode(1);
		binaryTree.root.left = new BinaryNode(2);
		binaryTree.root.right = new BinaryNode(3);
		binaryTree.root.left.left= new BinaryNode(4);
		binaryTree.root.left.right= new BinaryNode(5);
		binaryTree.root.right.left= new BinaryNode(6);
		binaryTree.root.right.right= new BinaryNode(7);
		inorderWithoutRecursion(binaryTree);
	}
	
	static void  inorderWithoutRecursion(BinaryTree binaryTree) {
		Stack<BinaryNode> stack  = new Stack<BinaryNode>();
		BinaryNode current = binaryTree.root;
		while(current != null || !stack.isEmpty()) {
			while(current != null) {
				stack.add(current);
				current = current.left;
 			}
			BinaryNode node =  stack.pop();
			current = node.right;
			System.out.print(node.data+" ");
		}
		System.out.println();
	}
	
	
}

 

