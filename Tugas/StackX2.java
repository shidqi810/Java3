public class StackX2
{
	//Ukuran array stack
	int maxSize;

	int[]stackArray;

	//bagian atas atau top stack

	int top;

	StackX2(int s) //konstruktor
	{
		maxSize = s;

		stackArray = new int [maxSize];

		top = -1;
	}

	//meletakkan item ke bagian atas atau top stack

	public void push(int p)
	{
		stackArray [++top] = p;
	}

	//mengambil item dari bagian atas atau top stack

	public int pop()
	{
		return stackArray[top--];
	}

	//melihat item dari bagian atas atau top stack

	public int peek()
	{
		return stackArray[top];
	}

	//menguji apakah stackl kosong

	public boolean isEmpty ()
	{
		return (top == -1);
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StackTriangleApp2
{
	static int theNumber;
	static int theAnswer;
	static StackX2 theStack;

	public static void main(String[] args) throws IOException
	{
		System.out.print("Masukkan bilangan : ");

		//mengosongkan penyangga

		System.out.flush();

		//membaca bilangan bulat yang dimasukkan pengguna

		theNumber = getInt();

		stackTriangle();

		System.out.println("Bilangan segitiga phytagoras = " + theAnswer);
	}

	public static void stackTriangle ()
	{
		//membuat stack

		theStack = new StackX2(10000);

		//menginisialisasi the answer

		theAnswer = 0;

		//perulangan hingga n bernilai 1

		while (theNumber>0)
		{
			//memasukkan nilai

			theStack.push(theNumber);

			//mengurangi nilai

			--theNumber;
		}

		//hingga stack kosong

		while (!theStack.isEmpty())
		{
			//mengeluarkan pop nilai

			int newN = theStack.pop();

			//menambah nilai the answer

			theAnswer += newN;
		}
	}

	//membaca String yang dimasukkan pengguna

	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine();

		return s;
	}

	//membaca bilangan bulat yang dimasukkan pengguna

	public static int getInt() throws IOException
	{
		String s = getString();

		return Integer.parseInt(s);
	}
}