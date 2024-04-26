package p13;

public class Mobile extends Camera {
	//フィールド（メンバ変数）の定義
	private String telNo; //名前
	
	
	
	
	//コンストラクタの定義
	public Mobile() {
		super(10);
		System.out.println("Mobileコンストラクタ");
		
	}
	
	/**
	 * @return telNo
	 */
	public String getTelNo() {
		return telNo;
	}


	/**
	 * @param telNo セットする telNo
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}




	//メソッドの定義
	private void talk() {
		System.out.println("電話番号：" + telNo);
		System.out.println("話し中");
	}

}
