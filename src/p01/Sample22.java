package p01;

///後置インクリメント
public class Sample22 {

	public static void main(String[] args) {
		//配列の宣言
		//データ型[] 型列名
//		String[]canon;
		
		//領域の確保
		//型配列名 = new データ型[部屋の数]
		
		String canon[][] = new String[2][3];
		
		canon[0][0]="田中";
		canon[0][1]="遠藤";
		canon[0][2]="椿";
		
		canon[1][0]="薄井";
		canon[1][1]="菊水";
		canon[1][2]="木村";
		
		
		System.out.println(canon[0][0]);
		System.out.println(canon[0][1]);
		System.out.println(canon[0][2]);
		System.out.println(canon[1][0]);
		System.out.println(canon[1][1]);
		System.out.println(canon[1][2]);
		
		//System.out.println(canon.length);//要素数
	}

}
