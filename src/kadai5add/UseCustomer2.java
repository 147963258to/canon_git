package kadai5add;

import java.util.Scanner;

public class UseCustomer2 {
	static Scanner scan;

	public static void main(String[] args) {
		Customer[] customerList = new Customer[3];
		scan = new Scanner(System.in);

		// 顧客データの読み込み 
		for (int index = 0; index < customerList.length; index++) {
			System.out.println((index + 1) + "人目の顧客情報を入力してください。");
			System.out.print("ID：");
			int id = scan.nextInt(); // IDの入力 
			
			System.out.print("名前：");
			String name = scan.next(); // 名前の入力 

			Customer customer;
			if (id == -1) {
				// IDが-1なら名前だけ登録 
				customer = new Customer(name);
			} else {
				// IDが-1でなければIDと名前を登録 
				customer = new Customer(id, name);
			}
			customerList[index] = customer;
		}
		
		int num;

		do {
			System.out.print("操作（1:一覧表示 2:変更 9:終了）を選択してください：");
			num = scan.nextInt();
			
			switch (num) {
			case 1:
				showList(customerList);
				break;
			case 2:
				updateRecord(customerList);
				break;
			}
			
			
		} while(num != 9);
		
		scan.close();
	}

	static void showList(Customer[] customerList) {
		// 顧客データ表示 
		System.out.println();
		System.out.println("=== 顧客データ一覧 ===");
		
		for (Customer customer : customerList) {
			customer.showData();
		}	
	}

	static void updateRecord(Customer[] customerList) {
		// 顧客データ表示 
		System.out.println();
		System.out.print("更新するID：");
		int id = scan.nextInt();
		
		Customer hit = null;
		
		for (Customer customer : customerList) {
			if (id == customer.getId()) {
				hit = customer;
				break;
			}
		}
		
		if (hit == null) {
			System.out.println("指定したIDは存在しません。");
			return;
		}
		
		System.out.println("更新するID：" + id);
		System.out.print("新しいID：");
		int newId = scan.nextInt();
		
		System.out.print("新しい名前：");
		String newName = scan.next();
		
		hit.setId(newId);
		hit.setName(newName);
	}
}
