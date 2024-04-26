package p12;

public class Camera {
	//フィールド
	private String maker; //メーカー
	
	//コンストラクタ
	public Camera() {
		System.out.println("Cameraコンストラクタ１");
	}
	
	public Camera(int a) {
		System.out.println("Cameraコンストラクタ２");
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
