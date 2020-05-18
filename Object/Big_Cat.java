//kelas Abstrak
public abstract class Big_Cat {
	protected static String name;
	protected static void eat();
}

//kelas Turunan
class Lion extends Big_Cat {
	//konstruktor untuk kelas Lion
	public Lion (String nameLion) {
		//mengisi peubah yang diwarisi dari kelas abstrak
		Lion.name = nameLion;
	}

	//implementasi metoda yang diwarisi dari kelas abstrak
	public void eat() {
		System.out.println("Lion can eat meat");
	}
}

//kelas Turunan
class Tiger extends Big_Cat {
	//konstruktor untuk kelas Tiger
	public Tiger (String namaTiger) {
		//mengisi peubah yang diwarisi dari kelas abstrak
		Tiger.name = namaTiger;
	}

	//implementasi metoda yang diwarisi dari kelas abstrak
	public void eat() {
		System.out.println("Tiger can eat meat and drink milk");
	}
}

//kelas Turunan
class SiberianCat extends Big_Cat {
	//konstruktor untuk kelas SiberianCat
	public SiberianCat (String namaCat) {
		//mengisi peubah yang diwarisi dari kelas abstrak
		SiberianCat.name = namaCat;
	}

	//implementasi metoda yang diwarisi dari kelas abstrak
	public void eat() {
		System.out.println("Cat can eat meat and drink milk");
	}
}