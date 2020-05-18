import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// parameter-parameter yang akan
// disimpan di stack.
 class Params {
	int n;
	int  codePart;
	int returnAddress;

	// Konstruktor.
	Params (int nn, int ra)
	{
		n = nn;
		returnAddress = ra;
	}
} // Akhir kelas Params.

// Implementasi STACK
// Menggunakan Array.

class StackX
{
	int maxSize; // Ukuran array stack.
	Params [] stackArray; //Array dengan tipe Params.
	int top; // Bagian atas (top) stack

	public StackX (int s){
		maxSize = s; // Mengatur ukuran array.
		stackArray = new Params[maxSize]; // Membuat array.
		top = -1; // saat stack masih kosong.
	}

	// Menaruh item di atas stack.
	public void push (Params p)
	{
	//Melakukan penambahan top; menyisipkan item.
	stackArray[++top] = p;
	}

	//Mengambil item dari bagian atas (top) stack.
	public Params pop()
	{
	// Mengakses item, mengurangi nilai top.
	return stackArray[top--];
	}

	// Melihat item di bagian atas stack.
	public Params peek()
	{
	return stackArray[top];
	}
	} // Akhir kelas StackX

public class StackTriangleApp
{
	static int theNumber;
	static int theAnswer;
	static StackX theStack;
	static int codePart;
	static Params theseParams;

	public static void main(String[] args)
	throws IOException
	{

		System.out.println("Masukkan bilangan : ");
		//Mengosongkan penyangga.
		System.out.flush();
		// Memasukkan bilangan ke peubah theNumber.
		theNumber = getInt();
		// Melakukan perhitungan bilangan Phytagoras
		// secara rekursif.
		recTriangle();
		System.out.println("Bilangan segitiga Phtagoras = " + theAnswer);
	} // Akhir metoda/fungsi main()

	// Metode perhitungan segitiga phytagoras.
	public static void recTriangle()
	{
	theStack = new StackX(50);
	codePart = 1;
	// Memanggil metoda step() hingga bernilai true.
	while (step() == false)
	// Pertanyaan kosong.
	;
	}

	// Langkah-langkah rekusif metoda triangle
	// hingga stack kosong.
	public static boolean step()
	{
	switch(codePart)
	{
	case 1: // Pemanggilan awal.
	theseParams  = new Params (theNumber, 6);
	theStack.push(theseParams);
	codePart = 2;
	break;

	case 2:
	theseParams = theStack.peek();

	if(theseParams.n == 1) // Pengujian stack kosong.
	{
		theAnswer = 1;
		codePart = 5; // Keluar (exit).
	}
	else
		codePart = 3; // Pemanggil rekursif.
	break;

	case 3: // Pemanggil metoda.
	// Membentuk elemen yang akan dimasukkan ke stack.
	Params newParams = new Params (theseParams.n-1, 4);
	// Memasukkan elemen ke stack.
	theStack.push(newParams);
	codePart = 2; // Masuk ke metoda.
	break;

	case 4: // Perhitungan.
	theseParams = theStack.peek();
	theAnswer = theAnswer + theseParams.n;
	codePart = 5;
	break;

	case 5: // Keluar (exit) metoda.
	theseParams = theStack.peek();
	codePart = theseParams.returnAddress; // (4 atau 6)
	theStack.pop();
	break;

	case 6: // Titik kembali.
	return true;
	}
	 // Akhir switch
	return false; // Semua kecuali 7
} // Akhir metoda triangle

// Mendapatkan String
// yang dimasukkan pengguna.
public static String getString() throws IOException
{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader (isr);
	String s = br.readLine();
	return s;
}

// Mendapatkan bilangan bulat
// yang dimasukkan pengguna.
public static int getInt() throws IOException
{
	String s = getString();
	return Integer.parseInt(s);
}
}// Akhir kelas StackTriangleApp.