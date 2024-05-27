package ReversingArrrays;

import java.util.Arrays;

import stackClasses.ArrayStack;
import stackClasses.Stack;

public class ReversingArrays {
	/*
	 * method to reverse an array elments
	 */
	public static<T> void reverse(T []data) {
		Stack<T>buffer = new ArrayStack<>(data.length);
		
		for(int i = 0; i < data.length;i++) 
			buffer.push(data[i]);
		
		for(int k = 0;k < data.length;k++) 
			data[k] = buffer.pop();
	}
	
	public static void main(String[] args) {
		Integer data[] = {5,4,3,2,1};
		System.out.println(Arrays.toString(data));
		reverse(data);
		System.out.println("reversed");
		System.out.println(Arrays.toString(data));
		
	}

}
