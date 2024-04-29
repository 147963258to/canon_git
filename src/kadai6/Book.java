package kadai6;

public class Book extends Item {
	//フィールド
	private String author;

	
	//コンストラクタ
	public Book() {
	}
	/**
	 * @param author
	 */
	public Book(String name ,int price, String author) {
		super(name,price);
		this.author = author;
		
	}
	/**
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author セットする author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	//メソッド
	
	public void showInfo() {
		super.showInfo();
		System.out.println("著者：" + author );
	}
	
	
}
