package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first, last;
	
	/**
	 * DoublyLinkedList Constructor - Initializes the fields of the DoublyLinkedList obj 
	 * 								  when instantiated.
	 * 
	 */
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	/**
	 * isEmpty	-	Checks to see if the current list is empty
	 * @return	- 	Returns the eval of first == null
	 */
	private boolean isEmpty() {
		return first == null;
	}
	
	/**
	 * insertFirst	-	Creates a new node that will be added as the first node in the linkedList 
	 * 				with the given data.
	 * 
	 * @param data	-	The data to be stored in a newly created Node in the linked list.
	 */
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) last = newNode;	//Last will get the
		else first.previous = newNode;
		
		newNode.next = first;	//The new nodes' next field will pt to the old-first
		this.first = newNode;
	}
	
	/**
	 * insertLast	-	Creates a new node that will be added as the last node in the linkedList 
	 * 					with the given data.
	 * 
	 * @param data	-	The data to be stored in a newly created Node in the linked list.
	 */
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
	/**
	 * deleteFirst	-	Removes the first node from the list
	 * 
	 * @return		-	The node that will be removed
	 */
	public Node deleteFirst() {
		Node temp = first;
		if(first.next == null) last = null;		//There is only one item in the list
		else first.next.previous = null;
		
		first = first.next;		//Assigning the reference of the 
		return temp;			//Return the deleted old first node
	}
	
	//Assume non-empty list
	public Node deleteLast() {
		Node temp = last;
		if(first.next == null) first = null;	//Only one node in the list
		else last.previous.next = null;			//Last nodes' previous nodes' next field will pt to null
		
		last = last.previous;
		return temp;
	}
	
	//Assume non-empty list
	public boolean insertAfter(int key, int data) {
		Node current = first;		//Start from the beginning of the list
		//As long as the key is not found in the list
		while(current.data != key) {current = current.next;}
		
		if(current == null) return false;	//Key is not in the list
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	//Assume non-empty list
	public Node deleteKey(int key) {
		Node current = first;
		
		while(current.data != key) {current = current.next;}
		
	}
}
