package p02;

public class Start {

	public static void main(String[] args) {
		//①Humanクラスを操作するリモコン（参照変数）の宣言
		//クラス名 参照変数名;
		//Human h;
		
		//②Humanクラスを元にインスタンスを生成して
		//　リモコンで操作ができる状態にする
		//参照変数名 = new クラス名();
		//h = new Human();
		
		//①と②を同時に行う
		//クラス名 参照変数名 = new クラス名();
		Human h = new Human();
		
		//Humanクラスのフィールドに値を設定
		//参照変数名.フィールド名 = 値;
//		h.name = "山田太郎";
//		h.age = 23;
		
		//Humanクラスのメソッドを呼び出して実行
		//参照変数名.メソッド名([実引数, ・・・・]):
		h.introduce();
		h.walk();
		h.eat();
	}

}
