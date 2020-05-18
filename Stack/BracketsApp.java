import java.io.*;

class StackX
{
	private int maxSize;	//size of stack
	private char[] stackArray;
	private int top;		//top of stack

	//----------------------------------------------

	public StackX(int s) 	//construktor
	{
		maxSize = s;		//set array size
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

class BracketChecker
{
	public String input;		//input String

	//----------------------------------------------

	public BracketChecker (String in)		//constructor
	{
		input = in;
	}

	//----------------------------------------------

	public void check()		//reverse the String
	{
		int stackSize = input.length();		//get max stack size
		StackX theStack = new StackX(stackSize);	//make stack

		for (int j = 0; j < input.length(); j++)
		{
			char ch = input.charAt(j);		//get a char from input
			switch (ch)
			{
				case '{':		//opening symbols
				case '[':
				case '(':
					theStack.push(ch);		//push them
					break;

				case '}':		//closing symbols
				case ']':
				case ')':
					if ( !theStack.isEmpty() )		//if stack not empty
					{
						char chx = theStack.pop();		//pop and check
						if ( ( ch == '}' && chx != '{' ) ||
							 ( ch == ']' && chx != '[' ) ||
							 ( ch == ')' && chx != '(' )
							)
						{
							System.out.println("Error: " + ch + " at " + j);
						}
					}
					else 
					{
						System.out.println("Error: " + ch + " at " + j);
					}
					break;
				default:		//no action on character
					break;
			}
		}
		//at this point, all character have been processed
		if ( !theStack.isEmpty() )
		{
			System.out.println("Error: missing right delimiter");
		}
	}
}

class BracketsApp
{
	public static void main(String[] args) throws IOException
	{
		String input;
		while (true)
		{
			System.out.print("Enter String containing delimiters: ");
			System.out.flush();
			input = getString();		//read a String from kbd

			if ( input.equals("") )		//quit if [enter]
			{
				break;
			}
			//make a reverser
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();		//check bracket
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