package linkedList;

public class IdentifyLoopLinkedList {
public static void main(String[] args) {
	CustomLinkedList cll1=new CustomLinkedList();
	cll1.insertAtStart(50);
	cll1.insertAtStart(40);
	cll1.insertAtStart(30);
	cll1.insertAtStart(20);
	cll1.insertAtStart(10);
	cll1.head.next.next.next.next=cll1.head.next;
	//cll1.printList();
	
	System.out.println(isLoopPresent(cll1));
	
}
static boolean isLoopPresent(CustomLinkedList cl){
	
	Node slowPointer=cl.head;
	Node fastPointer=cl.head;
	
	while(fastPointer.next!=null ){
		
		slowPointer=slowPointer.next;
		fastPointer=fastPointer.next.next;
		if(slowPointer==fastPointer)
			break;
	}
	if(fastPointer.next==null)
		return false;
	else
		return true;
	
}
}
