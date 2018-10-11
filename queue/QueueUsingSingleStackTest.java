package queue;

import stack.Student;

public class QueueUsingSingleStackTest {

	public static void main(String[] args) {
		QueueUsingSingleStack<Student> queue=new QueueUsingSingleStack<>();
		System.out.println(queue.stack);
		
		Student st=new Student(1, "aaa");
		Student st1=new Student(2, "bbb");
		//queue.dequeue();
		queue.enqueue(st1);
		queue.enqueue(st);
		System.out.println(queue.stack);
		queue.dequeue();
		System.out.println(queue.stack);
		
		
	}
}
