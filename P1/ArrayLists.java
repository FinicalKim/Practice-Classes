package P1;

// 1 - Normal Array
// 2 - Array List
// 3 - Stack

	//API (Library)
import java.util.ArrayList;
import java.util.Stack;

public class ArrayLists {

	public static void main(String[] args) {
		
			//normal array
		int [] myarray = new int[10];
		
		
		
		
			//ArrayList myArrayList = new ArrayList();
		ArrayList myArrayList = new ArrayList();
		
		myArrayList.add(5);	//create an index 0 and place 5 in it
		System.out.println(myArrayList);
		myArrayList.add("CSC205");
		myArrayList.add(15);
		myArrayList.add(0,3.7);	//Bumps 3.7 to index 0 shifting every other value up
		//myArrayList.remove(15);	//removes 15 from the ArrayList
		System.out.println(myArrayList);
		//System.out.println(myArrayList.get(1));
		//myArrayList.removeAll(myArrayList);	//removes every value in the ArrayList
		
		
		
		// < > means Generic
		
			//Stack name = new Stack();
			//Stack <Integer> myStack = new Stack <Integer> ();		//this will make the stack only accept int values, can also use Double, String, ect
		Stack myStack = new Stack();
		myStack.push(6);
		System.out.println(myStack);
		myStack.push(17);
		myStack.push(20);
		myStack.push("CSC205");
		myStack.peek();	//print what's at the top of the stack (only the top)
		myStack.pop();		//print what's at the top and then remove it
		
		
	}

}
