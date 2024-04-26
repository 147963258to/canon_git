package p12;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラスのインスタンスを生成
		Mobile m = new Mobile("090-1234-5678", "キヤノン");
		
		//フィールドとメソッドにアクセス
//		m.setTelNo("090-1234-5678");
//		m.setMaker("キヤノン");
		
		m.talk();
		m.takePicture();
	}

}
