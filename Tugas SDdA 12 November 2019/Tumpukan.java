import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Tumpukan
{
	private static Stack <Integer> stack;
	private static int ukuran;
	public static void main(String[] args) 
	{
		System.out.print("Berapa ukuran Stack yang diiinginkan ?");
		//menentukan ukuran stack
		ukuran = inputData();
		//membuat stack
		buatStack(ukuran);
		//membaca data bilangan bulat dan memasukkannya dalam Stack
		bacaData();
		//mengeluarkan data bilangan bulat dan menuliskannya ke jendela console
		tulisData();
	}
	
	//membuat stack yang akan menampung bilangan" bulat (integer)
	private static void buatStack (int ukuran) 
	{
		stack = new Stack<Integer>();
	}

	//metode untuk memasukkan bil. bulat ke stack
	private static void bacaData()
	{
		int data;
		System.out.println("Masukkan nilai-nilai Stack : ");
		
		for (int i =0; i<ukuran; i++) 
		{
			System.out.print("Data ke-" + (i+1) + " : "); //membaca data bil. bulat

			data = inputData(); //memasukkan data ke stack

			stack.push(data);
		}
	}

	//metode untuk menuliskan isi stack ke jendala console
	private static void tulisData()
	{
		System.out.println("Isi Stack adalah (menggunakan prosedur pop) : ");

		int dataStack;

		for (int i = 0; i<ukuran; i++) //mengeluarkan elemen dari stack
		{
			dataStack = stack.pop();

			System.out.println("Nilainya = " + dataStack);
			
		}
	}

	//metoda untuk membaca data bilangan bulat (int)
	private static Integer inputData()
	{
		BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));

		String angkaInput = null;

		try
		{
			angkaInput = input.readLine();
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}

		int data = Integer.valueOf(angkaInput).intValue();

		return data;
	}
}
