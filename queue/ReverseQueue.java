package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		System.out.println(queue);
		System.out.println(reverse(queue));
	}

 public static Queue<Integer> reverse(Queue<Integer> queue){
		Stack<Integer> st = new Stack<>();
		while(!queue.isEmpty()){
			st.push(queue.poll());
		}
		while(!st.isEmpty())
			queue.offer(st.pop());
		return queue;
	}
}
