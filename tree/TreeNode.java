package tree;

public class TreeNode {

	int data;
	TreeNode leftChild;
	TreeNode rightChild;
	
	
	public TreeNode(int data) {
		super();
		this.data = data;
		this.leftChild=null;
		this.rightChild=null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
