import java.io.*;
import java.util.*;

public class Nomor02
{
	static ArrayList<Integer> larik = new ArrayList<Integer>();
	static int ukuranLarik, nilai;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		cetakLarik();
		
		System.out.println("");
		maks();
		
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
	
	public static void cetakLarik()
	{
		System.out.print("Nilai Dari Larik Adalah = ");
		System.out.print(larik + " ");
	}

	public static void maks()
	{
		int maks = -9999;

		for (int i = 0; i < ukuranLarik; i++ )
		{					
			if ( larik.get(i) > maks )
			{
				maks = larik.get(i);
			}
		}

		System.out.println("Nilai Maksimal Dari Larik Tersebut Adalah = " + maks);
	}
}