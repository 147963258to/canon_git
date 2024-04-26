package p13;

public class Camera {
	//フィールド
	protected String maker; //メーカー
	
	//コンストラクタ
	public Camera() {
		
	}
	
	public Camera(int a) {
		
	}
	
	//アクセッサ・メソッド
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	//メソッド
	public void takePicture() {
		System.out.println("メーカー：" + maker);
		System.out.println("写真撮影中です！");
	}

}
