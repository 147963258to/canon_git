package kadai6add;

public class Human {
	// フィールド
	private String name;

	//コンストラクタ
	public Human() {
	}
	/**
	 * @param name
	 */
	public Human(String name) {
		this.name = name;
	}

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
	public void attack() {
		System.out.println(name + "は攻撃した");
	}
	
	
	// 情報出力用showInfoメソッド
		public void showInfo() {
			System.out.println("名前：" + name);
		
		}
	
	
}
