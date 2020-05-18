import java.io.*;

class Queue
{
	private int maxSize;	//size of stack
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	//----------------------------------------------

	public Queue(int s) 	//construktor
	{
		maxSize = s;		//set array size
		queArray = new int[maxSize];	//create array
		front = 0;
		rear = -1;
		nItems = 0;
	}

	//----------------------------------------------

	public void insert(int j)	//put item at rear of queue
	{
		if (rear == maxSize-1)
		{
			rear = -1;
		}
		queArray[++rear] = j;
		nItems++;
	}

	//----------------------------------------------

	public int remove()		//take item from front queue
	{
		int temp = queArray[front++];	//get value and incr front
		if (front == maxSize)
		{
			front = 0;
		}
		nItems--;		//one less item
		return temp;
	}

	//----------------------------------------------

	public double peekFront()	//peek at front of queue
	{
		return queArray[front];
	}

	//----------------------------------------------

	public boolean isEmpty()	//true if queue is empty
	{
		return (nItems == 0);
	}

	//----------------------------------------------

	public boolean isFull()		//true if stack is full
	{
		return (nItems == maxSize);
	}

	//----------------------------------------------

	public int size()	//number of items in queue
	{
		return nItems;
	}
}


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

class StackBalikNama
{
	public static void main(String[] args) throws IOException
	{
		String input, output;
		while (true)
		{
			System.out.print("Masukkan Nama Yang akan di tumpuk : ");
			System.out.flush();
			input = getString();		//read a String from kbd

			if ( input.equals("") )		//quit if [enter]
			{
				break;
			}
			//make a reverser
			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev();	//use it
			System.out.println("Keluaran dari antrian : " + input);
			System.out.println("");
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