import java.io.*;

class HighArray
{
	private double[] a; 
	private int nElems;
	
	public HighArray(int max) //constructor
	{
		a = new double[max];
		nElems = 0;
	}

	public void setElem(int index, double value)
	{
		a[index] = value;
	}

	public double getElem(int index)
	{
		return a[index];
	}

	public void find(double searchKey)
	{
		int j;
		for (j = 0; j < nElems; j++)
		{
			if (a[j] == searchKey)
			{
				System.out.println("Found " + searchKey);
				break;
			}
			else if ( (j == (nElems-1)) && (a[j] != searchKey) ) 
			{
				System.out.println("Can't Find The Data!");
			}
		}
	}

	public void insert(double value)
	{
		a[nElems] = value;
		nElems++;
	}

	public void delete(double value)
	{
		int j;

		for (j = 0; j < nElems; j++) 
		{
			if (value == a[j])
			{
				if (j == nElems) 
				{
				}
				else
				{
					for (int k = j; k < nElems; k++) {
						a[k] = a[k+1];
					}
					nElems--;
				}
			}
		}
	}

	public void display()
	{
		for (int j = 0; j < nElems; j++) 
		{
			System.out.print(a[j] + " ");
		}
	}


}

public class HighArrayApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;
		HighArray arr;
		arr = new HighArray(maxSize);
		int nElems;
		int j;

		arr.insert(77);
		arr.insert(90);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();
		System.out.println(" ");

		int searchKey = 76;

		arr.find(searchKey);

		arr.delete(00);
		arr.delete(55);
		arr.delete(90);

		arr.display();
	}
}