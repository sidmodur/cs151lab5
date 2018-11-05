import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DoublyLinkedListTest {

	int num1 = 1;
	int num2 = 2;
	int num3 = 3;
	int num4 = 4;
	
	
	@Test
	public void testEmpty() {
		DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
		assertTrue("isEmpty() false negative", test.isEmpty());
		test.add(new Integer(1));
		assertFalse("isEmpty() false positive", test.isEmpty());
	}
	
	
	@Test
	public void testAdd() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList<Integer>();
		ArrayList<Integer> stan = new ArrayList<Integer>();
		int num1 = 1;
		int num2 = 2;
		test.add(num1);
		stan.add(num1);
		assertEquals("Index 0", stan.get(0), test.get(0));
		test.add(num2);
		stan.add(num2);
		assertEquals("Index 0", stan.get(0), test.get(0));
	}
	
	@Test
	public void testAddAtIndex() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList<Integer>();
		ArrayList<Integer> stan = new ArrayList<Integer>();
		int num1 = 1;
		int num2 = 2;
		test.add(0,num1);
		stan.add(0,num1);
		assertEquals("Index 0", stan.get(0), test.get(0));
		test.add(0,num2);
		stan.add(0,num2);
		assertEquals("Index 0", stan.get(0), test.get(0));
		assertEquals("Index 1", stan.get(1), test.get(1));
	}
	
	@Test
	public void testRemoveFront() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList<Integer>();
		ArrayList<Integer> stan = new ArrayList<Integer>();
		int num1 = 1;
		int num2 = 2;
		test.add(num1);
		stan.add(num1);
		test.add(num2);
		stan.add(num2);
		while(!test.isEmpty()) {
		assertEquals("Added Elements are the same", test.remove(0), stan.remove(0));
		}
	}

	
	
	public void testRemoveBack() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList<Integer>();
		ArrayList<Integer> stan = new ArrayList<Integer>();
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		test.add(num1);
		stan.add(num1);
		test.add(num2);
		stan.add(num2);
		test.add(num3);
		stan.add(num3);
		test.add(num4);
		stan.add(num4);
		while(!test.isEmpty()) {
		assertEquals("Added Elements are the same", test.remove(test.size()-1), stan.remove(stan.size()-1));
		}
	}
	
	@Test
	public void testSet() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList<Integer>();
		ArrayList<Integer> stan = new ArrayList<Integer>();
		test.add(0);
		stan.add(0);
		assertEquals("Index 0", stan.get(0), test.get(0));
		test.set(0, 1);
		stan.set(0, 1);
		assertEquals("Index 0", stan.get(0), test.get(0));
	}
	
	

}
