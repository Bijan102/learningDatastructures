package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first, last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) last = newNode;	//Last will get the
		else first.previous = newNode;
		
		newNode.next = first;	//The new nodes' next field will pt to the old-first
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) first = newNode;
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		
		last = newNode;			//The linkedLists' last field should pt to the newNode
	}
	
	//Assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if(first.next == null) last = null;		//There is only one item in the list
		else first.next.previous = null;
		
		first = first.next;		//Assigning the reference of the 
		return temp;			//Return the deleted old first node
	}
}
