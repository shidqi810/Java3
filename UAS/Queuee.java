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

class Queuee
{
	public static void main(String[] args)
	{
		Queue theQueue = new Queue(5);	//make new Queue

		theQueue.insert(60);	//insert 4 more items
		theQueue.insert(70);
		theQueue.insert(80);
		theQueue.insert(90);

		while ( !theQueue.isEmpty() )		//remove and display
		{
			int n = theQueue.peekFront();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}
}