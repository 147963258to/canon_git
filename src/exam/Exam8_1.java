package exam;

import java.util.Random;
import java.util.Scanner;

public class Exam8_1 {
	public static void main(String[] args) {
		// プレイヤーとコンピュータの手を決める
		int you = Janken();
		// コンピュータは1～3のランダムな数値を取得する
		int com = createComHand();
		
		// プレイヤーの手とコンピュータの手を出力
		showHand(you, com);
		
		// プレイヤーの手とコンピュータの手を比較して勝敗を出力する(5点)
		result(you, com);
	}
	
	/**
	 * じゃんけん.
	 * 
	 * @return プレイヤーの手
	 */
	private static int Janken() {
		Scanner scan = new Scanner(System.in);
		// プレイヤーとコンピュータの手を決める
		System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		System.out.print("じゃん、けん、、、：");
		int you = scan.nextInt();
		scan.close();
		
		return you;
	}
	
	/**
	 * コンピュータの手を生成（ランダム1 ～ 3）
	 * 
	 * @return コンピュータの手
	 */
	private static int createComHand() {
		Random random = new Random();
		// コンピュータは1～3のランダムな数値を取得する
		int com = random.nextInt(3) + 1;
		System.out.println(com);
		
		return com;
	}
	/**
	 * プレイヤーの手とコンピュータの手を出力.
	 * 
	 * @param you プレイヤーの手
	 * @param com コンピュータの手
	 */
	private static void showHand(int you, int com) {
		System.out.println("あなたは" + HandEval.getValueForCode(you));
		System.out.println("コンピューターは" + HandEval.getValueForCode(com));
	}
	
	/**
	 * プレイヤーの手とコンピュータの手を比較して勝敗を出力.
	 * 
	 * @param you プレイヤーの手
	 * @param com コンピュータの手
	 */
	private static void result(int you, int com) {
		String resultStr = "あなたの負け";
		
		if (you == com) {
			// 引き分けパターン
			// P:C=1:1、P:C=2:2、P:C=3:3
			resultStr = "引き分け";
		}
		else if ((you + 1) == com || (you - 2) == com) {
			// プレイヤー勝利パターン
			// P:C=1:2、P:C=2:3、P:C=3:1
			resultStr = "あなたの勝ち";
		}
		else {
			// プレイヤー敗北パターン
			// P:C=1:3、P:C=2:1、P:C=3:2
		}
		
		System.out.println(resultStr);
	}
}
