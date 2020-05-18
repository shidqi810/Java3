import java.io.*;
import java.util.*;

public class Nomor09
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
		totalLarik();

		cetakLarik();
		
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

	public static void totalLarik()
	{
		int i = 0;

		System.out.print("Nilai X Yang Ingin Di Hapus = ");
		int x = inputData();

		Iterator itr = larik.iterator(); 
        while (itr.hasNext()) 
        { 
            int p = (Integer)itr.next(); 
            if (p == x) 
                itr.remove(); 
        }
	}
}