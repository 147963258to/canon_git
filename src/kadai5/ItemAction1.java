package kadai5;

public class ItemAction1 {
public static void main(String[] args) {
// 商品オブジェクトを生成
	Item item = new Item("山田太郎",23);
// セッターを利用して情報（絵本/1000円）をセットする
	item.setName("絵本");
	item.setPrice(1000);
// ゲッターを利用して商品の情報を出力する
	System.out.println("名前：" + item.getName());
	System.out.println("年齢：" + item.getPrice());
	

	System.out.println("---");
	
	
	// ■Step4の処理
	// コンストラクタを利用し初期化（シャンプー/222円）と
	// 同時に商品オブジェクトを生成する
	Item item2 = new Item("シャンプー",222);
	item2.setName("シャンプー");
	item2.setPrice(222);
	// 商品情報出力用のメソッドを利用して出力する
	item2.showInfo();
	
	
	
}



}
