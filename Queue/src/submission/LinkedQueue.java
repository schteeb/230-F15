package submission;

import java.util.NoSuchElementException;

import adt.Queue;

public class LinkedQueue<T> implements Queue<T> {
	private Node head, tail;
	
	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if (isEmpty())
			head = newNode;
		else
			tail.setNextNode(newNode);
		tail = newNode;
		
	}

	@Override
	public T dequeue() {
		T front = peek();
		assert head !=null;
		head.setData(null);
		head = head.getNextNode();
		if (head == null)
			tail = null;
		return front;
	}

	@Override
	public T peek() {
		if (isEmpty())
			throw new NoSuchElementException();
		else
			return head.getData();
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void clear() {
		head = null;
		
	}
	
	public String toString() {
		String s = head.data.toString();
		for (Node i = head.next; i != null; i = i.next)
			s += " -> " + i.data;
		s+= "\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		public void setData(T d) {
			data = d;
		}

		public Node getNextNode() {
			return next;
		}

		public T getData() {
			return data;
		} //end constructor

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
		private void setNextNode(Node nextNode){
			next = nextNode;
		} // end constructor
	} // end Node

}
