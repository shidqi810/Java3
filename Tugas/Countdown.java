import java.util.*;

public class Countdown{
	private static Queue<Integer> queue;
	public static void main(String[] args) throws InterruptedException{
			//dibuat angka karena args nya kosong
			int time = 10;
			/* Membuat antrian (queue) yang diimplementasikan menggunakan LinkedList.*/
			queue = new LinkedList<Integer>();
			/* Melakukan perhitungan mundur dan menambahkan bilangan-bilangan bulat
			ke dalam queue. */
			for (int i = time;i>=0;i--){
				queue.add(i);
			}
			/* Melakukan perhitungan mundur dan menghapus bilangan-bilangan bulat
			dari dalam queue. */
			while (!queue.isEmpty()){
				System.out.print(queue.remove());
				Thread.sleep(1000);
			}
	}
}