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
				if(currentNode==null){
					currentNode=newNode;
					break;
				}
				if(newNode.data<=currentNode.data){
					currentNode=currentNode.leftChild;
				}else{
					currentNode=currentNode.rightChild;
				}
			}
		}
	}
	
	
}
