package queue;




public class CustomQueueUsingArray<T> {

	Object[] arr;
	int rear=-1;
	
	public CustomQueueUsingArray(int i) {
	arr=new Object[i];
	}
	
	public void enqueue(T type) {
		if(rear==arr.length-1) {
			System.out.println("QUEUE is full");
		}else {
			arr[++rear]=type;
		}
	}
	
	public T dequeue() {
		if(rear==-1) {
			System.out.println("Queue is empty");
		}else {
			T type=(T) arr[0];
			for(int i=1;i<arr.length-1;i++) {
				arr[i-1]=arr[i];
			}
			rear--;
			return type;
		}
		return null;
	}
}
