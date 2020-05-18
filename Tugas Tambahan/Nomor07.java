import java.io.*;

public class Nomor07
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

		boolean ketemu = false;
		i = 0;
		while ( (i < n) && (!ketemu) )
		{
			if (x < Larik[i])
			{
				ketemu = true;
			}
			else
			{
				i = i+1;
			}
		}

		if (ketemu)
		{
			for (j = n; j >= i ; j-- )
			{
				Larik[j+1] = Larik[j];
			}
			Larik[i] = x;
		}
		else
		{
			Larik[n+1] = x;
		}

		n = n+1;
		System.out.println("Hasil Setelah Disisipkan: ");

		for ( int a=0; a<n; a++ )
		{
			System.out.print(Larik[a] + " ");
		}
	}
}