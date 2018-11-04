import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

public class DoublyLinkedListTest {
	
	int int0 =0;
	int int1 =1;
	int int2 = 2;
	int int3 = 3;
	
	/*
	 * Testing of general class functionality
	 * 
	 */
	@Test
	public void testInit() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		LinkedList <Integer> stan = new LinkedList<Integer>();
		assertTrue("Initial Size 0", test.size() == stan.size());
		assertTrue("Initial Size 0", test.isEmpty());
	}
	
	@Test
	public void testAdd() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		LinkedList <Integer> stan = new LinkedList<Integer>();
		test.add(int0);
		stan.add(int0);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 0", test.get(0), stan.get(0));
		test.add(int1);
		stan.add(int1);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 1", test.get(1), stan.get(1));
		test.add(int2);
		stan.add(int2);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 2", test.get(2), stan.get(2));
	}
	
	@Test
	public void testRemove0() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		LinkedList <Integer> stan = new LinkedList<Integer>();
		test.add(int0);
		stan.add(int0);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 0", test.get(0), stan.get(0));
		test.add(int1);
		stan.add(int1);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 1", test.get(1), stan.get(1));
		test.add(int2);
		stan.add(int2);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 2", test.get(2), stan.get(2));
		assertEquals("Elements the same, remove int 0", test.remove(0), stan.remove(0));
		assertEquals("Elements the same, remove index 1", test.remove(0), stan.remove(0));
		assertEquals("Elements the same, remove index 2", test.remove(0), stan.remove(0));
		}
	
	@Test
	public void testRemoveSize() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		LinkedList <Integer> stan = new LinkedList<Integer>();
		test.add(int0);
		stan.add(int0);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 0", test.get(0), stan.get(0));
		test.add(int1);
		stan.add(int1);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 1", test.get(1), stan.get(1));
		test.add(int2);
		stan.add(int2);
		assertTrue("Size after addition", test.size() == stan.size());
		assertEquals("Elements the same, index 2", test.get(2), stan.get(2));
		assertEquals("Elements the same, remove int 0", test.remove(test.size() -1 ), stan.remove(stan.size() -1));
		assertEquals("Elements the same, remove index 1", test.remove(test.size() -1), stan.remove(stan.size() -1));
		assertEquals("Elements the same, remove index 2", test.remove(test.size() -1), stan.remove(stan.size() - 1));
		}
	
	@Test
	public void testClear() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		LinkedList <Integer> stan = new LinkedList<Integer>();
		test.add(int0);
		stan.add(int0);
		test.add(int1);
		stan.add(int1);
		test.add(int2);
		stan.add(int2);
		test.clear();
		stan.clear();
		assertTrue("Empty After Cleared", test.isEmpty());
		}
	
	
	//Uncomment this method to receive IndexOutOfBoundsException
	/*
	@Test
	public void testOutOfBounds() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		LinkedList <Integer> stan = new LinkedList<Integer>();
		test.add(int0);
		stan.add(int0);
		test.add(int1);
		stan.add(int1);
		test.add(int2);
		stan.add(int2);
		test.clear();
		stan.clear();
		assertTrue("Empty After Cleared", test.isEmpty());
		test.get(0);
		}
	*/
	
	
	
	/*
	 * Testing of Iterator
	 */
	
	@Test
	public void testInitIterator() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		test.add(int0);
		test.add(int1);
		test.add(int2);	
		Iterator<Integer> cycler = test.iterator();
		assertTrue("Iterates has next", cycler.hasNext());
	}
	
	@Test
	public void testRemove() {
		DoublyLinkedList <Integer> test = new DoublyLinkedList <Integer>();
		for ( int i = 1; i < 20; i++) {
			test.add(i);
		}
		Iterator<Integer> cycler = test.iterator();
		while(cycler.hasNext()) {
			int next = cycler.next();
			if(next % 3 == 0)
				cycler.remove();
			else System.out.println(next);
		}
	}
}



