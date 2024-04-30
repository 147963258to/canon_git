package exam;

public enum HandEval {
//	1:グー、2:チョキ、3:パー
	
	GUU(1, "グー"),
	TYOKI(2, "チョキ"),
	PAA(3, "パー");
	
	private final int code;
	private final String value;
	
	HandEval(int code, String value) {
		this.code = code;
		this.value = value;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public static String getValueForCode(int code) {
		String value = null;
		
		for(HandEval val : HandEval.values()) {
			if(val.code == code) {
				value = val.value;
				break;
			}
		}
		
		return value;
	}
}
