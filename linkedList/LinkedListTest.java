package linkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		CustomLinkedList cLL=new CustomLinkedList();
		cLL.printList();
		cLL.insertAtLast(12);
		cLL.insertAtLast(11);
		cLL.insertAtStart(16);
		cLL.printList();
		cLL.insertAtLast(19);
		System.out.println();
		cLL.printList();
	}
}
