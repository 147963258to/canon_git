package kadai6add;

import java.util.Scanner;

public class PlayGame {
	static Scanner scan;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Warrior[] partyList = new Warrior[3];
		int countShimin = 1;
		int countSenshi = 1;

		int inputTypeInt = 0;
		String name = null;
		String type;
		int partyNum = 0; // partyの人数

		System.out.print("=== パーティを作成します ===");

		// partyが3人までループを続ける
		while (partyNum < 3) {
			System.out.println();
			System.out.print("どちら（1:市民 2:戦士）を作成しますか：");
			inputTypeInt = scan.nextInt(); // 操作入力

			Warrior party;
			if (inputTypeInt == 1) {
				// 1なら市民
				name = "市民" + countShimin++;

			} else if (inputTypeInt == 2) {
				// 2なら戦士
				name = "戦士" + countSenshi++;
			} else if (inputTypeInt != 1 && inputTypeInt != 2) {
				// 1.2のみ入力
				System.out.println("どちらかを入力してください（1:市民 2:戦士）");
				continue;
			}

			System.out.println();
			System.out.println("名前：" + name);
			System.out.print("種別：");
			type = scan.next(); // 操作入力

			party = new Warrior(name, type);
			partyList[partyNum] = party;
			partyNum++;
		}

		System.out.print("=== パーティを作成しました ===");

		
		
		System.out.println();
		int ctrl = 0;
		while (ctrl != 9) {

			System.out.print("操作（1:一覧表示 2:攻撃 9:終了）を選択してください：");
			ctrl = scan.nextInt(); // 操作入力

			switch (ctrl) {
			case 1:
				showPartyList(partyList);
				break;
			case 2:
				attack(partyList);
				break;
			case 9:
				scan.close();
				break;

			default:
				//	throw new IllegalArgumentException("Unexpected value: " + ctrl);
			}
			System.out.println();
		}
		scan.close();

	}
	
	//メソッドの定義
		public static void showPartyList(Warrior[] partyList) {
			// 顧客データ表示
			System.out.println("=== パーティーデータ一覧 ===");
			for (Warrior p : partyList) {
				p.showInfo();
			}

		}
		
		public static void attack(Warrior[] partyList) {
			for (Warrior p : partyList) {
				
				if (p.getName().contains("戦士")) {
					p.attack();
				}
				
			}
		}
		
}
