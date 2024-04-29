package exam;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			System.out.print("年齢を入力してください：");
			int age = 0; // 初期値

			age = scan.nextInt(); // 操作入力

			// 0以上130以下の範囲外である場合は「0以上130以下で入力してください」
			// と出力する（5点）
			if (age < 0 || 131 < age) {
				System.out.println("「0以上130以下で入力してください」");
			} else {
				// 0以上130以下の整数だった場合は「○歳で登録しました」と出力する（5点）
				System.out.println("「" + age + "歳で登録しました」");
			}

		} catch (Exception e) {
			// 文字列が入力された場合は「整数で入力してください」と出力する（5点）
			System.out.println("「整数で入力してください」");
		} finally {
			scan.close();
		}

	}

}
