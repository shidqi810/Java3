import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Antrian {
	private static int ukuran ;
	//mendeklarasikan antrian(queue) yang akan
	//berisi dengan bilangan bilangan bulat;
	private static Queue<Integer> queue;

	public static void main(String[] args) {
		System.out.print
		("Berapa ukuran QUEUE di inginkan?");
		ukuran = inputData();
		buatQueue();
		bacaData();
		tulisData();
	}

	private static void bacaData() {
		Integer data;
		for (int i = 0; i < ukuran; i++) {
			System.out.print
			("Data ke-" + ( i + 1 ) + " : " );
			//Membaca data dan memasukannya
			//ke dalam queue
			data = inputData();
			queue.add(data);
		}

		//mendapatkan ukuran queue saat ini
		data = queue.size();
		System.out.println
		("Ukuran QUEUE sekarang adalah " + data);
	}

	//membuat antrian (queue) yang diimplementasikan 
	//menggunakan Linkedlist dan akan
	//berisi dengan bilanganbilangan bulat
	private static void buatQueue(){
		queue = new LinkedList<Integer>();
	}

	private static int inputData() {
		BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));
		String angkaInput = null ;
		try{
			angkaInput = bfr.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		int Data =
		Integer.valueOf(angkaInput).intValue();
		return Data;
	}

	public static void tulisData() {
		Integer data;
		System.out.println
		("/nUrutan keluarelemen dari QUEUE : ");
		for (int i = 0; i< ukuran; i++){
			//menuliskan/mengeluarkan  elemen dari
			//queue dan menghapusnya
			data = queue.remove() ;
				System.out.println
				("Data ke-" + (i + 1) + " : " + data) ;

			}

			//mendapatkan ukuran queue saat ini
			data = queue.size();
			System.out.println
			("Ukuran QUEUE sekarang adalah "+ data);
		}
	}