class mobil {
	String Warna;
	int Jumlah_Pintu;
	float Isi_Tangki;

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

public class TestDrive3 {
	public static void main(String[] args) {

		mobil Mobil_Andi = new mobil();
		Mobil_Andi.setWarna("Merah");

		System.out.println("Mobil Andi Berwarna " + Mobil_Andi.getWarna() + " Dan Maju Sebanyak "
			+ Mobil_Andi.Maju(125) + " Meter!");
	}
}