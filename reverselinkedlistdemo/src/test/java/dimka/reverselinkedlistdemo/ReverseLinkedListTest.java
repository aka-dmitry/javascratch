package dimka.reverselinkedlistdemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ReverseLinkedListTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public ReverseLinkedListTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(ReverseLinkedListTest.class);
	}

	/**
	 * Reversed list should match the expected values.
	 */
	public void testReverseLinkedList() {
		int[] values = { 1, 2, 3, 4, 5 };
		int[] expected = { 5, 4, 3, 2, 1 };

		Node linkedList = LinkedListHelper.arrayToLinkedList(values);
		Node output = ReverseLinkedList.reverseLinkedList(linkedList);

		Node current = output;
		for (int expectedNumber : expected) {
			
			assertTrue("Expected : " + expectedNumber + "\nReturned : " + current.getNumber(),
					current.getNumber() == expectedNumber);
			
			current = current.getNext();
		}
	}
}
