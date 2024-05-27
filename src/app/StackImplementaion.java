package app;

import stackClasses.ArrayStack;

public class StackImplementaion {

	public static void main(String[] args) {
		Integer a=1,b=2,c=3;
		ArrayStack<Integer> stack = new ArrayStack<Integer> ();
		stack.push(c);
		System.out.println("first element : "+ stack.top());
		stack.push(b);
		System.out.println("first element : "+ stack.top());
		stack.push(c);
		System.out.println("first element : "+ stack.top());
		stack.push(a);
		System.out.println("first element : "+ stack.top());
	}

}
