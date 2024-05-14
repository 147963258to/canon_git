package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {

	public static void main(String[] args) {
		try {
			//JDBCドライバの登録
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("ドライバが登録されていません");
			e.printStackTrace();
		}
		
		//データベース接続情報
		String url = "jdbc:postgresql:canon_db";
		String user = "postgres";
		String pass = "himitu";
		
		//実行のSQL文
		String sql = "SELECT id, name, age FROM Users";		
		
		try {
			//データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//SQL実行の準備
			PreparedStatement ps = con.prepareStatement(sql);
			
			//SQL実行結果の取得
			ResultSet rs = ps.executeQuery();
			
			//結果の表示
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println(id + "\t" + name + "\t" + age);
			}
			
			//リソースのクローズ
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("データベース関連エラーです");
			e.printStackTrace();
		}
		
	}

}
