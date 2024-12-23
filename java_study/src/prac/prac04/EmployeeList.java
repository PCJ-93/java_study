package prac.prac04;

public class EmployeeList { //전체직원목록
	
	String name;
	String tel;
	int age;
	
	public EmployeeList(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
		System.out.println(name+tel+age);
	}
	
	

}
