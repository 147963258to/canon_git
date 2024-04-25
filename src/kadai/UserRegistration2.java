package kadai;

import java.util.Scanner;

public class UserRegistration2 {
	static Scanner scan;

	public static void main(String[] args) {
		//メソッドの呼び出し

		scan = new Scanner(System.in);
		System.out.print("名前を入力してください：");
		String name = scan.next();
		//check名前
		Checkname(name);

		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		//check年齢
		Checkage(age);

		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
		scan.close();
	}

	//メソッドの定義

	static void Checkname(String name) {
		String warn = "";
		Boolean hantei = true;
		// 名前が20文字より大きい場合エラー
		if (name.length() > 20) {
			warn = "20文字より大きい場合エラー";
			hantei = false;
			// 名前が「admin」に一致する場合エラー
		} else if (name.equals("admin")) {
			warn = "名前が「admin」に一致する場合エラー";
			hantei = false;
			// 名前に禁止文字「㌔」が含まれている場合エラー
		} else if (name.contains("㌔")) {
			warn = "名前に禁止文字「㌔」が含まれている場合エラー";
			hantei = false;
		}
		
			Hantei(hantei,warn);
		//
	}
	
	static void Checkage(int age) {
		String warn = "";
		Boolean hantei = true;
		// 年齢が0未満、または、130より大きい場合エラー
		if (0 > age || 130 < age) {
			hantei = false;
			warn = "年齢が0未満、または、130より大きい場合エラー";
				}
		Hantei(hantei,warn);
	}

	static void Hantei(boolean hantei,String warn) {
		
		if (hantei == false) {
			System.out.println(warn);
			scan.close();
			System.exit(0);
		}
		
	}
	
	

	/////////////////////////////////////////////////////////////////

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
