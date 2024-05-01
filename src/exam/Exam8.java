package exam;

import java.util.Random;
import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		// プレイヤーとコンピュータの手を決める
		System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		System.out.print("じゃん、けん、、、：");
		int you = scan.nextInt();
		
		// コンピュータは1～3のランダムな数値を取得する
		int com = random.nextInt(3) + 1;
		System.out.println(com);
		
		System.out.println("あなたは" + HandEval.getValueForCode(you));
		System.out.println("コンピューターは" + HandEval.getValueForCode(com));
		
		
		// プレイヤーの手とコンピュータの手を比較して勝敗を出力する(5点)
		if (you == 1 && com == 2) {
			System.out.println("あなたの勝ち");
		}
		else if (you == 2 && com == 3) {
			System.out.println("あなたの勝ち");
		}
		else if (you == 3 && com == 1) {
			System.out.println("あなたの勝ち");
		}
		else if (you == com ) {
			System.out.println("引き分け");
		}
		else {
			System.out.println("あなたの負け");
		}
		scan.close();
	}
	
	
	
}
