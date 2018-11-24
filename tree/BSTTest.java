package tree;

public class BSTTest {

	public static void main(String[] args) {
		BST tree=new BST();
		
		tree.insertData(8);
		tree.insertData(10);
		tree.insertData(6);
		tree.insertData(7);
		
		System.out.println(tree.isPresent(6));
		System.out.println(tree.isPresent(3));
		System.out.println(tree.isPresent(4));
		System.out.println(tree.isPresent(7));
	}
}

