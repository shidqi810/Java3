import java.io.*;

class ArrayBub
{
	private double[] a;
	private int nElems;
//----------------------------------------------------------------

	public ArrayBub(int max)	//constructor
	{
		a = new double[max];	//membuat Array baru
		nElems = 0;				//belum ada item
	}
//----------------------------------------------------------------

	public void insert(double value)	//untuk memasukkan nilai ke dalam array
	{
		a[nElems] = value;		//nilai dimasukkan
		nElems++;				//untuk menaikkan otomatis index sebuah array tersebut
	}
//----------------------------------------------------------------

	public void display()		//untuk menampilkan array
	{
		for (int j = 0; j < nElems; j++)
		{
			System.out.print(a[j] + " ");
		}
		System.out.println(" ");
	}
//----------------------------------------------------------------

	public void bubbleSort()
	{
		int out, in;
		for (out = (nElems-1); out > 1; out--)		//outer loop (mundur)
		{
			for (in = 0; in < out; in++)			//inner loop (maju)
			{
				if (a[in] > a[in+1])				//out of order?
				{
					swap(in, in+1);					//swap datanya
				}
			}
		}
	}
//----------------------------------------------------------------

	private void swap (int one, int two)
	{
		double temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
//----------------------------------------------------------------
//----------------------------------------------------------------

class BubbleSortApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;		//banyaknya n array
		ArrayBub arr;			//inisialisasi sebuah nama untuk sebuah objek
		arr = new ArrayBub(maxSize);	//membuat array dari objek

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();		//menampilkan array
		arr.bubbleSort();	//mengurutkan array
		arr.display();		//menampilkan array kembali setelah diurutkan
	}
}