package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam9 {
	static Scanner scan;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		Map<String, String> map = new HashMap<String, String>();

		int ctrl = 0;
		
		while (ctrl != 9) {
			System.out.print("操作（1：登録 2：削除 3：一覧表示 9：終了）を選択してください：");
			ctrl = scan.nextInt(); // 操作入力
			switch (ctrl) {
			case 1:
				System.out.print("名前を入力してください：");
				String name = scan.next(); // 操作入力
				System.out.print("電話番号を入力してください：");
				String tell = scan.next(); // 操作入力

				map.put(name, tell);

				break;
			case 2:
				System.out.print("名前を入力してください：");
				String deleteName = scan.next(); // 操作入力
				map.remove(deleteName);
				break;
			case 3:
				
				System.out.println("名前" + "   "+ "電話番号");
				System.out.println("---------------------------");
				Set<String> keyList = map.keySet();
				
				for (String key:keyList) {
					System.out.println(key + "   "+ map.get(key));
					
				}
				
				
				break;
			case 9:
				System.out.println("アプリケーションを終了します。");
				scan.close();
				break;

			default:
				//	throw new IllegalArgumentException("Unexpected value: " + ctrl);

			}
		}
		System.out.println();
	}

}
