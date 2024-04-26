package kadai5add;

public class Customer {
	//フィールド（メンバ変数）の定義
		String name; //名前
		int id;//ID
		
	//コンストラクタの定義
		public Customer() {
		
	}
	
		public Customer(String name) {
		this.name = name;
		
	}
	
		public Customer(int id,String name) {
			this.name = name;
			this.id = id;
		}
		
		/**
		 * @return name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name セットする name
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id セットする id
		 */
		public void setId(int id) {
			this.id = id;
		}

		public void showData() {
			System.out.println("ID：" + id);
			System.out.println("名前：" + name);
			
		}
	
	
	
}
