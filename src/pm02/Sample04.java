package pm02;

public class Sample04 {

	public static void main(String[] args) {
		
		//UserDAOのインスタンスを生成
		UserDAO dao = new UserDAO();
		
		boolean check = false;
		
		
		
		//findAllメソッドの呼び出し
//		List<User> users = null;
		
		try {
			
			check = dao.insert(id,name,age);
		} catch (DAOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		for (User u : users) {
			String id = u.getId();
			String name = u.getName();
			int age = u.getAge();

			System.out.println(id + "\t" + name + "\t" + age);
		}
	}

}
