package p02;

public class Human {
	//フィールド（メンバ変数）の定義
	String name; //名前
	int age;     //年齢
	
	//メソッドの定義
	void introduce() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
	
	void walk() {
		System.out.println("散歩中です");
	}
	
	void eat() {
		System.out.println("食事中です");
	}
}
