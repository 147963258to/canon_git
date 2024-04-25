package p01;

///後置インクリメント
public class Sample28 {

	public static void main(String[] args) {
		
//		
//		oku();
//		kudo(10,20);
//		int result = endo(100,200);
//		int result = println(result);
//		int result = println(endo(1,2));
		int [] list = {10,20,30};
		
		kudo(list);
	}

	//メソッド定義
	static void oku(){

		System.out.println("よろしく");

		//int ary

	}

	static void kudo(int[] list2){ //配列名呼び出しと違う名前でもいい
		for (int date : list2) {
			System.out.println(date);
		}
		

		
		
	}


//	static int endo(int x,int y){
//		System.out.println( x+y );
//
//		//return;
//	}
//	
	
	
}
