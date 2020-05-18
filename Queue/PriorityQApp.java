import java.io.*;

class PriorityQ
{
	// array in sorted, from max at 0 to min at size 1

	private int maxSize;
	private double[] queArray;
	private int nItems;

	//----------------------------------------------

	public PriorityQ(int s) 	//construktor
	{
		maxSize = s;		//set array size
		queArray = new double[maxSize];	//create array
		nItems = 0;
	}

	//----------------------------------------------

	public void insert(double item)	//insert item
	{
		int j;

		if (nItems == 0)		//if no item
		{
			queArray[nItems++] = item;		//insert at 0
		}
		else
		{
			for (j = nItems-1; j >= 0; j--)
			{
				if (item > queArray[j])		//if new item
				{
					queArray[j+1] = queArray[j];	//shift upward
				}
				else
				{			//if smaller
					break;
				}
			}
			queArray[j+1] = item;		//insert it
			nItems++;
		}
	}

	//----------------------------------------------

	public double remove()		//remove minimum item
	{
		return queArray[--nItems];
	}

	//----------------------------------------------

	public double peekMin()	//peek at min item
	{
		return queArray[nItems - 1];
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
}

class PriorityQApp
{
	public static void main(String[] args)
	{
		PriorityQ thePQ = new PriorityQ(5);

		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);

		while ( !thePQ.isEmpty() )
		{
			double item = thePQ.remove();
			System.out.print(item + " ");	//10, 20, 30, 40, 50
		}

		System.out.println(" ");
	}
}