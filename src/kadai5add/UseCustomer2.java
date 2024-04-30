package kadai5add;

import java.util.Scanner;

public class UseCustomer2 {
	public static void main(String[] args) {
		Customer[] customerList = new Customer[3];
		Scanner scan = new Scanner(System.in);
		// 顧客データの読み込み
		for (int index = 0; index < customerList.length; index++) {
			System.out.println((index + 1)
					+ "人目の顧客情報を入力してください。");
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

		System.out.println();
		int ctrl = 0;
		while (ctrl != 9) {

			System.out.print("操作（1:一覧表示 2:変更 9:終了）を選択してください：");
			ctrl = scan.nextInt(); // 操作入力

			switch (ctrl) {
			case 1:
				showCustomerList(customerList);
				break;
			case 2:
				changeId(customerList);
				break;
			case 9:
				scan.close();
				break;

			default:
				//	throw new IllegalArgumentException("Unexpected value: " + ctrl);
			}
			System.out.println();
		}
		scan.close();
	}
	//メソッドの定義
	public static void showCustomerList(Customer[] customerList) {
		// 顧客データ表示
		System.out.println("=== 顧客データ一覧 ===");
		for (Customer customer : customerList) {
			customer.showData();
		}

	}

	
	public static void changeId(Customer[] customerList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("更新するID：");
		int oldId = scan.nextInt(); // 操作入力

		boolean error = true;
		for (Customer customer : customerList) {

			if (customer.id == oldId) {

				System.out.print("新しいID：");
				int newId = scan.nextInt(); // 操作入力
				System.out.print("新しい名前：");
				String newName = scan.next(); // 操作入力
				customer.id = newId;
				customer.name = newName;
				error = false;

				break;
			}
		}
		if (error) {
			System.out.println("指定したIDは存在しません。");
		}

	}
}
