
class MRUList<T> extends DoublyLinkedList<T> {
	
	private void moveToFront (ListNode toMove) {
		toMove.prior.next = toMove.next;
		toMove.next.prior = toMove.prior;
		add(toMove.datum);
	}
	
	public boolean add(T data) {
		super.add(0,data);
		return true;
	}
	
    public void add(int index, T data) {
    	throw new UnsupportedOperationException();
    }
    
    public int indexOf(Object obj) {
        int index = 0;
        ListNode node = header.next;
        for (; node != trailer; node = node.next) {
     	   if (obj.equals(node.datum)) {
     		   moveToFront(node);
     		   return index;
     	   }
     	   index++;
        }
        return -1; 
    }
}
