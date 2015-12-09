package submission;

import java.util.NoSuchElementException;

import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail;
	
	@Override
	public void enqueue(T newEntry) {
		tail = (tail + 1) % data.length;
		data[tail] = newEntry;
	}

	@Override
	public T dequeue() {
		if(isEmpty())
			throw new NoSuchElementException();
		else
		{
			T front = data[head];
			data[head] = null;
			head = (head + 1) %data.length;
			return front;
		}
	}

	@Override
	public T peek() {
		if(isEmpty())
			throw new NoSuchElementException();
		else
			return data[head];

	}

	@Override
	public boolean isEmpty() {
		return head == 0;
	}

	@Override
	public void clear() {
		head = -1;
		
	}
	
	public String toString() {
		String s = "";
		if (!isEmpty())
			s = data[head].toString();
		for (int i =  (head+1) % data.length; 
				 i <= (tail + data.length) % data.length; 
				 i =  (i + 1) % data.length)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}

}
