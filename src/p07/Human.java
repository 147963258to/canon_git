package p07;

public class Human {
	//フィールド（メンバ変数）の定義
	String name; //名前
	int age;     //年齢
	
	//アクセスセッタ・メソッド　ゲッタセッタの定義

	
	
	//コンストラクタ定義
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (0 <=age && age <= 130) {
			return;
		}
		this.age = age;
		
	}

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
