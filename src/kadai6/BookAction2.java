package kadai6;

public class BookAction2 {
	public static void main(String[] args) {
		
		// Itemクラスの配列を生成しItemとBookのオブジェクトを複数格納する
		Item[] itemList = {
						new Item("ロボット掃除機",50000),
						new Book("鬼滅の包丁", 450,"GO峠こよはる"),
						new Book("１ピース", 500,"尾田A一郎")};
		
		
		
		//拡張for分の中身
//		
//		Item i = itemList[0]; // = new Item("ロボット掃除機",50000)
//		i = itemList[1]; // = new new Book("鬼滅の包丁", 450,"GO峠こよはる")
//		i = itemList[2]; // = new new Book("１ピース", 500,"尾田A一郎")
		
		// 繰り返し処理を利用して1件ずつ商品情報を出力する
		for (Item i :itemList) {
			
			
			i.showInfo();
			
			
		}
		
	}
}
