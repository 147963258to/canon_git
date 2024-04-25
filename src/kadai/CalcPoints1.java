package kadai;

public class CalcPoints1 {
	
	public static void main(String[] args) {
		//メソッドの呼び出し

		int price = 1000;
		// プレミア会員のポイント計算
		int p1 = getPoints(price, true);
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");
		// 無料会員のポイント計算
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
	}
	
	//メソッドの定義
	
	static int getPoints(int price, boolean hantei) {
		int p = 0;
		if (hantei == true) {
			p = price /10 * 2;
			return p ;
		}
		
			p = price /10 * 1;
			return p;

	}

	static void introduce(String x, int y) {
		System.out.println(x +"は" + y + "歳です");
	    y = y + 10;
		System.out.println("10年後は" + y + "歳です");
			return;

	}
	
	static int sub(int x, int y) {
		return x - y;
	}
	
	static int avg(int x, int y) {
		return (x * y)/2;
	}
	
	

}
