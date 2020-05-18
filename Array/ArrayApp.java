import java.io.*;

class ArrayApp
{
	public static void main(String[] args) throws IOException
	{
		int[] arr;
		arr = new int[100];
		int nElems;
		int j;
		int searchKey;

		//key of item to search for

		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 27;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;

		nElems = 10;

		//untuk menampilkan data array awal
		//-----------------------------------------------------------------------
		for (j = 0; j < nElems; j++)
		{
			System.out.print(arr[j] + " ");
		}

		searchKey = 66;

		//ini untuk mencari angka 66
		//-----------------------------------------------------------------------
		for (j = 0; j < nElems; j++)
		{
			if (arr[j] == searchKey)
			{
				if (j == nElems) 
				{
					System.out.println("Can't Find The Data!");
				}
				else 
				{
					System.out.println("");
					System.out.println("Found " + searchKey);
					break;
				}
			}
		}

		searchKey = 55;

		//ini untuk menghapus nilai 55 dan untuk memindahkan data, lalu mengecilkan 
		//panjang data
		//-----------------------------------------------------------------------
		for (j = 0; j < nElems; j++)
		 {
		 	if (arr[j] == searchKey) 
		 	{
		 		for (int k = j; k < nElems; k++) 
				{
					arr[k] = arr[k+1]; //untuk memindahkan datanya
				}
				nElems--;		//untuk mengurangi ukuran dari nElems (banyaknya data)
		 	}
		}

		//ini untuk menampilkan setelah ada yang dihapus
		//-----------------------------------------------------------------------
		for (j = 0; j < nElems; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}