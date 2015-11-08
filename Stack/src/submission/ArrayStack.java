package submission;

import java.util.EmptyStackException;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data;
	private int top;
	
	@Override
	public void push(T newEntry) {
		data[top + 1] = newEntry;
		top++;
		}
   
	@Override
	public T pop() {
		if(isEmpty())
			throw new EmptyStackException();
		else{
			T head = data[top];
			data[top] = null;
			top--;
			return head;
		}		
	}

	@Override
	public T peek() {
		if(isEmpty())
			throw new EmptyStackException();
		else
			return data[top];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public void clear() {
	   top = -1;
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+\n";
		return s;
	}
	public static void main(String[]args){
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.pop();
	}

}
