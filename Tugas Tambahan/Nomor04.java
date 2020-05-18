import java.io.*;
import java.util.*;

public class Nomor04
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
		tukarMaks();
		
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

	public static void tukarMaks()
	{
		int maks = -9999;
		int temp;

		for (int i = 0; i < ukuranLarik; i++ )
		{					
			if ( larik.get(i) > maks )
			{
				maks = larik.get(i);
			}
		}

		System.out.println("Alamat Dari Nilai Maks Larik Adalah = " + larik.indexOf(maks));

		temp = larik.get(0);
		larik.set(larik.indexOf(maks), temp);
		larik.set(0, maks);


		System.out.println("");

		System.out.print("Urutan Larik Sekarang Adalah = ");
		System.out.print(larik + " ");
	}
}