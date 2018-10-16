package linkedList;

public class FindStartingPointOfLoop {

	public static void main(String[] args) {
		CustomLinkedList cll1=new CustomLinkedList();
		cll1.insertAtStart(50);
		cll1.insertAtStart(40);
		cll1.insertAtStart(30);
		cll1.insertAtStart(20);
		cll1.insertAtStart(10);
		cll1.head.next.next.next.next=cll1.head.next;
		//cll1.printList();
		
		detectAndRemoveLoop(cll1).printList();
	}
	
	static CustomLinkedList detectAndRemoveLoop(CustomLinkedList cl){
		Node slowPointer=cl.head;
		Node fastPointer=cl.head;
		
		while(fastPointer.next!=null ){
			
			slowPointer=slowPointer.next;
			fastPointer=fastPointer.next.next;
			if(slowPointer==fastPointer)
				break;
		}
		if(fastPointer.next==null)
			System.out.println("No Loop Present");
		else{
			System.out.println("Loop Present");
			   
			Node current=cl.head;
			Node prev=null;
			while(!current.equals(fastPointer)){
				current=current.next;
				while(!fastPointer.next.equals(fastPointer)){
					prev=fastPointer;
					fastPointer=fastPointer.next;
					if(fastPointer.equals(current))
						break;
				}
			}
			System.out.println("Starting point is:  "+current.data);
			System.out.println("previous  point is:  "+prev.data);
			prev.next=null;
		}
			
			return cl;
			
	
	}
}
