package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		//Declare and instantiate a DoublyLinkedList object, 'list'.
		DoublyLinkedList list = new DoublyLinkedList();
		
		//Insert data into the list
		list.insertFirst(22);
		list.insertFirst(42);
		list.insertFirst(62);
		
		list.insertLast(82);
		list.insertLast(102);
		list.insertLast(122);
		
		//Display the list
		list.displayForward();
		list.displayBackward();
		
		//Delete Nodes in the list
		list.deleteFirst();
		list.deleteLast();
		
		list.deleteKey(82);
		
		//Display the list
		list.displayForward();
		list.displayBackward();
		
		//Insert data into the list after a specific key
		list.insertAfter(42, 72);
		list.insertAfter(102, 112);
		
		//Display the list
		list.displayForward();
	}

}
