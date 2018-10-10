package stack;

public class CustomStackUsingArray {

	
public static void main(String[] args) {

	Student st1=new Student(1, "aaa");
	Student st2=new Student(2, "bbb");
	Student st3=new Student(3, "ccc");
	Student st4=new Student(4, "ddd");
	Stack<Student> st=new Stack(10);
	st.push(st1);
	System.out.println(st.top);
	st.push(st2);
	System.out.println(st.top);
	st.pop();
	System.out.println(st.top);
}
	
}

 class Stack<T>{
	T[] arr;
	int top=-1;
	int size;
	
	 Stack(int capacity){
		 size=capacity;
		 arr= (T[]) new Object[capacity];
	 }
	 
	 public void push(T object) {
		 if(top==size-1) {
			 System.out.println("Stack is full");
		 }else
		 arr[++top]= object; 
	 }
	 
	 public T pop() {
		 if(top==-1) {
			 System.out.println("Empty Stack");
			 System.exit(0);
		 }
		 return arr[top--];
		 
	 }
	 
	 
}
