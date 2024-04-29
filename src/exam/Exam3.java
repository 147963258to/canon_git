package exam;

public class Exam3 {
	public static void main(String[] args) {
		// 長方形の面積を計算する
		int a1 = getSquareArea(3, 3);
		System.out.println(a1);
		// 三角形の面積を計算する
		double a2 = getTriangleArea(3, 3);
		System.out.println(a2);
	}

	// 引数で幅と高さを整数で受け取り長方形の面積（整数）を返す
	// getSquareArea()メソッドを作りなさい（5点）
	public static int getSquareArea(int width, int height) {

		int area = width * height;

		return area;

	}

	// 引数で幅と高さを整数で受け取り三角形の面積（小数）を返す
	// getTriangleArea()メソッドを作りなさい（5点）
	public static int getTriangleArea(int width, int height) {

		int area = width * height / 2;

		return area;

	}
}
