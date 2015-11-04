package adt;


public class LinkedBag<T> implements BagInterface<T>{
	private Node head = null;       // Reference to first node
	private int numEntries = 0;
	
	public String toString() {
		String s = "";
		// iterate over all the items in people chain
		Node n = head;
		while (n != null) {
			// do something to s with n's name
			s += n.data + " -> ";
			n = n.next;
		}
		s += "null";
		return s;
	}

	@Override
	public int getCurrentSize() {
		return numEntries;
	}

	@Override
	public boolean isEmpty() {
		return numEntries == 0;
	}

	@Override
	public boolean add(T newEntry) {
		head = new Node(newEntry, head);
		return true;
	}

	@Override
	public T remove() {
		T temp = head.data;
		head = head.next;
		return temp;
	}

	@Override
	public boolean remove(T anEntry) {
		Node n = head;
		Node prev = null;
		while (n != null) {
			if (n.data.equals(anEntry)) {
				// remove the node
				if (prev == null) // only for the first case
					head = head.next;
				else
					prev.next = n.next; // all other cases
				numEntries--;
				return true;
			}
			prev = n;
			n = n.next;
		}
		return false;
	}

	@Override
	public void clear() {
		head = null;
		numEntries = 0;
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		T[] array = (T[]) new Object[numEntries];
		Node n = head;
		int i = 0;
		while (n != null) { // could also be for i < numEntries
			// do something -- copy
			array[i] = n.data;
			i++;
			n = n.next;
		}
		return array;
	}
	
	
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node
	
	public static void main(String[] args) {
		LinkedBag<String> bag = new LinkedBag<String>();
		bag.add("CSCI");
		bag.add("230");
		bag.add("is");
		bag.add("awesome!");
		System.out.println(bag);
		bag.remove();
		System.out.println(bag);
		bag.remove("CSCI");
		System.out.println(bag);
		bag.clear();
		System.out.println(bag);
	}

}
