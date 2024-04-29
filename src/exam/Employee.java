package exam;

public class Employee {

	// フィールド
	private String name;
	private int age;

	// コンストラクタ
	public Employee() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// ゲッター、セッター
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	// 情報出力メソッド
	public void introduce() {
		System.out.println(this.name + "さんは" + age + "歳です");

	}

}
