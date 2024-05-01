package p17;

public class Oku extends Human {
	//メソッド
	void cook() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("料理をしています");
	}
	
	public void eat() {
		//super.eat();
		System.out.println("ラーメンを食べました");
	}
}
