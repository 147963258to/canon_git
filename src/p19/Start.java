package p19;

public class Start {

	public static void main(String[] args) {
		Controller con;
		
		con = new Baseball();
		con.pushA();
		con.pushB();
		
		System.out.println("-------");
		
		con = new Mario();
		con.pushA();
		con.pushB();
	}

}
