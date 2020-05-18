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

class QueuePriority
{
	public static void main(String[] args)
	{
		System.out.print("Masukkan Banyaknya Data yang akan di input = ");
		int n = inputData();

		PriorityQ thePQ = new PriorityQ(n);

		for (int i = 0; i < n; i++)
		{
			System.out.print("Masukkan Nilai Mahasiswa = ");
			double nilai = inputData();
			thePQ.insert(nilai);
		}

		System.out.print("Hasil Priority Nilai dari terkecil = ");

		while ( !thePQ.isEmpty() )
		{
			double item = thePQ.remove();
			System.out.print(item + " ");	//10, 20, 30, 40, 50
		}

		System.out.println(" ");
	}

	public static int inputData()
	{
		BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in));
		
		int num = 0;
        
        try {
            num = Integer.parseInt(input.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return num;
	}
}