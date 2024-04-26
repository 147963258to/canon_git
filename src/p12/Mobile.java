package p12;

public class Mobile extends Camera {
	//フィールド
	private String telNo; //電話番号
	
	//コンストラクタ
	public Mobile() {
//		super();
//		super(10);
		System.out.println("Mobileコンストラクタ");
	}
	
	public Mobile(String telNo, String maker) {

	}
	
	//アクセッサ・メソッド
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	//メソッド
	public void talk() {
		System.out.println("電話番号：" + telNo);
		System.out.println("話し中です！");
	}
}
