class Kucingku_Manis {
	String Nama;
	private String Warna;
	private int Berat;

	//Metoda
					//untuk urutan variabel di bawah
	void Isi_Identitas (String namaKucing, String warnaKucing, int beratKucing) {
		Nama = namaKucing;
		Warna = warnaKucing;
		Berat = beratKucing;
	}

	String ambilNama() {
		return Nama;
	}

	String ambilWarna() {
		return Warna;
	}

	int ambilBerat() {
		return Berat;
	}
}

class Coba_Akses2 {
	public static void main(String[] args) {
		Kucingku_Manis kucingku = new Kucingku_Manis();

		//mengisi peubah instan
							//urutannya dari method di atas
		kucingku.Isi_Identitas("Pussy", "Belang", 10);

		//menampilkan nama kucing melalui metode
		System.out.println("Nama Kucing = " + kucingku.ambilNama());

		//menampilkan nama kucing lewat peubah
		System.out.println("Nama Kucin : " + kucingku.Nama);
	}
}