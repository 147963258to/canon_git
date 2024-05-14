package kadai05;

import java.util.List;

public class Jdbc1 {

	public static void main(String[] args) {

	//UserDAOのインスタンスを生成
	MemberDAO dao = new MemberDAO();
				
	//先にインスタンス化して箱だけ作っとく
	List<Member> members = null;
		
		try {
			//findALLメソッドの呼び出し
			members = dao.findAll();
		} catch (DAOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
		for (Member m : members) {
			int id = m.getCode();
			String name = m.getName();
			int age = m.getAge();
			String tel = m.getTel();

			System.out.println(id + "\t" + name + "\t" + age + "\t" + tel);
		}
			
		
			
		
	}

}
