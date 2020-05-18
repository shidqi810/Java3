import java.io.*;

class StackX
{
	// array in sorted, from max at 0 to min at size 1

	private int maxSize;
	private char[] stackArray;
	private int top;

	//----------------------------------------------

	public StackX(int s) 	//construktor
	{
		maxSize = s;		//set array size
		stackArray = new char[maxSize];	//create array
		top = -1;
	}

	//----------------------------------------------

	public void push(char j)	//put item on top of stack
	{
		stackArray[++top] = j;
	}

	//----------------------------------------------

	public char pop()		//take item from top of stack
	{
		return stackArray[top--];
	}

	//----------------------------------------------

	public char peek()		//peek at top of stack
	{
		return stackArray[top];
	}

	//----------------------------------------------

	public boolean isEmpty()	//true if queue is empty
	{
		return (top == -1);
	}

	//----------------------------------------------

	public int size()		//return size
	{
		return top+1;
	}

	//----------------------------------------------

	public char peekN(int n)		//return item at index n
	{
		return stackArray[n];
	}

	//----------------------------------------------

	public void displayStack(String s)
	{
		System.out.print(s);
		System.out.print("Stack (bottom-->top): ");
		for (int j = 0; j < size(); j++)
		{
			System.out.print(peekN(j) );
			System.out.print(' ');
		}
		System.out.println(" ");
	}
}

class InToPost
{
	//inflix to postfix conversion

	private StackX theStack;
	private String input;
	private String output = "";

	//----------------------------------------------

	public InToPost(String in)		//constructor
	{
		input = in;
		int stackSize = input.length();
		theStack = new StackX(stackSize);
	}

	//----------------------------------------------

	public String doTrans()			//do translation to postfix
	{
		for (int j = 0; j < input.length(); j++)
		{
			char ch = input.charAt(j);
			theStack.displayStack("for " + ch + " ");	//diagnostic
			switch(ch)
			{
				case '+':			//it's + or -
				case '-':
					gotOper(ch, 1);		//go pop operators
					break;
				case '*':			//it's * or /
				case '/':
					gotOper(ch, 2);		//go pop operators
					break;
				case '(':			//it's a left paren
					theStack.push(ch);	//push it
					break;
				case ')':			//it's a right paren
					gotParen(ch);	//go pop operators
					break;
				default:			//must be an operand
					output = output + ch;	//write it to output
					break;
			}
		}

		while (!theStack.isEmpty())		//pop remaining opers
		{
			theStack.displayStack("while ");	//diagnostic
			output = output + theStack.pop();	//write to output
		}

		theStack.displayStack("End ");		//diagnostic
		return output;
	}

	//----------------------------------------------

	public void gotOper(char opThis, int prec1)
	{					//got operator from input
		while (!theStack.isEmpty())
		{
			char opTop = theStack.pop();
			if (opTop == '(')		//if it's a '('
			{
				theStack.push(opTop);		//restore '('
				break;
			}
			else
			{
				int prec2;			//precedence of new op

				if ( (opTop == '+') || (opTop == '-') )		//find new op prec
				{
					prec2 = 1;
				}
				else
				{
					prec2 = 2;
				}

				if (prec2 < prec1)			//if prec of new op
				{
					theStack.push(opTop);	//saved newly popped op
					break;
				}
				else
				{
					output = output + opTop;
				}
			}
		}

		theStack.push(opThis);		//push new operator
	}

	//----------------------------------------------

	public void gotParen(char ch)		//got right paren from input
	{
		while ( !theStack.isEmpty() )
		{
			char chx = theStack.pop();
			if (chx == ')')		//if popped ')'
			{
				break;			//we're done
			}
			else
			{
				output = output + chx;
			}
		}
	}
}

class InflixApp
{
	public static void main(String[] args) throws IOException
	{
		String input, output;

		while (true)
		{
			System.out.print("Enter infix: ");
			System.out.flush();
			input = getString();		//read a string from kbd
			if (input.equals(""))
			{
				break;
			}

			InToPost theTrans = new InToPost(input);
			output = theTrans.doTrans();		//do translation
			System.out.println("PostFix is " + output + '\n');
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