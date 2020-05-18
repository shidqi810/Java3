public class TestBigCat {
	public static void main(String[] args) {
		//memanfatkan kelas Lion
		Lion myLion = new Lion("Simba");
		System.out.println("My Lion Is " + Lion.name);
		myLion.eat();

		//memanfatkan kelas Tiger
		Tiger myTiger = new Tiger("Harimau");
		System.out.println("My Tiger Is " + Tiger.name);
		myTiger.eat();

		//memanfatkan kelas Cat
		SiberianCat myCat = new SiberianCat("Kocheng");
		System.out.println("My Cat Is " + SiberianCat.name);
		myCat.eat();
	}
}