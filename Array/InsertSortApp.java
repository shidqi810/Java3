import java.io.*;

class ArrayIns
{
	private double[] a;
	private int nElems;
//----------------------------------------------------------------

	public ArrayIns(int max)	//constructor
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

	public void insertionSort()
	{
		int out, in;
		for (out = 1; out < nElems; out++)		//outer loop (mundur)
		{
			double temp = a[out];		//menghapus marked item
			in = out;								//start shifts at out
			while( (in > 0) && (a[in-1] >= temp) )	//until one is smaller
			{
				a[in] = a[in-1];		//shift item right
				in--;					//go left one position
			}
			a[in] = temp;
		}
	}
}
//----------------------------------------------------------------
//----------------------------------------------------------------

class InsertSortApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;		//banyaknya n array
		ArrayIns arr;			//inisialisasi sebuah nama untuk sebuah objek
		arr = new ArrayIns(maxSize);	//membuat array dari objek

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
		arr.insertionSort();	//mengurutkan array
		arr.display();		//menampilkan array kembali setelah diurutkan
	}
}