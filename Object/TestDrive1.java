class Mobil {
	String Warna;
	int Jumlah_Pintu;
	float Isi_Tangki;

	public static int Maju(int maju) {
		int majukedepan = 0;
		majukedepan = majukedepan + maju;
		return(majukedepan);
	}

	public static int Mundur(int mundur) {
		int mundurkebelakang = 0;
		mundurkebelakang = mundurkebelakang + mundur;
		return(mundurkebelakang);
	}
}

public class TestDrive1 {
	public static void main(String[] args) {
		Mobil mobil = new Mobil();
		System.out.println("Mobil Maju sejauh " + Mobil.Maju(15) + " Meter");
	}
}