package stack;

public class StackTest {

	public static void main(String[] args) {
		//StackUsingTwoQueue st=new StackUsingTwoQueue();
		StackUsingSingleQueue st=new StackUsingSingleQueue();
		st.push(2);
		st.push(5);
		System.out.println(st.pop());
		st.push(6);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
