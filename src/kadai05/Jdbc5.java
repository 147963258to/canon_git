package kadai05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc5 {
	static Scanner scan;

	public static void main(String[] args) {
		//JDBCドライバの登録
		//JDBCドライバマネージャーに使用するDBの種類を教える

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが登録されていません");
			e.printStackTrace();
		}

		Scanner scan = new Scanner(System.in);

		//接続情報の設定
		String url = "jdbc:postgresql:canon_db"; //接続するDB名
		String user = "postgres"; //ユーザ名
		String pass = "himitu"; //パスワード

		String sql = "DELETE FROM emp WHERE code = ?";

		System.out.print("コードを入力してください：");
		int inputCode = scan.nextInt(); // 操作入力

		//データベースへの接続
		try (
				//正常にDBに接続された時に利用できるリモコンcon
				Connection con = DriverManager.getConnection(url, user, pass);) {
			//SQL文を実行する準備をする
			PreparedStatement ps = con.prepareStatement(sql);

			//プレースホルダの部分に値を設定する
			ps.setInt(1, inputCode);

			//SQLを実行して結果を取得する
			//INSERT、UPDATE、DELETEのSQLはexecuteUpdateで実行する
			//戻り値は登録、変更、削除した数
			int kazu = ps.executeUpdate();
			System.out.println("削除数：" + kazu);

			if (kazu == 1) {
				System.out.println("削除成功");

				sql = "SELECT * FROM emp order by code asc";

				//SQL文を実行する準備をする
				PreparedStatement ps2 = con.prepareStatement(sql);
				//SQLを実行して結果を取得する
				ResultSet rs = ps2.executeQuery();

				while (rs.next() == true) { //レコードがある回数繰り返す
					//レコードの列のデータを取得する
					int code = rs.getInt("code"); //idの列のデータを取得
					String name = rs.getString("name"); //nameの列のデータを取得
					int age = rs.getInt("age"); //idの列のデータを取得

					System.out.println(code + ":" + name + ":" + age);
				}

			} else {
				System.out.println("削除失敗");

			}
			scan.close();

		} catch (SQLException e) {
			System.out.println("データベース関連エラー");
			e.printStackTrace();
		}
	}

}
