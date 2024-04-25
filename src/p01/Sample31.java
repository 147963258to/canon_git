package p01;

///後置インクリメント
public class Sample31 {

	public static void main(String[] args) {
		final int data = 10;
		
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
