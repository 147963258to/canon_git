package p01;

///後置インクリメント
public class Sample16 {

	public static void main(String[] args) {
		//配列の宣言
		//データ型[] 型列名
//		String[]canon;
		
		//領域の確保
		//型配列名 = new データ型[部屋の数]
		
		String canon[] = new String[3];
		
		canon[0]="田中";
		canon[1]="遠藤";
		canon[2]="椿";

		System.out.println(canon[0]);
		System.out.println(canon[1]);
		System.out.println(canon[2]);
		System.out.println(canon.length);//要素数
	}

}
