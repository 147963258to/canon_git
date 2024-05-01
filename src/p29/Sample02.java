package p29;

public class Sample02 {

	public static void main(String[] args) {
		String s = "ABCXYZCBA";
		
		System.out.println(s);
		System.out.println(s.length()); //文字の長さ
		System.out.println(s.charAt(2)); //２号室の文字
		System.out.println(s.substring(3)); //３号室以降の文字列
		System.out.println(s.substring(2, 5)); //２～４号室の文字列
		System.out.println(s.indexOf("C")); //部屋番号の確認
		System.out.println(s.indexOf("D")); //部屋番号の確認
		System.out.println(s.lastIndexOf("C")); //部屋番号の確認
		System.out.println(s.startsWith("ABC")); //指定した文字で始まっているか
		System.out.println(s.startsWith("XYZ")); //指定した文字で始まっているか
		System.out.println(s.endsWith("CBA")); //指定した文字で終わっているか
		System.out.println(s.endsWith("XYZ")); //指定した文字で終わっているか
		
		System.out.println(s.startsWith("XYZ", 3)); //指定した文字で始まっているか
		System.out.println(s.startsWith("XYZ", 2)); //指定した文字で始まっているか
		
	}

}
