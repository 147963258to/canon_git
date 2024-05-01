package p22;

public class Oku implements Canon {

	@Override
	public void work() {
		System.out.println(Canon.COMPANY);
		System.out.println("SEです");
	}

	@Override
	public void salary() {
		System.out.println("２５万円です");
	}

}
