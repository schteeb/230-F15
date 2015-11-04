package test;

import static org.junit.Assert.*;

import org.junit.Test;
import submission.Palindrome;

public class PalindromeTest {

	private String clean(String s) {
		return s.replaceAll("[^A-Za-z0-9]", "");
	}
	
	@Test
	public void testIsPalindrome() {
		String s = "A man, a plan, a canal: PANAMA!";
		assertTrue(s, Palindrome.isPalindrome(clean(s)));
	}
	
	@Test
	public void testIsPalindrome2() {
		String s = "2002";
		assertTrue(s, Palindrome.isPalindrome(clean(s)));
	}
	
	@Test
	public void testIsNotPalindrome() {
		String s = "Chocolate Chip Cookie Dough";
		assertFalse(s, Palindrome.isPalindrome(clean(s)));
	}
	
	
	@Test
	public void testIsNotPalindrome2() {
		String s = "1999";
		assertFalse(s, Palindrome.isPalindrome(clean(s)));
	}

}
