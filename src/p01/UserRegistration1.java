package p01;

import java.util.Scanner;

public class UserRegistration1 {

	public static void main(String[] args) {
		//メソッドの呼び出し

		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();
		
		// 会員ランクによる判定
		int p = 0;
		if (rank == 1) {
			p = price / 10 * 2;
			System.out.println("1:プレミア会員には" + p + "ポイント付与されます");
		} else if (rank == 2) {
			p = price / 10 * 1;
			System.out.println("2:無料会員" + p + "ポイント付与されます");
		}

		

		scan.close();
	}

	//メソッドの定義

	static int nextInt(int price, boolean hantei) {
		int p = 0;
		if (hantei == true) {
			p = price / 10 * 2;
			return p;
		}

		p = price / 10 * 1;
		return p;

	}

	static int getPoints(int price, boolean hantei) {
		int p = 0;
		if (hantei == true) {
			p = price / 10 * 2;
			return p;
		}

		p = price / 10 * 1;
		return p;

	}

	static void introduce(String x, int y) {
		System.out.println(x + "は" + y + "歳です");
		y = y + 10;
		System.out.println("10年後は" + y + "歳です");
		return;

	}

	static int sub(int x, int y) {
		return x - y;
	}

	static int avg(int x, int y) {
		return (x * y) / 2;
	}

}
