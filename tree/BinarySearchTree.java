package tree;

import java.util.Stack;

public class BinarySearchTree {

	TreeNode root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void insertData(int data) {
		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode current = root;
			while (true) {
				TreeNode previous = current;
				if (data <= current.data) {
					current = current.leftChild;
					if (current == null) {
						previous.leftChild = newNode;
						break;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						previous.rightChild = newNode;
						break;
					}
				}

			}
		}

	}

	public boolean find(int data) {
		TreeNode current = root;
		while (current != null) {
			if (current.data == data) {
				return true;
			} else {
				if (data <= current.data) {
					current = current.leftChild;
				} else {
					current = current.rightChild;
				}
			}

		}
		return false;
	}

	public void insertUsingRecursion(int data){
		
		TreeNode newNode=new TreeNode(data);
		if(root==null){
			root=newNode;
		}else{
			recMethod(data, root);
		}
	}
	
	public TreeNode recMethod(int data, TreeNode root){
		TreeNode newNode=new TreeNode(data);
		if(root==null){
			root=newNode;
			return root;
		}
		if(data<=root.data){
			root.leftChild=recMethod(data, root.leftChild);
			
		}if(data>root.data){
			root.rightChild=recMethod(data, root.rightChild);
		}
		return root;
	}

	public void preOrderRecursion(TreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preOrderRecursion(root.leftChild);
		preOrderRecursion(root.rightChild);
	}
	
	public void inOrderTravRec(TreeNode root){
		if(root==null)
			return;
		inOrderTravRec(root.leftChild);
		System.out.print(root.data+" ");
		inOrderTravRec(root.rightChild);
	}

	public void preOrderTraversalIteratively(TreeNode root){
		System.out.println("***Inside preOrder Iteratively*******");
		Stack<TreeNode> nodeStack=new Stack<>();
		 while(root!=null){
			 System.out.print(root.data+" ");
			 nodeStack.push(root);
			 root=root.leftChild;
		 }
		 
		 while(!nodeStack.isEmpty() || root!=null){
			 if(root!=null){
				 System.out.print(root.data+" ");
				 nodeStack.push(root);
				 root=root.leftChild;
			 }
			 if(root==null){
				if(!nodeStack.isEmpty()){
					TreeNode node=nodeStack.pop();
					if(node.rightChild!=null){
						root=node.rightChild;
					}
				}
			 }
		 }
	}

	public void inOrderIteratively(TreeNode root){
		System.out.println("Inside inOrder Iteratively");
		Stack<TreeNode> nodeStack=new Stack<>();
		while(root!=null){
			nodeStack.push(root);
			root=root.leftChild;
		}
		
		while(!nodeStack.isEmpty()){
				TreeNode current=nodeStack.pop();
				System.out.print(current.data+" ");
				if(current.rightChild!=null){
					nodeStack.push(current.rightChild);
					current=current.rightChild;
						while(current!=null){
						current=current.leftChild;
					}
				}
			}
			
		
	}

	public int countAllNode(TreeNode root){
		
		if(root==null)
			return 0;
		else
			return(1+countAllNode(root.leftChild)+countAllNode(root.rightChild));
		
	}
	
	public int countLeafNodeInTree(TreeNode root){
		if(root==null){
			return 0;
		
		}else if (root.leftChild==null && root.rightChild==null){
			return 1;
		}
			return countLeafNodeInTree(root.leftChild)+countLeafNodeInTree(root.rightChild);
		}
	
	public int countHalfLeafNodeInTree(TreeNode root){
		if(root==null){
			return 0;
		
		}
		int res=0;
		if ((root.leftChild!=null && root.rightChild==null)||(root.leftChild==null && root.rightChild!=null)){
			 res++;
		}
			res=res+ countHalfLeafNodeInTree(root.leftChild)+countHalfLeafNodeInTree(root.rightChild);
			return res;
		}
	
	public int countFullNodeInTree(TreeNode root){
		if(root==null){
			return 0;
		
		}
		int res=0;
		if (root.leftChild!=null && root.rightChild!=null){
			res++;
		}
			res=res+ countFullNodeInTree(root.leftChild)+countFullNodeInTree(root.rightChild);
			return res;
	}
	
	
}
