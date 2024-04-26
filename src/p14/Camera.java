package p14;

public class Camera {
	//フィールド（メンバ変数）の定義
	 private String maker; //メーカー
	
	
	//コンストラクタの定義
	 public Camera() {
			System.out.println("Cameraコンストラクタ1");
			
		}
	 
	 public Camera(String maker) {
			System.out.println("Cameraコンストラクタ2");
			
		}
	
	//メソッドの定義
	 void talk() {
		System.out.println("メーカー：" + maker);
		System.out.println("撮影中");
	}

	/**
	 * @return maker
	 */
	public String getMaker() {
		return maker;
	}


	/**
	 * @param maker セットする maker
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

}
