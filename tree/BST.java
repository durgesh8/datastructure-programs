package tree;

public class BST {

	private TreeNode root;

	public BST() {
		super();
		this.root=null;
	}
	
	public void insertData(int data){
		TreeNode newNode=new TreeNode(data);
		
		if(root==null){
			root=newNode;
		}else{
			TreeNode currentNode=root;
			while(true){
				TreeNode parent=currentNode;
				if(data<currentNode.data){
					currentNode=currentNode.leftChild;
					if(currentNode==null){
						parent.leftChild=newNode;
						break;
					}
				}else{
					currentNode=currentNode.rightChild;
					if(currentNode==null){
						parent.rightChild=newNode;
						break;
					}
				}
			}
		}
	}
	
	public boolean isPresent(int data){
		
		if(root==null)
			return false;
		else{
			TreeNode current=root;
			while(true){
				
				if(current==null)
					return false;
				else if(current.data==data)
					return true;
				else{
					if(current.data>data)
						current=current.leftChild;
					else
						current=current.rightChild;
				}
			}
		}

	}
}


