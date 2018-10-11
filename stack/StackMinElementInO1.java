package stack;

import java.util.Stack;

public class StackMinElementInO1 {
	
	public static void main(String[] args) {
		StackMinElementInO1 st01=new StackMinElementInO1();
		st01.push(5);
		System.out.println(st01.getMinElement());
		st01.push(2);
		System.out.println(st01.getMinElement());
		st01.push(6);
		System.out.println(st01.getMinElement());
		st01.pop();
		st01.pop();
		System.out.println(st01.getMinElement());
	}

	Stack<Integer> st1=new Stack<>();
	Stack<Integer> st2=new Stack<>();
	
	public void push(int i) {
		
		if(st1.isEmpty()) {
			st1.push(i);
			st2.push(i);
		}else {
			st1.push(i);
			if(st2.peek()>i)
				st2.push(i);
			else
				st2.push(st2.peek());
		}
	}
	
	public void pop() {
		st1.pop();
		st2.pop();
	}

	public int getMinElement() {
		return st2.peek();
	}
}
