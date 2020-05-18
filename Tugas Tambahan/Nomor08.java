import java.io.*;

public class Nomor08
{
	static int Larik[] = new int[25];
	static int n, i, j;
	
	public static void main(String[] args)
	{
		inputBanyakLarik();

		InputIsiMatriknya();
		
		Sisipkan();
	}
	
	public static int inputData()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}
	
	public static void inputBanyakLarik()
	{
		System.out.print("Masukkan Jumlah n Larik = ");
		n = inputData();
	}

	public static void InputIsiMatriknya()
	{
		for ( i = 0; i<n; i++ )
		{	
			System.out.print("Masukkan Isi Larik Ke - " + (i+1) + " = ");
			Larik[i] = inputData();
		}
	}
	
	public static void Sisipkan()
	{
		System.out.print("Elemen Yang akan Di sisipkan = ");
		int x = inputData();

		System.out.print("Index Tempat Untuk Di sisipkan = ");
		int i = inputData();

		for (j = n; j >= (i-1) ; j-- )
		{
			Larik[j+1] = Larik[j];
		}
		Larik[i-1] = x;

		n = n+1;
		System.out.println("Hasil Setelah Disisipkan: ");

		for ( int a=0; a<n; a++ )
		{
			System.out.print(Larik[a] + " ");
		}
	}
}