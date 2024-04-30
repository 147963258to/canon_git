package kadai5add;

public class Customer {
	//フィールド
	private int id;      //ID
	private String name; //名前
	
	//コンストラクタ
	public Customer() {
		
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//showDataメソッド
	public void showData() {
		System.out.println(id + "：" + name);
	}
}
