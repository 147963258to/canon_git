package JB40;

public class Item {

	String name;
	int price;
	
	
	// 情報出力用showInfo()メソッド
	void showInfo() {
		System.out.println(name);
		System.out.println("税抜き" + price);
		price = (price /10)+ price;
		System.out.println("税込み" + price);
	}
	
		

	
	
}
