package queue;

import java.util.Stack;

public class QueueUsingSingleStack<T> {
	
	Stack<T> stack=new Stack<>();
	
	public void enqueue(T item){
			stack.push(item);
		
	}
	
	public void dequeue(){
		if(stack.isEmpty())
			throw new RuntimeException("Queue is Empty");
		 if(stack.size()==1){
			 stack.pop();
			 return;
		}
			T item=stack.pop();
			dequeue();
			stack.push(item);
	}
	


}

