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
				for (int k = j; k < nElems; k++)
				{
					a[k] = a[k+1];
				}
				nElems--;
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

public class HighInput
{
	public static void main(String[] args)
	{
		System.out.print("Masukkan Banyak nya n Larik = ");
		int maxSize = inputData();
		HighArray arr;
		arr = new HighArray(maxSize + 1);
		int nElems;
		int j;

		for (int u = 0; u < maxSize; u++) {
			System.out.print("Masukkan Nilai ke - " + (u+1) + " = ");
			arr.insert(inputData());
		}
		
		arr.display();
		System.out.println(" ");

		System.out.print("Masukkan Nilai Yang Ingin Dicari = ");
		int searchKey = inputData();

		arr.find(searchKey);
		System.out.println(" ");

		System.out.print("Masukkan Banyak data yang ingin di hapus = ");
		int del = inputData();

		for (int d = 0; d < del; d++) {
			System.out.print((d+1)+ ". " + "Nilai yang akan di hapus = ");
			arr.delete(inputData());
	 	}

		System.out.println("Datanya Sekarang Menjadi : ");
		arr.display();
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