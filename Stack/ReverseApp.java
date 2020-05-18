import java.io.*;

class StackX
{
	private int maxSize;	//size of stack
	private char[] stackArray;
	private int top;		//top of stack

	//----------------------------------------------

	public StackX(int max) 	//construktor
	{
		maxSize = max;		//set array size
		stackArray = new char[maxSize];	//create array
		top = -1;			//no items yet
	}

	//----------------------------------------------

	public void push(char j)	//put item on top of stack
	{
		stackArray[++top] = j;		//increment top, insert item
	}

	//----------------------------------------------

	public char pop()		//take item from
	{
		return stackArray[top--];	//access item, decrement top
	}

	//----------------------------------------------

	public char peek()	//peek at top of stack
	{
		return stackArray[top];
	}

	//----------------------------------------------

	public boolean isEmpty()	//true if stack is empty
	{
		return (top == -1);
	}
}

class Reverser
{
	public String input;		//input String
	public String output;		//output String

	//----------------------------------------------

	public Reverser (String in)		//constructor
	{
		input = in;
	}

	//----------------------------------------------

	public String doRev()		//reverse the String
	{
		int stackSize = input.length();		//get max stack size
		StackX theStack = new StackX(stackSize);	//make stack

		for (int j = 0; j < input.length(); j++)
		{
			char ch = input.charAt(j);		//get a char from input
			theStack.push(ch);		//push it
		}

		output = "";

		while (!theStack.isEmpty())
		{
			char ch = theStack.pop();	//pop a char
			output = output + ch;		//append to output
		}
		return output;
	}
}

class ReverseApp
{
	public static void main(String[] args) throws IOException
	{
		String input, output;
		while (true)
		{
			System.out.print("Enter a String : ");
			System.out.flush();
			input = getString();		//read a String from kbd

			if ( input.equals("") )		//quit if [enter]
			{
				break;
			}
			//make a reverser
			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev();	//use it
			System.out.println("Reversed : " + output);
		}
	}

	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}