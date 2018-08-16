package StacksAndQueues;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			displayStackInfo(stack);
		}
		// stack.push(60);

		while (!stack.isEmpty()) {
			displayStackInfo(stack);
			stack.pop();
		}

		stack.pop();
	}

	public static void displayStackInfo(StackUsingArrays s) throws Exception {
		System.out.println("****************************************");
		s.display();
		System.out.println(s.top());
		System.out.println(s.size());
		System.out.println("****************************************");
	}

}
