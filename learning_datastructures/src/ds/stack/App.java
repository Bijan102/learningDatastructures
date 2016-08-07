package ds.stack;

public class App {

	public static void main(String[] args) {
		
		//Declare and initialize a Stack called theStack of size 10
		Stack theStack = new Stack(3);
		
		//Push values to the stack, 20, 40, 60, 80
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		//Create a while to pop elements off the stack so long as the stack is not empty
		while(!theStack.isEmpty()){
			//Print the values popped off the stack to the console
			System.out.println(theStack.pop());
		}
	}

}
