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

class QueueApp
{
	public static void main(String[] args)
	{
		Queue theQueue = new Queue(20);	//make new Queue

		double[] larik = new double[20];
		double[] q1 = new double[20];
		double[] q2 = new double[20];

		theQueue.insert(61);	//insert 4 more items
		theQueue.insert(70);
		theQueue.insert(81);
		theQueue.insert(90);
		theQueue.insert(101);

		while ( !theQueue.isEmpty() )		//remove and display
		{
			int i = 0;
			int n = theQueue.remove();

			if (n%2 == 1) {
				q1[i] = n;
			}
			System.out.print(" ");
			i++;
		}

		while ( !theQueue.isEmpty() )		//remove and display
		{
			int n = theQueue.remove();

			if (n%2 == 0) {
				q2[i] = n;
			}
			System.out.print(" ");
			i++;
		}
		System.out.println("");

		while ( !theQueue.isEmpty() )		//remove and display
		{
			int i = 0;
			System.out.println(q1[i]);
			i++;
		}
	}
}