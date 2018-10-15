package linkedList;


public class LinkedListIntersectionPoint {

public static void main(String[] args) {
	
	CustomLinkedList cll1=new CustomLinkedList();
	cll1.insertAtStart(50);
	cll1.insertAtStart(40);
	cll1.insertAtStart(30);
	cll1.insertAtStart(20);
	cll1.insertAtStart(10);
	
	CustomLinkedList cll2=new CustomLinkedList();
	cll2.insertAtStart(60);
	//cll2.head.next=cll1.head.next.next;
	
	cll1.printList();
	System.out.println("***********");
	cll2.printList();
	System.out.println();
	System.out.println(getIntersectionPoint(cll1, cll2).data);
}

static Node getIntersectionPoint(CustomLinkedList l1,CustomLinkedList l2){
	
	int firstLinkedListLength=l1.getLength();
	int secondLinkedListLength=l2.getLength();
	int	d=firstLinkedListLength-secondLinkedListLength;
	Node current =l1.head;
	Node current2 =l2.head;
	
	if(d>0){
		for(int i=0;i<d;i++){
			current =current.next;
		}
	}else if(d<0){
		for(int i=0;i<Math.abs(d);i++){
			current2 =current2.next;
		}
		
	}
		
	while(current!=current2 && current!=null && current2!=null){
		current=current.next;
		current2=current2.next;
	}
	
	return current;
	
}
}
