/*
 * DoublyLinkedList
 * 
 * This class implements the Java List interface using a doubly-linked list.
 * 
 * A nested ListNode class is included.
 * 
 */
import java.util.*;

public class DoublyLinkedList<T> extends AbstractList<T> {
	int modCount;
    int size;
    ListNode header, trailer;
   
   /*
    * ListNode
    * 
    * This nested class represents one node in a doubly linked list.
    */
   protected class ListNode {
      T datum;
      ListNode prior, next;

       ListNode(){
	   this(null);
       }
      
       ListNode(T data){
	   this(data,null,null);
       }
      
       ListNode(T data, ListNode prior, ListNode next){
	   this.datum = data;
	   this.prior = prior;
	   this.next = next;
       }
   } // end of class ListNode
   
   /*
    * Constructs an empty list.
    */
   DoublyLinkedList(){
       header = new ListNode();
       trailer = new ListNode();
       modCount = 0;
       emptyList();
   }
   
   /*
    * Returns a reference to the nth node in the list.
    */
   private ListNode getNthNode(int n) {
      if (n < 0 || n >= size) {
    	  throw new IndexOutOfBoundsException();
      } else {
    	  ListNode node = header.next;
    	  for (int i = 0; i < n; i++) {
    		  node = node.next;
    	  }
    	  return node;
      }
   }
   
   /*
    * Returns a count of the number of elements in the list.
    */
   public int size() {
      return size;
   }
   
   /*
    * Returns the data item at the given position in the list.
    */
   public T get(int position) {
      return getNthNode(position).datum;
   }
   
   /*
    * Replaces the item at the given position with the
    * given data item.  The return value is the element
    * that is replaced.
    */
   public T set(int position, T data) {
	   if (data == null) {
		   throw new NullPointerException();
	   }
       ListNode node = getNthNode(position);
       T oldElem = node.datum;
       node.datum = data;
       return oldElem;
   }
   
   /*
    * Inserts the given data item at the end of the list.
    */
   public boolean add(T data) {
	   if (data == null) {
		   throw new NullPointerException();
	   }
       trailer.prior.next = new ListNode(data, trailer.prior, trailer);
       trailer.prior = trailer.prior.next;
       size++;
       modCount++;
       return true;
   }
   
   /*
    * Inserts the given data item at the given position in the list.
    */
   public void add(int position, T data) {
	   if (data == null) {
		   throw new NullPointerException();
	   }
	   ListNode prior = header;
	   if (position != 0) {
		   prior = getNthNode(position - 1);
	   }
       ListNode newNode = new ListNode(data, prior, prior.next);
       prior.next = newNode.next.prior = newNode;
       modCount++;
       size++;
   }
   
   /*
    * Removes the element at a given index in the list.
    */
   public T remove(int index) {
      ListNode toDel = getNthNode(index);
      toDel.prior.next = toDel.next;
      toDel.next.prior = toDel.prior;
      modCount++;
      size--;
      return toDel.datum;
   }
   
   /*
    * Searches the list for the given object
    */
   public boolean contains(Object obj){
       return (indexOf(obj) != -1);
   }
   
   /*
    * Returns the position of the given object
    */
   public int indexOf(Object obj){
       int index = 0;
       ListNode node = header.next;
       for (; node != trailer; node = node.next) {
    	   if (obj.equals(node.datum)) {
    		   return index;
    	   }
    	   index++;
       }
       return -1;
   }
   
   private void emptyList() {
       header.next = trailer;
       trailer.prior = header;
       size = 0;
   }
   
   /*
    * Deletes all elements from the list.
    */
   public void clear() {
	   emptyList();
       modCount++;
   }
   
   /*
    * Determines if the list is empty.
    */
   public boolean isEmpty() {
      return size==0;
   }
   
   class DLLIterator implements Iterator<T> {
	   ListNode currNode;
	   DoublyLinkedList<T> dll;
	   int modCount;
	   boolean nextCalled;
	   
	   private DLLIterator(DoublyLinkedList<T> lst) {
		   dll = lst;
		   currNode = dll.header;
		   modCount = dll.modCount;
		   nextCalled = false;
	   }
	   
	   private void checkConcurrency() {
		   if (modCount != dll.modCount) {
			   throw new ConcurrentModificationException();
		   }
	   }
	   
	   public boolean hasNext() {
		   checkConcurrency();
		   return (currNode.next != dll.trailer);
	   }
	   
	   public T next() {
		   if (!hasNext()) {
			   throw new NoSuchElementException();
		   }
		   currNode = currNode.next;
		   nextCalled = true;
		   return currNode.datum;
	   }
	   
	   public void remove() {
		   if (!nextCalled) {
			   throw new IllegalStateException();
		   }
		   checkConcurrency();
		   ListNode toDel = currNode.prior;
		   currNode.prior = toDel.prior;
		   toDel.prior.next = toDel.next;
		   modCount++;
		   dll.modCount++;
		   nextCalled = false;
	   }
   }
   
   /*
    * Returns an iterator for this list
    */
   public Iterator<T> iterator(){
	   return new DLLIterator(this);
   }
}

