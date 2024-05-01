package p17;

public class Start {

	public static void main(String[] args) {
		Human h;
		
		h = new Oku();
		h.name = "奥";
		h.age = 23;
		h.eat();
		//h.cook();
		
		Oku o = (Oku)h;
		o.cook();
		
		h = new Kudo();
		h.name = "工藤";
		h.age = 24;
		h.eat();
		//h.listenMusic();
	}

}
