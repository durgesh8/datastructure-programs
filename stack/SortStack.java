package stack;

import java.util.Stack;

public class SortStack {
 
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(9);
		st.push(2);
		st.push(8);
		st.push(4);
		st.push(6);
		System.out.println(sortStack(st));
	}
	
	public static java.util.Stack<Integer> sortStack(java.util.Stack<Integer> st){
		
		java.util.Stack<Integer> temp=new java.util.Stack<>();
		while(!st.isEmpty()) {
			int count = 0;
			if(temp.isEmpty())
				temp.push(st.pop());
			else if(temp.peek()>=st.peek()){
				temp.push(st.pop());
			}else {
				int z=st.pop();
				 count = 0;
				 int size=temp.size();
				for(int x=0;x<size;x++) {
					if(temp.peek() < z) {
						st.push(temp.pop());
						count++;
					}else {
						temp.push(z);
						for(int j=0;j<count;j++) { 
							temp.push(st.pop());
						}
						break;
					}
					
					if(temp.isEmpty()) {
						temp.push(z);
						for(int j=0;j<count;j++) {
							temp.push(st.pop());
						}
					}
						
				}
				
			}
			
			
		}
		return temp; 
	}
}
