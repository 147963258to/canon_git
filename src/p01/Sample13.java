package p01;

import java.util.Scanner;

public class Sample13 {

	public static void main(String[] args) {
		
		String s1 = "10";
		String s2 = "20";
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を入力：");
		System.out.println("年齢を入力：");

		String name = scan.next();
		int age = scan.nextInt();
		
		System.out.println("名前を入力：" + name);
		System.out.println("名前を入力：" + age);
	}

}
