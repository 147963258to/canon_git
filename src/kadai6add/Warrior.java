package kadai6add;

public class Warrior extends Human {
	String type;

	public Warrior() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Warrior(String name, String type) {
		super(name);
		this.type = type;

		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type セットする type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public void attack() {
			System.out.println(type + "攻撃した");
	}

	// 情報出力用showInfoメソッド
	public void showInfo() {
		super.showInfo();
		System.out.println("種別：" + type);

	}

}
