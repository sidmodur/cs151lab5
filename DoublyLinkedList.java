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
       /* TODO:  Write a constructor here      
	  The empty list has two sentinel nodes, a header and a
	  trailer, linked to each other
       */
   }
   
   /*
    * Returns a reference to the nth node in the list.
    */
   private ListNode getNthNode(int n) {
       /* TODO:  Write the getNthNode method  */
       return null;  // replace this line
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
       // TODO: Write the get method
       return null; // replace this to return the element at given position
   }
   
   /*
    * Replaces the item at the given position with the
    * given data item.  The return value is the element
    * that is replaced.
    */
   public T set(int position, T data) {
       // TODO: Write the set method
       return null; // replace this so the replaced element is returned
   }
   
   /*
    * Inserts the given data item at the end of the list.
    */
   public boolean add(T data) {
      // TODO: Write a method to add data to the end of the list
       return true;
   }
   
   /*
    * Inserts the given data item at the given position in the list.
    */
   public void add(int position, T data) {
      // TODO: Write a method to add data at the given position in the list
   }
   
   /*
    * Removes the element at a given index in the list.
    */
   public T remove(int index) {
       // TODO: Write the remove method
       return null;  // replace this line so the removed item is returned
   }
   
   /*
    * Searches the list for the given object
    */
   public boolean contains(Object obj){
       // TODO: Write the contains method
       return false; // replace this line to return the result of the search
   }
   
   /*
    * Returns the position of the given object
    */
   public int indexOf(Object obj){
       // TODO: Write the contains method
       return -1; // replace this line to return the position of obj
   }
   
   /*
    * Deletes all elements from the list.
    */
   public void clear() {
       // TODO: Write the clear method
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

