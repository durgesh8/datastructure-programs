package tree;

public class BinarySearchTreeDriver {

	public static void main(String[] args) {
		BinarySearchTree bt=new BinarySearchTree();
		bt.insertData(8);
		bt.insertData(10);
		bt.insertData(6);
		bt.insertData(7);
		bt.insertUsingRecursion(5);
		bt.insertUsingRecursion(20);
		bt.insertUsingRecursion(25);
	  System.out.println(bt.find(6));
	  System.out.println(bt.find(7));
	  System.out.println(bt.find(20));
	  /*System.out.println("PreOrderTraversal Rec");
	  bt.preOrderRecursion(bt.root);
	  System.out.println("InOrderTraversal Rec");
	  bt.inOrderTravRec(bt.root);
	  bt.preOrderTraversalIteratively(bt.root);
	  bt.inOrderIteratively(bt.root);
	  System.out.println(bt.countAllNode(bt.root));
	  System.out.println(bt.countLeafNodeInTree(bt.root));
	  System.out.println(bt.countHalfLeafNodeInTree(bt.root));
	  System.out.println(bt.countFullNodeInTree(bt.root));
	  System.out.println(bt.countFullNodeIteratively(bt.root));
	  System.out.println("BFS");
	  
	  System.out.println("Sum of tree "+bt.sumOfTree(bt.root));*/
	  ////bt.breadthFirstTraversal(bt.root);
	 // bt.getMirrorImage(bt.root);
	 // System.out.println("Deepest Node");
	////  System.out.println(bt.getDepestNode(bt.root).data);
	  bt.breadthFirstTraversal(bt.root);
	  System.out.println(bt.getHeightOfTree(bt.root));
	  System.out.println(bt.maxSumAtLevel(bt.root));
	  
	}
	
	
}
