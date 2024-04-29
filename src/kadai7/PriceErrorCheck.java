package kadai7;

import java.util.Scanner;

public class PriceErrorCheck {
	static Scanner scan;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Scanner scan = new Scanner(System.in);
			
			int price = 0; // 価格初期値:0
			System.out.print("価格：");
			price = scan.nextInt(); // 操作入力
			// 整数チェック（エラーの場合は終了）
			// 範囲チェック（エラーの場合は終了）
			System.out.println(price + "円を登録しました");
			scan.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("整数で入力してください");
			System.out.println(e);
		}
		
	}

}
