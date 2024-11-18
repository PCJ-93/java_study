package cls.cls01;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int[] arr = new int[3];
		
		Student stu1 = null;  // Student 필드에 있는 변수들 stu1에 사용
		stu1 = new Student();  // 초기화 name=null , grade=0 , phone=null , studentNumber=null
		
		Student stu2 = new Student();  // Student 필드에 있는 변수들 stu2에 사용 및 초기화 (stu1 과 다른 주소)
		
		Scanner scanner = new Scanner(System.in);
		
		stu1.name = "이름일";
		stu2.name = "이름이";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		stu1.grade = 3;
		stu2.grade = 5;
		
		String name;   //일반 스트링변수
		name = "변경";
		
		stu1.phone = "12313";   //외부(studentmain)에서 내부(student)에있는 거 사용
		stu2.phone = "412354";
		
	}

}
