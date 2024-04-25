package JB40;

public class UserAction1 {
	public static void main(String[] args) {
		// Itemクラスのオブジェクトを生成し変数item1に代入する
		User item1 = new User();
		// Itemクラスのオブジェクトを生成し変数item2に代入する
		User item2 = new User();
		
		
		item1.name = "田中太郎";
		item1.age = 20;

	// item1を利用して商品名と価格の情報を出力する
		System.out.println("名前" + item1.name);
		System.out.println("年齢" + item1.age);
		
		System.out.println("----------------------------------------");
		
		// ■Step3の処理
		// item2のフィールドに商品名「シャンプー」、価格「222」を設定する
		item2.name = " 鈴木一郎";
		item2.age = 25;
		
		// showInfo()メソッドを利用して情報を出力する
		item2.showInfo();
		
		
	}
}
