package submission;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail;
	
	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		String s = data[head].toString();
		for (int i = head+1 % data.length; i >= 0; i--)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}

}
