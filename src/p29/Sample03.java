package p29;

public class Sample03 {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = " STU ";
		String s4 = "stu";
		
		System.out.println(s1.equals("ABC"));
		System.out.println(s1.equals("XYZ"));
		
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s3);
		System.out.println(s3.trim());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s4.toUpperCase());
		
	}

}
