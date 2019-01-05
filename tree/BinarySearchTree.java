package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import sun.reflect.generics.tree.Tree;

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
			res=res+countFullNodeInTree(root.leftChild)+countFullNodeInTree(root.rightChild);
			return res;
	}
	
    public int countFullNodeIteratively(TreeNode root){
    
    	Stack<TreeNode> st=new Stack<>();
    	int count =0;
    	while(root!=null){
    		if(root.leftChild!=null & root.rightChild!=null)
    			count++;
    		st.add(root);
    		root=root.leftChild;
    	}
    	while(!st.isEmpty()|| root!=null){
    		if(root!=null){
    			if(root.leftChild!=null & root.rightChild!=null)
        			count++;
        		st.add(root);
        		root=root.leftChild;
    		}
    		if(root==null){
    			if(!st.isEmpty()){
    				TreeNode t= st.pop();
    				if(t.rightChild!=null){
    					root=t.rightChild;
    				}
    			}
    		}
    	}
    	return count;
    }

    public void breadthFirstTraversal(TreeNode root){
    	Stack<TreeNode> st1=new Stack<>();
    	Stack<TreeNode> st2=new Stack<>();
    	 st1.add(root);
    	while(!st1.isEmpty() || !st2.isEmpty()){
    		
    			while(!st1.isEmpty()){
    				TreeNode cr=st1.pop();
    				System.out.print(cr.data+" ");
    				if(cr.leftChild!=null)
    					st2.add(cr.leftChild);
    				if(cr.rightChild!=null)
    					st2.add(cr.rightChild);
    			
    		}
    			System.out.println("----------");
    			while(!st2.isEmpty()){
    				TreeNode cr=st2.pop();
    				System.out.print(cr.data+" ");
    				if(cr.leftChild!=null)
    					st1.add(cr.leftChild);
    				if(cr.rightChild!=null)
    					st1.add(cr.rightChild);
    			}
    			System.out.println("-----------");
    	}
    }

    public int sumOfTree(TreeNode root){
    	Queue<TreeNode> queue= new LinkedList<>();
    	queue.offer(root);
    	int count =0;
    	while(!queue.isEmpty()){
    		TreeNode current=queue.poll();
    		count=count+current.data;
    		if(current.rightChild!=null)
    			queue.offer(current.rightChild);
    		if(current.leftChild!=null)
    			queue.offer(current.leftChild);
    	}
    	return count;
    }

    public int sumOfTree2Way(TreeNode root){
    	if(root ==null)
    		return 0;
    	else
    		return root.data+sumOfTree2Way(root.leftChild)+sumOfTree2Way(root.rightChild);
    }
    public boolean isMirror(TreeNode root1,TreeNode root2){
    	if(root1==null && root2==null)
    		return true;
    	if(root1.data!=root2.data)
    		return false;
    	else  return (isMirror(root1.leftChild, root2.rightChild) && isMirror(root1.rightChild, root2.leftChild));
    }

    public void getMirrorImage(TreeNode root){
    	
    	if(root==null)
    		return ;
    	else{
    		TreeNode leftNode=root.leftChild;
    		TreeNode rightNode=root.rightChild;
    	      root.leftChild=rightNode;
    	      root.rightChild=leftNode;
    	      getMirrorImage(root.leftChild);
    	      getMirrorImage(root.rightChild);
    	}
    	
    }

    public boolean isBothTreeIdentical(TreeNode root1,TreeNode root2){
    	if(root1==null && root2==null)
    		return true;
    	if(root1.data!=root2.data)
    		return false;
    	else
    		return (isBothTreeIdentical(root1.leftChild, root2.leftChild) && isBothTreeIdentical(root1.rightChild,root2.rightChild));
    }
    
    public TreeNode  getDepestNode(TreeNode root){
    	Queue<TreeNode> st1=new LinkedList<>();
    	Queue<TreeNode> st2=new LinkedList<>();
    	st1.offer(root);
    	TreeNode result=null;
    	while(!st1.isEmpty() || !st2.isEmpty()){
    		if(!st1.isEmpty()){
    			TreeNode cr=st1.poll();
    			result=cr;
    			if(cr.leftChild!=null)
    				st2.offer(cr.leftChild);
    			if(cr.rightChild!=null)
    				st2.offer(cr.rightChild);
    		}
    		if(!st2.isEmpty()){
    			TreeNode cr=st2.poll();
    			result=cr;
    			if(cr.leftChild!=null)
    				st1.offer(cr.leftChild);
    			if(cr.rightChild!=null)
    				st1.offer(cr.rightChild);
    		}
    	}
    	return result;
    }

    /*public TreeNode createTreeUsingPreOrderString(String str){
    	
    }*/
    
    public int getHeightOfTree(TreeNode root){
    	if(root==null)
    		return 0;
    	else{
    		int left=getHeightOfTree(root.leftChild);
    		int right=getHeightOfTree(root.rightChild);
    		if(left>right)
    			return left+1;
    		else return right+1;
    				
    	}
    	
    }
 
    public int maxSumAtLevel(TreeNode root){
    	
    	Queue<TreeNode> st1=new LinkedList<TreeNode>();
    	Queue<TreeNode> st2=new LinkedList<TreeNode>();
    	int maxSum=0;
    	if(root!=null){
    		st1.add(root);
    	}
    	
    	
    	while(!st1.isEmpty() || !st2.isEmpty()){
    		int sum=0;
    		while(!st1.isEmpty()){
    			
    			TreeNode crr=st1.poll();
    			sum=sum+crr.data;
    			if(crr.leftChild!=null)
    				st2.add(crr.leftChild);
    			if(crr.rightChild!=null)
    				st2.add(crr.rightChild);
    		}
    		if(sum>maxSum)
    			maxSum=sum;
    		sum=0;
    		while(!st2.isEmpty()){
    			TreeNode crr=st2.poll();
    			sum=sum+crr.data;
    			if(crr.leftChild!=null)
    				st1.add(crr.leftChild);
    			if(crr.rightChild!=null)
    				st1.add(crr.rightChild);
    		}
    		if(sum>maxSum)
    			maxSum=sum;
    		}
    	
    
    return maxSum;
    }
   /* public TreeNode convertPreOrderStringToTree(String str){
    	TreeNode root=null;
    	char[] ch=str.toCharArray();
    	if(ch.length!=0){
    		root= new TreeNode(Integer.valueOf(ch[0]));
    	}
    	for(int i=1;i<ch.length;i++){
    		
    	}*/
   
}
