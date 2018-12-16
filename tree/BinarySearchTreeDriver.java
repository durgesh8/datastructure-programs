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
	  System.out.println("PreOrderTraversal Rec");
	  bt.preOrderRecursion(bt.root);
	  System.out.println("InOrderTraversal Rec");
	  bt.inOrderTravRec(bt.root);
	  bt.preOrderTraversalIteratively(bt.root);
	  bt.inOrderIteratively(bt.root);
	  System.out.println(bt.countAllNode(bt.root));
	}
}
