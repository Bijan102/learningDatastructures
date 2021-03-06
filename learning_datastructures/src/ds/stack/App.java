package ds.stack;

public class App {
	
	public static void main(String[] args) {
		//Stack theStack;
		
		//Push values to the stack, 20, 40, 60, 80
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);
//		theStack.push(80);
		
		//Print the reversed string 'Hello'
		System.out.println(reverseString("Hello"));
		
//		//Create a while to pop elements off the stack so long as the stack is not empty
//		while(!theStack.isEmpty()){
//			//Print the values popped off the stack to the console
//			System.out.println(theStack.pop());
//		}
	}
	
	/**
	 * reverseString -	Takes in a String and reverses the entire string
	 * 
	 * @param str - A string to be reversed
	 * @return The reversed string.
	 * 
	 * ex:	String container = "Hello";
	 * 		will return oellH to the calling fnx
	 */
	public static String reverseString(String str) {
		//Create an empty String, 'container' that will hold the reversed string
		String container = "";
		
		//Declare and instantiate a Stack that is the size of the string 'theStack'
		Stack theStack = new Stack(str.length());
		
		//Create a for-loop to push the indivi char of the string to the stack
		for(int i = 0, max = str.length(); i < max; i++) theStack.push(str.charAt(i));
		
		//Create a while-loop to pop off the indivi char from the stack and store in container
		while(!theStack.isEmpty()) container += theStack.pop();
		
		return container;
	}
}
