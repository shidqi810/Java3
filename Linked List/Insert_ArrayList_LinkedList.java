import java.util.*;

public class Insert_ArrayList_LinkedList
{
	static final int N = 5000;

	// mencatat waktu yg diperlukan untuk menyisipkan
	// sejumlah N objek ke List

	static long timeList(List<Object> lst)
	{
		// waktu awal proses penyisipan (inserting)
		long start = System.currentTimeMillis();

		// membuat objek yg akan disisipkan
		Object obj = new Object();

		// Perulangan untuk memasukkan objek sembarang sebanyak N
		for (int i = 0; i < N; i++)
		{
			// menyisipkan objek
			lst.add(0, obj);
		}
		// Menghitung waktu penyisipan
		return System.currentTimeMillis() - start;
	}

	public static void main(String[] args)
	{
		// perhitungan waktu untuk ArrayList
		System.out.println("Time for ArrayList = " + timeList(new ArrayList<Object>()));

		// perhitungan waktu LinkedList
		System.out.println("Time for LinkedList = " + timeList(new LinkedList<Object>()));
	}
}