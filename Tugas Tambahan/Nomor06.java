import java.io.*;
import java.util.*;

public class Nomor06
{
	static ArrayList<Integer> larik = new ArrayList<Integer>();
	static int ukuranLarik, nilai;
	
	public static void main(String[] args)
	{
		bacaLarik();
		cetakLarik();
		
		System.out.println("");
		rataRata();
		
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
		int j = 0;
		do {
			System.out.print("Larik Ke - " + (j+1) + " = ");

			nilai = inputData();
			if (nilai != 9999) {
				larik.add(nilai);
			}

			j++;
		} while(nilai != 9999);
	}
	
	public static void cetakLarik()
	{
		System.out.print("Nilai Dari Larik Adalah = ");
		System.out.print(larik + " ");
	}

	public static void rataRata()
	{
		double total = 0;
		double rata;

		for (int i = 0; i < larik.size(); i++ )
		{					
			total = total + larik.get(i);
		}
		System.out.println("Total = " + total);
		int banyak = larik.size();
		System.out.println("banyak = " + banyak);
		rata = total/banyak;

		System.out.println("Rata Rata Larik Adalah = " + rata);
	}
}