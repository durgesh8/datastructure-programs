package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

	Queue<Integer> queue = new LinkedList<Integer>();

	public void push(int i) {
		if (queue.isEmpty())
			queue.add(i);
		else {
			queue.add(i);
			for (int j = 0; j < queue.size() - 1; j++) {
				queue.add(queue.poll());
			}
		}
	}
	
	public int pop() {
		if(queue.isEmpty())
			throw new RuntimeException("Stack is empty");
		else
			return queue.poll();
	}
}
