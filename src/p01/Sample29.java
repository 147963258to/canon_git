package p01;

///後置インクリメント
public class Sample29 {

	public static void main(String[] args) {
		
		int a = 10;
		
		kudo(10);
		
		
	}

	//メソッド定義

	static void kudo(int x){
		if (x < 0) {
		return;
		}
		System.out.println( x );
		
	}
	
	
}
