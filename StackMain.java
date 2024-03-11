package com.guvi.task4;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackMain {

	Stack<Integer>stack=new Stack();
	//method to push elements onto the stack
	public void pushToStack()
	{
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Pushed stack elements are :"+stack);
	}
	//method to pop an element from the stack
	public void popFromStack()
	{
		if(stack.isEmpty())
		{
			throw new EmptyStackException();
		}
		System.out.println("Popped element :"+stack.pop());
		System.out.println("Updated Stack elements :"+stack);
	}
	//method to check whether stack is empty or not
	public boolean Empty()
	{
		return stack.empty();
		
	}
	public static void main(String[] args) {
		StackMain sm=new StackMain();
		sm.pushToStack();
		sm.popFromStack();
		//when we try to remove from an empty stack it will throw an exception
		//sm.popFromStack();
		System.out.println("Stack is Empty :"+sm.Empty());

	}

}

/*
Output:

Pushed stack elements are :[10, 20, 30, 40, 50]
Popped element :50
Updated Stack elements :[10, 20, 30, 40]
Stack is Empty :false

*/
