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
		DoublyLinkedList <String> test = new DoublyLinkedList<String>();
		ArrayList<String> stan = new ArrayList<String>();
		assertTrue("Initialized DoublyLinkedList is Empty", test.size() == 0); 
	}
	
	@Test
	public void testNotEmpty() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList<Integer>();
		ArrayList<Integer> stan = new ArrayList<Integer>();
		test.add(num1);
		assertTrue("Initialized DoublyLinkedList is Empty", test.size() == 1); 
	} 
	
	@Test
	public void testAdd() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList<Integer>();
		ArrayList<Integer> stan = new ArrayList<Integer>();
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		test.add(num1);
		stan.add(num1);
		assertEquals("Index 0", stan.get(0), test.get(0));
		test.add(num2);
		stan.add(num2);
		assertEquals("Index 0", stan.get(0), test.get(0));
	}
	
	@Test
	public void testRemoveFront() {
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
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
	}
	
	

}
