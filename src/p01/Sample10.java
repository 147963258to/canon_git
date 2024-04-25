package p01;


///後置インクリメント
public class Sample10 {

	public static void main(String[] args) {
		
		int a = 10;
		
		//b = a をする
		//a = a+1をする↓
		int b = a++;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

}
