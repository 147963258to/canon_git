package p29;

public class Start {

	public static void main(String[] args) {
		Object o1 = new Ogawa(10);
		Object o2 = new Ogawa(10);
		
		System.out.println(o1.equals(o2));
		System.out.println(o1 == o2);
	}

}
