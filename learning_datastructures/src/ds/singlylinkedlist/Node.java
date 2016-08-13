package ds.singlylinkedlist;

public class Node {
	public int data; //Will contain int data
	public Node next; //Will contain the next Node in the list
	
	
	/**
	 * displayNode -	This method will display the data contained in the current node
	 * 
	 * 
	 */
	public void displayNode() {
		System.out.println("{ " + data + " } ");
	}
}
