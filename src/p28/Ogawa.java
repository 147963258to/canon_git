package p28;

public class Ogawa {
	int data;
	
	Ogawa(int data) {
		this.data = data;
	}
	
	public boolean equals(Object obj) {
		Ogawa o = (Ogawa)obj;
		
		if (this.data == o.data) {
			return true;
		}
		
		return false;
	}
}
