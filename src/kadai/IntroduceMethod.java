package kadai;

public class IntroduceMethod {
	
	public static void main(String[] args) {
		//メソッドの呼び出し

		introduce("田中太郎", 25);
		System.out.println("---");
		introduce("鈴木一郎", 30);
	}
	
	//メソッドの定義

	static void introduce(String x, int y) {
		System.out.println(x +"は" + y + "歳です");
	    y = y + 10;
		System.out.println("10年後は" + y + "歳です");
			return;

	}
	
	static int sub(int x, int y) {
		return x - y;
	}
	
	static int avg(int x, int y) {
		return (x * y)/2;
	}
	
	

}
