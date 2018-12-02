package tree;

import java.util.Currency;
import java.util.Stack;

import sun.reflect.generics.tree.Tree;

public class BST {

	public TreeNode root;

	public BST() {
		super();
		this.root = null;
	}

	public void insertData(int data) {
		TreeNode newNode = new TreeNode(data);

		if (root == null) {
			root = newNode;
		} else {
			TreeNode currentNode = root;
			while (true) {
				TreeNode parent = currentNode;
				if (data < currentNode.data) {
					currentNode = currentNode.leftChild;
					if (currentNode == null) {
						parent.leftChild = newNode;
						break;
					}
				} else {
					currentNode = currentNode.rightChild;
					if (currentNode == null) {
						parent.rightChild = newNode;
						break;
					}
				}
			}
		}
	}

	public boolean isPresent(int data) {

		if (root == null)
			return false;
		else {
			TreeNode current = root;
			while (true) {

				if (current == null)
					return false;
				else if (current.data == data)
					return true;
				else {
					if (current.data > data)
						current = current.leftChild;
					else
						current = current.rightChild;
				}
			}
		}

	}

	public void insertDataRec(int data) {
		if (null == root) {
			root = new TreeNode(data);
		} else {
			insertusingRec(root, data);
		}

	}

	private TreeNode insertusingRec(TreeNode root, int data) {

		if (root == null) {
			root = new TreeNode(data);
		} else {
			if (data < root.data)
				root.setLeftChild(insertusingRec(root.leftChild, data));
			else
				root.setRightChild(insertusingRec(root.rightChild, data));
		}

		return root;
	}

	public void preorderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorderTraversal(root.leftChild);
			preorderTraversal(root.rightChild);
		}
	}

	public void inOrderTraversal(TreeNode root) {
		if (null != root) {
			inOrderTraversal(root.leftChild);
			System.out.print(root.data + " ");
			inOrderTraversal(root.rightChild);
		}
	}

	public void postOrderTraversal(TreeNode root) {
		if (null != root) {
			postOrderTraversal(root.leftChild);
			postOrderTraversal(root.rightChild);
			System.out.print(root.data + " ");
		}
	}

	public void preOrderTraversalWithoutRecursion(TreeNode root) {

		Stack<TreeNode> st = new Stack<>();
		TreeNode current = root;
		st.add(current);
		while (!st.isEmpty()) {
			current = st.pop();
			System.out.print(current.data + " ");
			if (current.rightChild != null) {
				st.add(current.rightChild);
			}

			if (current.leftChild != null) {
				st.add(current.leftChild);
			}
		}
	}

	public void inOrderTraversalWithoutRecursion(TreeNode root) {

		TreeNode currrent = root;
		Stack<TreeNode> st = new Stack<>();

		while (currrent != null || !st.isEmpty()) {
			while (currrent != null) {
				st.add(currrent);
				currrent = currrent.leftChild;
			}

			currrent = st.pop();
			System.out.print(currrent.data + " ");
			currrent = currrent.rightChild;

		}

	}

	public void postOrderTraversalwithoutRecursion(TreeNode root) {

		TreeNode cr = root;
		Stack<TreeNode> st = new Stack<>();
		while (cr != null || !st.isEmpty()) {
			while (cr!= null) {
				if(cr.rightChild!=null){
					st.add(cr.rightChild);
					st.add(cr);
					cr = cr.leftChild;
				}else{
					st.add(cr);
					cr=cr.leftChild;
				}
					
				
			}

			TreeNode crr = st.pop();
			if (!st.isEmpty()&& crr.rightChild == st.peek()) {
                 cr=st.pop();
                 st.push(crr);
			}else
				System.out.print(crr.data+" ");
		}
	}

}
