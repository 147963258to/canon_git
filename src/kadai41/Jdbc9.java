package kadai41;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc9 {
	static Scanner scan;

	public static void main(String[] args) {
		//JDBCドライバの登録
		//JDBCドライバマネージャーに使用するDBの種類を教える

		Scanner scan = new Scanner(System.in);
		//		System.out.print("上位の人数を入力してください：");
		//		int limit = scan.nextInt(); // 操作入力

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBCドライバが登録されていません");
			e.printStackTrace();
		}

		//接続情報の設定
		String url = "jdbc:postgresql:canon_db"; //接続するDB名
		String user = "postgres"; //ユーザ名
		String pass = "himitu"; //パスワード
		String sql = "SELECT \n"
				+ "CASE \n"
				+ "WHEN age between 20 and 29 then 20\n"
				+ "WHEN age between 30 and 39 then 30\n"
				+ "WHEN age between 40 and 49 then 40\n"
				+ "WHEN age between 50 and 59 then 50\n"
				+ "end as agegroup\n"
				+ ",count(*) as count \n"
				+ " FROM emp\n"
				+ "group by agegroup\n"
				+ "order by agegroup;\n"
				+ "";

		//データベースへの接続
		try {
			//正常にDBに接続された時に利用できるリモコンcon
			Connection con = DriverManager.getConnection(url, user, pass);

			//SQL文を実行する準備をする
			PreparedStatement ps = con.prepareStatement(sql);

			//プレースホルダの部分に値を設定する
			//			ps.setInt(1,limit);

			//SQLを実行して結果を取得する
			ResultSet rs = ps.executeQuery();

			while (rs.next() == true) { //レコードがある回数繰り返す
				//レコードの列のデータを取得する
				int agegroup = rs.getInt("agegroup"); //agegroupの列のデータを取得
				int count = rs.getInt("count"); //countの列のデータを取得


				System.out.println(agegroup + "代：" + count + "人");
			}
			scan.close();
			rs.close();
			ps.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("データベース関連エラー");
			e.printStackTrace();
		}
	}

}
