package p18;

public class Kudo extends Human {
	//メソッド
	void listenMusic() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("音楽を聴いています");
	}
	
	public void eat() {
		//super.eat();
		System.out.println("うどんを食べました");
	}
}
