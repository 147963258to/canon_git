package p01;

///後置インクリメント
public class Sample27 {

	public static void main(String[] args) {
		
		
		oku();
		kudo(10,20);
		//int result = endo(100,200);
		//int result = println(result);
		//int result = println(endo(1,2));
	}

	//メソッド定義
	static void oku(){

		System.out.println("よろしく");



	}

	static void kudo(int x,int y){
		if (x < 0) {
		return;
		}
		System.out.println( x+y );

		
		
	}


//	static int endo(int x,int y){
//		System.out.println( x+y );
//
//		//return;
//	}
	
	
	
}
