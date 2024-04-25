package kadai5;

public class Item {
	// フィールド
	String name; //名前
	int price;   //価格
	
	

	/**
	 *  コンストラクタ
	 * @param name
	 * @param price
	 */
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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
	
	//情報出力用showInfoメソッド
	void showInfo() {
		System.out.println("名前：" + getName());
		System.out.println("年齢：" + getPrice());
		
		
		
	}
	
	}
