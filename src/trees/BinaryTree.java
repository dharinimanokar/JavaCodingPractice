package trees;

public class BinaryTree {
	BinaryNode root = null;
	
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new BinaryNode(1);
		binaryTree.root.left = new BinaryNode(2);
		binaryTree.root.right = new BinaryNode(3);
		binaryTree.root.left.left= new BinaryNode(4);
		binaryTree.root.left.right= new BinaryNode(5);
		binaryTree.root.right.left= new BinaryNode(6);
		binaryTree.root.right.right= new BinaryNode(7);
		binaryTree.insert(binaryTree.root, 5);
		inorderWithRecursion(binaryTree.root);
	}
	
	
	private void insert(BinaryNode binaryNode, int key) {
		if(binaryNode == null) {
			return;
		}
		
		if(binaryNode.left == null) {
			binaryNode.left = new BinaryNode(key);
			return;
		}
		if(binaryNode.right == null) {
			binaryNode.right = new BinaryNode(key);
			return;
		}
		
		insert(binaryNode.left, key);
		insert(binaryNode.right, key);
		
	}


	int height(BinaryNode root) {
		if(root == null) {
			return 0;
		}else {
			int lHeight = 1;
			int rHeight = 1;
			lHeight = lHeight +height(root.left);
			rHeight = rHeight+ height(root.right);
			if(lHeight> rHeight) {
				return lHeight;
			}else
				return rHeight;
		}
	}
	
	static void  inorderWithRecursion(BinaryNode temp) {
		if(temp == null)
			return;
		inorderWithRecursion(temp.left);
		System.out.print(temp.data+" ");
		inorderWithRecursion(temp.right);
	}
}
class BinaryNode{
	int data;
	BinaryNode left;
	BinaryNode right;
	BinaryNode(int d){
		this.data = d;
		this.left = this.right  = null;
	}
}
