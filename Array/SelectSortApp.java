import java.io.*;

class ArraySel
{
	private double[] a;
	private int nElems;
//----------------------------------------------------------------

	public ArraySel(int max)	//constructor
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

	public void selectionSort()
	{
		int out, in, min;
		for (out = 0; out < nElems; out++)		//outer loop
		{
			min = out;							//minimum
			for (in = (out+1); in < nElems; in++)	//inner loop
			{
				if (a[in] < a[min])
				{
					min = in;			//nilai min yang baru
					swap(out,min);		//nilai di swap
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

class SelectSortApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;		//banyaknya n array
		ArraySel arr;			//inisialisasi sebuah nama untuk sebuah objek
		arr = new ArraySel(maxSize);	//membuat array dari objek

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
		arr.selectionSort();	//mengurutkan array
		arr.display();		//menampilkan array kembali setelah diurutkan
	}
}