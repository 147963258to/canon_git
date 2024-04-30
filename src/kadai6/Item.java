package kadai6;

public class Item {
	// フィールド

	private String name;
	private int price;

	// コンストラクタ

	public Item() {
	}

	/**
	 * @param name
	 * @param price
	 */
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// ゲッターセッター
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
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	// 情報出力用showInfoメソッド
	public void showInfo() {
		System.out.println("名前：" + name);
		System.out.println("価格：" + price + "円");

	}

}