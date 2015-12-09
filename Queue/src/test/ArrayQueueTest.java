package test;

import static org.junit.Assert.*;

import org.junit.Test;

import adt.Queue;
import submission.*;

public class ArrayQueueTest {
	private static final int MAX_CAPCITY = 0;
	private Queue<String> queue = new ArrayQueue<String>();
	private static int MAX_CAPACITY = 100;

	@Test
	public void testClear() {
		queue.enqueue("A");
		queue.clear();
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testEnqueue() {
		queue.clear();
		queue.enqueue("A");
		String s = "A\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testEnqueue2() {
		queue.clear();
		queue.enqueue("A");
		queue.enqueue("C");
		String s = "A -> C\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testEnqueue3() {
		queue.clear();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		String s = "A -> B -> C\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testDequeue() {
		queue.clear();
		queue.enqueue("A");
		queue.enqueue("C");
		String t = queue.dequeue();
		String s = "C\n";
		assertTrue(queue.toString().equals(s));
		assertTrue(t.equals("A"));
	}
	
	@Test
	public void testDequeueEmpty() {
		queue.clear();
		queue.dequeue();
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testPeek() {
		queue.clear();
		queue.enqueue("A");
		queue.enqueue("C");
		String t = queue.peek();
		assertTrue(t.equals("A"));
		t = queue.peek();
		assertTrue(t.equals("A"));
		String s = "A -> C\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testEnqueueMany() {
		// Should exceed initial capacity
		queue.clear();
		String s = Integer.toString(0);
		queue.enqueue(Integer.toString(0));
		for (int i = 1; i < MAX_CAPACITY; i++) {
			queue.enqueue(Integer.toString(i));
			s += " -> " + i;
		}
		s += "\n";
		assertTrue(queue.toString().equals(s));
	}
	
	// TODO test enqueue / dequeue many to force wrap around
	public void testEnqueueWrapAround() {
		// Should exceed initial capacity
		queue.clear();
		String s = Integer.toString(0);
		queue.enqueue(Integer.toString(0));
		for (int i = 1; i < MAX_CAPACITY; i++) {
			for (int j = 0; j < MAX_CAPCITY / 2; j++) {
				queue.enqueue(Integer.toString(i));
				s += " -> " + j;
			}
			for (int j = i; j < MAX_CAPACITY;) {
				queue.enqueue(Integer.toString(j));
			}
			for (int j = i; j < MAX_CAPACITY;) {
				queue.dequeue();
			}
		}
		s += "\n";
		assertTrue(queue.toString().equals(s));
	}
	
	

}
