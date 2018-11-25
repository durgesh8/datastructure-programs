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

	public void insertDataRec(int data){
		if(null==root){
			root=new TreeNode(data);
		}else{
			insertusingRec(root, data);
		}
		
	}
    private TreeNode insertusingRec(TreeNode root,int data){
    	
    	if(root==null){
    		root=new TreeNode(data);
    	}else{
    		if(data<root.data)
        		root.setLeftChild(insertusingRec(root.leftChild, data));
        	else
        		root.setRightChild(insertusingRec(root.rightChild, data));
    	}
    	
    	
    return root;
    }
}


