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
       clear();
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
       ListNode node = getNthNode(position);
       T oldElem = node.datum;
       node.datum = data;
       return oldElem;
   }
   
   /*
    * Inserts the given data item at the end of the list.
    */
   public boolean add(T data) {
      trailer.prior.next = new ListNode(data, trailer.prior, trailer);
      return true;
   }
   
   /*
    * Inserts the given data item at the given position in the list.
    */
   public void add(int position, T data) {
      ListNode prior = getNthNode(position - 1);
      prior.next = new ListNode(data, prior, prior.next);
   }
   
   /*
    * Removes the element at a given index in the list.
    */
   public T remove(int index) {
      ListNode toDel = getNthNode(index);
      toDel.prior.next = toDel.next;
      toDel.next.prior = toDel.prior;
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
   
   /*
    * Deletes all elements from the list.
    */
   public void clear() {
       header.next = trailer;
       trailer.prior = header;
       size = 0;
   }
   
   /*
    * Determines if the list is empty.
    */
   public boolean isEmpty() {
      return size==0;
   }
   
   /*
    * Returns an iterator for this list
    */
   public Iterator<T> iterator(){
       // TODO: Write the iterator method
       return null;  /* replace this line */
   }
}

