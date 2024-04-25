package kadai5;

public class ItemAction2 {
	public static void main(String[] args) {
		// 3つの要素をもつ商品クラスの配列を生成
		Item[] items =  {
			    new Item("掃除機",25), 
			    new Item("洗浄機",26), 
			    new Item("扇風機",27)
			};
		// 拡張for文とshowInfoメソッドを利用して
		for(Item i:items){
			i.showInfo();
		}
		
				
		// 1件ずつ商品情報を出力する
		}
}
