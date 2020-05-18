import java.util.*;

public class BinarySearch_Array_and_LinkedList
{
	static final int N = 1000;
	static List<Integer> values;

	// Membuat nilai-nilai bilangan bulat
	// acak (random) sebanyak N

	static 
	{
		// membuat bilangan2 bulat acak
		// dan memasukkannya ke array vals[]

		Integer vals[] = new Integer[N];
		Random rn = new Random();
		for (int i = 0, currval = 0; i < N; i++)
		{
			// membuat bilangan bulat acak dengan urutan ascending

			vals[i] = new Integer(currval);
			currval += rn.nextInt(100) + 1;
			System.out.println(" Data ke- " + (i+1) + " adalah " + currval);
		}
		// memasukkan nilai nilai pada array ke senarai (List)

		values = Arrays.asList(vals);
	}

	// beriterasi sepanjang list dan mencari nilai tertentu
	// menggunakan metoda Binary search

	static long timeList(List<Integer> lst)
	{
		// waktu awal pencarian

		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++)
		{
			// mencari nilai tertentu menggunakan metoda Binary search
			int indx = Collections.binarySearch(lst, values.get(i));

			// jika terjadi kesalahan saat pencarian
			if (indx != i)
			{
				System.out.println("*** Error ***\n");
			}
		}

		// menghitung waktu yg diperlukan untuk melakukan pencarian biner (Binary search)
		return System.currentTimeMillis() - start;
	}

	public static void main(String args[])
	{
		// pencarian pada ArrayList (array yang implementasi menggunakn List)

		System.out.println("Waktu diperlukan pada pencarian ArrayList = " + timeList(new ArrayList<Integer>(values)) + " mikrodetik.");

		// pencarian pada LinkedList
		System.out.println("Waktu diperlukan pada pencarian LinkedList = " + timeList(new LinkedList<Integer>(values)) + " mikrodetik.");
	}
}