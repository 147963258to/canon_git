package kadai4add;

public class Convert {

	//double reverse;
	StringBuilder sb = new StringBuilder();

	// 情報出力用showInfo()メソッド
	void showInfo() {

		//System.out.println(reverse);
	}

	static void reverse(int input1) {

		//数字→文字列に変換
		String moji = String.valueOf(input1);
		//配列作成
		char[] hanten;
		//配列に格納
		hanten = moji.toCharArray();

		for (int i = hanten.length - 1; i >= 0; i--) {
			System.out.print(hanten[i]);
		}
		System.out.println();
	}
	
	static void reverse(double input2) {
		//数字→文字列に変換
		String moji = String.valueOf(input2);
		//配列作成
		char[] hanten;
		//配列に格納
		hanten = moji.toCharArray();

		for (int i = hanten.length - 1; i >= 0; i--) {
			System.out.print(hanten[i]);
		}
		System.out.println();
	}


	static void reverse(String moji) {
		//配列作成
		char[] hanten;
		//配列に格納
		hanten = moji.toCharArray();

		for (int i = hanten.length - 1; i >= 0; i--) {
			System.out.print(hanten[i]);
		}
	}
}
