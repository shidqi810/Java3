import java.io.*;

class Queue
{
	private int maxSize;	//size of stack
	private double[] queArray;
	private int front;
	private int rear;
	private int nItems;
	//----------------------------------------------

	public Queue(int s) 	//construktor
	{
		maxSize = s;		//set array size
		queArray = new double[maxSize];	//create array
		front = 0;
		rear = -1;
		nItems = 0;
	}

	//----------------------------------------------

	public void insert(double j)	//put item at rear of queue
	{
		if (rear == maxSize-1)
		{
			rear = -1;
		}
		queArray[++rear] = j;
		nItems++;
	}

	//----------------------------------------------

	public double remove()		//take item from front queue
	{
		double temp = queArray[front++];	//get value and incr front
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
	private double[] stackArray;
	private int top;		//top of stack

	//----------------------------------------------

	public StackX(int s) 	//construktor
	{
		maxSize = s;		//set array size
		stackArray = new double[maxSize];	//create array
		top = -1;			//no items yet
	}

	//----------------------------------------------

	public void push(double j)	//put item on top of stack
	{
		stackArray[++top] = j;		//increment top, insert item
	}

	//----------------------------------------------

	public double pop()		//take item from
	{
		return stackArray[top--];	//access item, decrement top
	}

	//----------------------------------------------

	public double peek()	//peek at top of stack
	{
		return stackArray[top];
	}

	//----------------------------------------------

	public boolean isEmpty()	//true if stack is empty
	{
		return (top == -1);
	}

	//----------------------------------------------

	public boolean isFull()		//true if stack is full
	{
		return (top == (maxSize-1));
	}
}

class StackSalinQueue
{
	public static void main(String[] args)
	{
		Queue theQueue = new Queue(10);

		StackX theStack = new StackX(20);	//make new stack
		double[] queArray = new double[20];
		double[] value = new double[20];
		double[] balik = new double[20];

		for (int i = 0; i < 10; i++) {
			queArray[i] = inputData();
			theStack.push(queArray[i]);
		}
	
		int o = 0;
		while ( !theStack.isEmpty() )		//until it's empty
		{
			value[o] = theStack.pop();
			System.out.print(value[o]);
			System.out.print(" ");
			o++;
		}
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			int k = 9;
			int jumlah = k - i;
			balik[jumlah] = value[i];
			
		}

		for (int l = 0; l < 10; l++) {
			System.out.print(balik[l]);
		}
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			theQueue.insert(balik[i]);
		}

		while ( !theQueue.isEmpty() )		//remove and display
		{
			double n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}

	public static double inputData()
	{
		BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in));
		
		double num = 0;
        
        try {
            num = Double.parseDouble(input.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return num;
	}
}