package ds.singlylinkedlist;

public class SinglyLinkedList {
	//Head pointer, points to the first Node in the linkedList
	private Node first, last = first;
	
	
	/**
	 * isEmpty	-	Checks to see if the current list is empty
	 * 
	 * @return	-	The evaluation of the statement, first == null.
	 */
	public boolean isEmpty() {
		return (first.equals(null));
	}
	
	/**
	 * insert	-	Creates a new node that will be added as the first node in the linkedList 
	 * 				with the given data.
	 * 
	 * @param data	-	The data to be stored in a newly created Node in the linked list.
	 */
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		if (first == null) {last = newNode;}  
		first = newNode;
	}
	
	/**
	 * deleteFirst	-	Removes the first element in the linked list and returns it to the calling function.
	 * 
	 * @return	-	The node that was deleted.
	 */
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		
		return temp;
	}
	
	/**
	 * displayList	-	Displays the linkedLists' contents.
	 * 
	 */
	public void displayList() {
		System.out.println("Printing all data stored in the linkedList: ");
		
		//Declare and initi a Node, 'current' to point to an object in mem, referenced by first.
		Node current = first;
		
		//While current Node is not null, iterate through the list
		while(current != null) {
			current.displayNode();		//Display the content of the current Node
			current = current.next;		//Iterate through the list by assigning current the ref to the next node in the list
		}
		
		//Clean up end of display by adding a blank line (separator)
		System.out.println();
	}
	
	/**
	 * insertLast	-	Creates a new node that will be added to the last node in the linkedList 
	 * 					with the given data.
	 * 
	 * @param data	-	The data to be stored in a newly created Node in the linked list.
	 */
	public void insertLast(int data) {
//		Node current = last;
		
//		while(current.next != null) {
//			current = current.next; //Loop until current.next is null
//		}
		
		Node newNode = new Node();
		newNode.data = data;
//		current.next = newNode;
//		last = newNode;
		if (first == null) {
			last = newNode;
			first = last;
		} else last.next = newNode;
	}
}
