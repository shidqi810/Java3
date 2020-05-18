import java.io.*;

class LowArray
{
	private double[] a; 
	
	public LowArray(int size) //constructor
	{
		a = new double[size];
	}

	public void setElem(int index, double value)
	{
		a[index] = value;
	}

	public double getElem(int index)
	{
		return a[index];
	}
}

public class LowArrayApp
{
	public static void main(String[] args)
	{
		LowArray arr;
		arr = new LowArray(100);
		int nElems;
		int j;

		arr.setElem(0,77);
		arr.setElem(1,90);
		arr.setElem(2,44);
		arr.setElem(3,55);
		arr.setElem(4,22);
		arr.setElem(5,88);
		arr.setElem(6,11);
		arr.setElem(7,00);
		arr.setElem(8,66);
		arr.setElem(9,33);

		nElems = 10;

		//------------------------------------------------------------
		for (j = 0; j < nElems; j++)
		{
			System.out.print(arr.getElem(j) + " ");
		}

		System.out.println(" ");

		//------------------------------------------------------------
		int searchKey = 66;
		for (j = 0; j < nElems; j++)
		{
			if (arr.getElem(j) == searchKey)
			{
				if (j == nElems)
				{
					System.out.println("Can't Found the data");
				}
				else
				{
					System.out.println("Found " + searchKey);
					break;
				}
			}
		}

		//-----------------------------------------------------------
		for (j = 0; j < nElems; j++)
		{
			if (arr.getElem(j) == 55)
			{
				for (int k = j; k < nElems; k++)
				{
					arr.setElem(k, arr.getElem(k+1));
				}
				nElems--;
			}
		}

		//-----------------------------------------------------------
		for (j = 0; j < nElems; j++) {
			System.out.print(arr.getElem(j) + " ");
		}
	}
}