package kadai;

public class Calculator {
	
	public static void main(String[] args) {
		//メソッドの呼び出し

		int a = add(3, 7);
		System.out.println(a);
		
		int b = sub(3, 7);
		System.out.println(b);
		
		double c = avg(3, 7);
		System.out.println(c);
	}
	
	//メソッドの定義

	static int add(int x, int y) {
		
			return x + y;

	}
	
	static int sub(int x, int y) {
		return x - y;
	}
	
	static int avg(int x, int y) {
		return (x * y)/2;
	}
	
	

}
