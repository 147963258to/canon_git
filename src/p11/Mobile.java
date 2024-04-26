package p11;

public class Mobile extends Camera {
	//フィールド（メンバ変数）の定義
	String telNo; //名前
	
	
	//コンストラクタの定義
	
	
	//メソッドの定義
	void talk() {
		System.out.println("電話番号：" + telNo);
		System.out.println("話し中");
	}

}
