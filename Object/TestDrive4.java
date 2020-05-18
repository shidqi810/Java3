class mobil {
	String Warna;
	int Jumlah_Pintu;
	double Isi_Tangki;

	//konstruktor 1
	public mobil() {
		super();
	}

	//konstruktor 2 harus sama dengan nama kelas di konstruktor 1 dan nama kelas yang membuka nya
	//berfungsi sebagai method yang berjalan dengan otomatis
	//urutan variabel ini berpengaruh untuk urutan pengisian nilai yang ada di pembuatan objek di bawah
	public mobil(String warna, int jumlah_Pintu, double isi_Tangki) {
		super();
		Warna = warna;
		Jumlah_Pintu = jumlah_Pintu;
		Isi_Tangki = isi_Tangki;
	}

	public void setJumlah_Pintu(int jumlah_Pintu) {
		Jumlah_Pintu = jumlah_Pintu;
	}

	public int getJumlah_Pintu() {
		return Jumlah_Pintu;
	}

	public void setIsi_Tangki(double isi_Tangki) {
		Isi_Tangki = isi_Tangki;
	}

	public double getIsi_Tangki() {
		return Isi_Tangki;
	}

	//setter / sebuah method untuk men set sebuah nilai
	public void setWarna(String warna) {
		//berasal dari String Warna di atas
				//berasal dari parameter set warna
		Warna = warna;
	}

	//getter / sebuah method untuk men dapatkan (get) Sebuah nilai
	public String getWarna() {
		//meng return nilai Warna dari Method Setter
		return Warna;
	}

	public static int Maju(int maju) {
		return(maju);
	}

	public static int Mundur(int mundur) {
		return(mundur);
	}
}

public class TestDrive4 {
	public static void main(String[] args) {

						//urutannya berdasarkan urutan method yang ada di class atas
		mobil Mobil_Adi = new mobil("Merah", 4, 7.5);
		System.out.println("Mobil Adi Berwarna " + Mobil_Adi.getWarna() + " Memiliki " 
		+ Mobil_Adi.getJumlah_Pintu() + " Pintu" + " . Maju Sebanyak "
		+ Mobil_Adi.Maju(125) + " Meter!" + ". Dan Menghabiskan Bensin Sebanyak "
		+ Mobil_Adi.getIsi_Tangki() + " Liter!");
	}
}