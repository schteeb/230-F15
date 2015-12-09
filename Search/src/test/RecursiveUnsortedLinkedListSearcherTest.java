package test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import submission.Node;
import submission.RecursiveUnsortedLinkedListSearcher;

public class RecursiveUnsortedLinkedListSearcherTest extends TestCase{
	Node array; // = new Node;
	int[] tests = {40, -30, 10, -20, 0};
	
	@Override
	protected void setUp() {
		array = new Node(tests[0]);
		for (int i = 1; i < tests.length; i++)
			array = new Node(tests[i], array);
	}
	
	@Test
	public void testFound() {
		assertTrue(
				RecursiveUnsortedLinkedListSearcher.search(array, 10));
	}
	
	@Test
	public void testFoundLast() {
		assertTrue(
				RecursiveUnsortedLinkedListSearcher.search(array, 40));
	}
	
	@Test
	public void testFoundFirst() {
		assertTrue(
				RecursiveUnsortedLinkedListSearcher.search(array, 0));
	}
	
	@Test
	public void testNotFound() {
		assertFalse(
				RecursiveUnsortedLinkedListSearcher.search(array, 230));
	}

}
