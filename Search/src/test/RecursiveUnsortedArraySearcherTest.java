package test;

import static org.junit.Assert.*;

import org.junit.Test;

import submission.RecursiveUnsortedArraySearcher;

public class RecursiveUnsortedArraySearcherTest {

	int[] array   = {40, -30, 10, -20, 0};
	
	@Test
	public void testFound() {
		assertEquals(
				RecursiveUnsortedArraySearcher.search(array, 10),
				2);
	}
	
	@Test
	public void testFoundFirst() {
		assertEquals(
				RecursiveUnsortedArraySearcher.search(array, 40),
				0);
	}
	
	@Test
	public void testFoundLast() {
		assertEquals(
				RecursiveUnsortedArraySearcher.search(array, 0),
				array.length-1);
	}
	
	@Test
	public void testNotFound() {
		assertEquals(
				RecursiveUnsortedArraySearcher.search(array, 230),
				-1);
	}

}
