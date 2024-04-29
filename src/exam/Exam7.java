package exam;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;
public class Exam7 {

	public static void main(String[] args) {

		// Employeeクラスのオブジェクトを保存できるListを生成
		// 「田中太郎、20歳」のEmployeeオブジェクトを生成し、Listに追加する
		// 「鈴木一郎、25歳、Java」のEngineerオブジェクトを生成し、Listに追加する
		// 「佐藤花子、30歳」のEmployeeオブジェクトを生成し、Listに追加する
//		Employee[] employeeList = {
//				new Employee("田中太郎", 20),
//				new Engineer("鈴木一郎", 25, "Java"),
//				new Employee("佐藤花子", 30) };

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("田中太郎", 20));
		employeeList.add(new Engineer("鈴木一郎", 25,"Java"));
		employeeList.add(new Employee("佐藤花子", 30));
		
		
		// 拡張for文と、introduce()メソッドを利用して各オブジェクトの情報を全て出力
		for (Employee i : employeeList) {
			i.introduce();
		}

	}

}
