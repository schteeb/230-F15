package test;

import static org.junit.Assert.*;

import org.junit.Test;

import submission.RecursiveInsertionSorter;

public class RecursiveInsertionSorterTest {

	@Test
	public void testSortDefault() {
		int[] unsorted = {0};
		int[] sorted   = {0};
		assertArrayEquals(sorted, 
				RecursiveInsertionSorter.sort(unsorted));
	}
	
	@Test
	public void testSortBasic() {
		int[] unsorted = {5, 67, 12, 20};
		int[] sorted   = {5, 12, 20, 67};
		assertArrayEquals(sorted, 
				RecursiveInsertionSorter.sort(unsorted));
	}
	
	@Test
	public void testSorted() {
		int[] unsorted = {1, 5, 12, 20, 67};
		int[] sorted   = {1, 5, 12, 20, 67};
		assertArrayEquals(sorted, 
				RecursiveInsertionSorter.sort(unsorted));
	}
	
	@Test
	public void testSortNegative() {
		int[] unsorted = {-5, 67, -12, 2};
		int[] sorted   = {-12, -5, 2, 67};
		assertArrayEquals(sorted, 
				RecursiveInsertionSorter.sort(unsorted));
	}
	
	@Test
	public void testSortDupes() {
		int[] unsorted = {-5, -5, -34, -25, 100, 100, 100, 33};
		int[] sorted   = {-34, -25, -5, -5, 33, 100, 100, 100};
		assertArrayEquals(sorted, 
				RecursiveInsertionSorter.sort(unsorted));
	}

}
