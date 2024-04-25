package p01;


import java.util.Scanner;

public class Sample09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を入力：");
		System.out.println("年齢を入力：");

		String name = scan.next();
		int age = scan.nextInt();
		
		System.out.println("名前を入力：" + name);
		System.out.println("名前を入力：" + age);
	}

}
