package linkedList;

public class CustomLinkedList {

	Node head;
	
	public CustomLinkedList() {
		this.head=null;
	}
	
	public void insertAtStart(int data){
		Node new_Node=new Node(data);
		if(head==null){
			head=new_Node;
		}else{
			new_Node.next=head;
			head=new_Node;
		}
	}
	
	public void insertAtLast(int data){
		Node new_Node=new Node(data);
		Node current_node=head;
		if(head==null){
			head=new_Node;
		}else{
			while(current_node.next!=null){
				current_node=current_node.next;
			}
			current_node.next=new_Node;
		}
		
		
	}
	
	public void printList(){
		Node current_node=head;
		while(current_node!=null){
			System.out.print(current_node.data+"->");
			current_node=current_node.next;
		}
	}
	
	public void insertAfter(Node prevNode,int data){
		
		if(prevNode==null){
			System.out.println("Previous Node cant be null");
			return;
		}else{
			Node new_node=new Node(data);
			new_node.next=prevNode.next;
			prevNode.next=new_node;
		}
	}
	
	public void deleteFromStart(){
		head=head.next;
		
	}
	
	public void deleteFromLast(){
		Node current=head;
		while(current.next.next!=null)
			current=current.next;
		
		current.next=null;
	}
	
	public int getLength(){
		Node currrent =head;
		int len=0;
		while(currrent!=null){
			len++;
			currrent=currrent.next;
		}
		return len;
	}
}
