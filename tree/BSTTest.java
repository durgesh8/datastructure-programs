package tree;

public class BSTTest {

	public static void main(String[] args) {
		BST tree=new BST();
		
		tree.insertData(8);
		tree.insertData(10);
		tree.insertData(6);
		tree.insertData(7);
		
		tree.insertDataRec(5);
		tree.insertDataRec(20);
		tree.insertDataRec(25);
		
		System.out.println(tree.isPresent(6));
		System.out.println(tree.isPresent(3));
		System.out.println(tree.isPresent(4));
		System.out.println(tree.isPresent(7));
		System.out.println(tree.isPresent(20));
		System.out.println(tree.isPresent(25));
		System.out.println(tree.isPresent(24));
	}
}

