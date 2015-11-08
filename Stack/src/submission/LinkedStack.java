package submission;

import java.util.EmptyStackException;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	
	public LinkedStack(){
		top = null;
	}
	
	@Override
	public void push(T newEntry) {
		Node n = new Node(newEntry, top);
		top = n;
		
	}

	
	@Override
	public boolean isEmpty() {
		return top == null;
	}


	@Override
	public T peek() {
		if(isEmpty())
			throw new EmptyStackException();
		else
			return top.data;
	
	}

	@Override
	public T pop() {
		if(top != null){
		  T head = top.data;
		  top = top.next;
			return head;
		}
		else
			throw new EmptyStackException();
	}
	@Override
	public void clear() {
		top = null;
		
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+\n";
		return s;
	}
	
	private class Node {
	  private T data; 
	  private Node next; 

		private Node(T dataPortion)	{
			this(dataPortion, null);	
		}
		
		private Node(T dataPortion, Node nextNode){
			data = dataPortion;
			next = nextNode;	
		}
	}
   public static void main(String[]args){
	   Stack<String> stack = new LinkedStack<>();
	   stack.push("A");
	   stack.push("B");
	   stack.push("C");
	   stack.push("D");
	   stack.push("E");
	   stack.pop();
	   stack.pop();
	   
   }
}
