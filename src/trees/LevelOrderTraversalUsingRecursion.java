package trees;

public class LevelOrderTraversalUsingRecursion {
  public static void main(String[] args) {
	  BinaryTree binaryTree = new BinaryTree();
	  binaryTree.root = new BinaryNode(1);
	  binaryTree.root.left = new BinaryNode(2);
		binaryTree.root.right = new BinaryNode(3);
		binaryTree.root.left.left= new BinaryNode(4);
		binaryTree.root.left.right= new BinaryNode(5);
		binaryTree.root.right.left= new BinaryNode(6);
		binaryTree.root.right.right= new BinaryNode(7);
		int height = binaryTree.height(binaryTree.root);
		for(int i = 1;i <= height; i++) {
			printNodeAtLevel(binaryTree.root,i);
		}
  }

private static void printNodeAtLevel(BinaryNode root, int height) {
	if(root == null)
		return;
	if(height == 1) {
		System.out.print(root.data+" ");
	}
	else {
		printNodeAtLevel(root.left, height-1);
		printNodeAtLevel(root.right, height-1);
	}
	
}

}
