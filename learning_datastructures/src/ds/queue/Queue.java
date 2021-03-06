package ds.queue;

public class Queue {
	//Declare an int variable to hold the max amount of slots in a queue
	private int maxSize;
	
	//Declare an array of type long
	private long [] queArray;
	
	//Declare an int, 'front' to hold the index position at the front of the queue
	private int front;
	
	//Declare an int, 'rear' to hold the index position for the elements at the back of the queue
	private int rear;
	
	//Declare an int, 'nItems' that will serve as a counter to count the number of items in the queue
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; //Assign front to 0 to index the pos of first slot of the array
		rear = -1; //Assign rear to -1 b.c there are no items in the array yet to be considered as the last item.
		nItems = 0; //Assign nItems to 0, b.c there are no elements in the array yet
	}
	
	public void insert(long value) {
		if (rear == maxSize -1) {
			rear = -1;
		}
		rear++;
		queArray[rear] = value;
		nItems++;
	}
	
	public long remove() {
		long temp = queArray[front];
		front++;
		if(front == maxSize) {front = 0;} //Set front back to the 0th index to utilize the entire array again
		nItems--;
		
		return temp;
		
	}
	
	public long peakFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() { return nItems ==0;}
	
	public boolean isFull() {return front == maxSize;}
	
	public void view() {
		System.out.print("[");
		for(int i = 0; i < queArray.length; i++) {
			if (i == (queArray.length - 1)) {System.out.print(queArray[i]);}
			else {System.out.print(queArray[i] + ", ");}
		}
		
		System.out.print("]");
	}
	
}
