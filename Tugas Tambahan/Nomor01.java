import java.io.*;
import java.util.*;

public class Nomor01
{
	static ArrayList<Integer> larik = new ArrayList<Integer>();
	static ArrayList<Integer> larikGenap = new ArrayList<Integer>();
	static int ukuranLarik, nilai;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		if ( (ukuranLarik == 0) || (larik.isEmpty()) )
		{
			System.out.println("Tidak Ada Elemen!");
		}
		else
		{
			cetakLarik();
		}
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
			System.out.print("Error!");
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}
	
	public static void bacaLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			nilai = inputData();
			larik.add(nilai);
		}
	}
	
	private static void cetakLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			if (larik.get(j) % 2 == 0)
			{
				larikGenap.add(larik.get(j));
			}
		}

		if (larikGenap.isEmpty())
		{
			System.out.println("Tidak Ada Info Bernilai Genap!");
		}

		else
		{
			System.out.println("Isi dari Larik Tersebut yg Bernilai Genap = ");
			for (int i = 0; i < larikGenap.size(); i++)
			{
				System.out.println(larikGenap.get(i) + " ");
			}
		}
	}
}