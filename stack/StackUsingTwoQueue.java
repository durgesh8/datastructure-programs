package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();

	public void push(int i) {
		queue1.add(i);
	}

	public int pop() {
		if(queue1.isEmpty())
			return -1;
		else {
			while(!(queue1.size()==1)) {
				queue2.add(queue1.poll());
			}
		}
		int x=queue1.poll();
		while(!queue2.isEmpty())
			queue1.add(queue2.poll());
		return x;
	}

}
