package pm02;

import java.util.List;

public class Sample03 {

	public static void main(String[] args) {
		
		//UserDAOのインスタンスを生成
		UserDAO dao = new UserDAO();
		
		//findAllメソッドの呼び出し
		List<User> users = null;
		
		try {
			users = dao.findAll();
		} catch (DAOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		for (User u : users) {
			String code = u.getCode();
			String name = u.getName();

			System.out.println(code + "\t" + name + "\t" + age);
		}
	}

}
