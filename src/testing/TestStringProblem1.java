package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practice.StringProblemDP;

public class TestStringProblem1 {

	StringProblemDP obj = new StringProblemDP();

	@Test
	public void testSubString() {
		assertEquals("Please Enter 2 strings!", obj.findMaxSubstring("sdagfsdfsdf", null));
		assertEquals("Please Enter 2 strings!", obj.findMaxSubstring(null, "absjxksfsd"));
		assertEquals("pqr", obj.findMaxSubstring("pqr", "jshfdkjhpqr"));
		assertEquals("mno", obj.findMaxSubstring("sjsjsjshgjmnosdfj", "mno"));
		assertEquals("abcd", obj.findMaxSubstring("abcdxyz", "xyzabcd"));
		assertEquals("sd", obj.findMaxSubstring("sdagfsdfsdf", "sdjfdskj"));
		assertEquals("asdfgh", obj.findMaxSubstring("asdfgh", "ASDFGH"));
		
	}
}
