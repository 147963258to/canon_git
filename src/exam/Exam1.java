package exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		// キーボードから名前と年齢を取得して10年後の年齢を出力する
		System.out.print("名前：");
		String name = scan.next(); // 操作入力
		
		System.out.print("年齢：");
		int age  = scan.nextInt(); // 操作入力
		
		age = age + 10;
		System.out.print(name + "さんの10年後は" + age + "歳です！");
		
		
		scan.close();
	}

}
