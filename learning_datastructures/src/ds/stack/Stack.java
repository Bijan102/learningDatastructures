package ds.stack;

/**
 * @author bijanfazeli
 *
 */
public class Stack {
	
	//Private variables to keep track of the maxSize and the top of the stack
	private int maxSize, top;
	//Declared an array that will be used as a stack once it's assigned an array 
	private long[] stackArray;
	
	//Constructor for creating a stack
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long [maxSize];
		this.top = -1;
	}
	
	
	/**
	 * push - Pushes an element onto the stack when called
	 * 
	 * @param j - A long type that is to be pushed onto the stack
	 * 
	 */
	public void push(long j) {
		if (isFull()) System.out.println("This stack is already full.");
		else {
			top++;
			stackArray[top] = j;
		}
	}
	
	/**
	 * pop - Pops an element off the stack by moving the top pointer down one 
	 * 		and returns the recently removed element.
	 * 
	 * @return stackArray[old_top] - The most recent element that the top pointer was at.
	 */
	public long pop() {
		if (isEmpty()) {
			System.out.println("The stack is already empty.");
			return -1;
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	
	/**
	 * peak - Returns the current element on the top of the stack
	 * 
	 * @return stackArray[top] - The top most element on the stack
	 */
	public long peak(){
		return stackArray[top];
	}
	
	
	/**
	 * isEmpty - Checks to see if the stack is empty or not
	 * 
	 * @return Evaluation of top == -1
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	/**
	 * isFull - Checks to see if the current stack is full by comparing positions
	 * 
	 * @return Evaluation of maxSize - 1 == top
	 */
	public boolean isFull() {
		return maxSize-1 == top;
	}
}
