class mobil {
	String Warna;
	int Jumlah_Pintu;
	float Isi_Tangki;

	public static int Maju(int maju) {
		return(maju);
	}

	public static int Mundur(int mundur) {
		return(mundur);
	}
}

public class TestDrive2 {
	public static void main(String[] args) {

		mobil Mobilku = new mobil();
		Mobilku.Warna = "Merah";

		System.out.println("Mobilku Berwarna " + Mobilku.Warna + " Dan Mundur Sebanyak "
			+ Mobilku.Mundur(15) + " Meter!");
	}
}