package queue;

import stack.Student;

public class CustomTest {

	public static void main(String[] args) {
		CustomQueueUsingArray<Student> cq=new CustomQueueUsingArray<>(10);
		Student st1=new Student(1, "Ashu");
		Student st2=new Student(2, "Gudia");
		Student st3=new Student(3, "Megha");
		Student st4=new Student(4, "Nilesh");
		
		
		cq.enqueue(st1);
		cq.enqueue(st2);
		System.out.println(cq.dequeue().getName());
		System.out.println(cq.dequeue().getName());
		System.out.println(cq.dequeue().getName());
	}
}
