package study.quiz.quiz14;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO d1 = new StudentDAO();
		List<StudentDTO> sd1 = d1.findStudent();
		// 전체 학생 조회
		for(StudentDTO s : sd1) {
			System.out.println(s);
		}
		
		System.out.println();
		// 3학년만 보기
		sd1 = d1.findStudent(3);
		for(StudentDTO s : sd1) {
			System.out.println(s);
		}
		
		// insert 해줄거
		int result = d1.insertStudentInfo(3253, "이름", "아이디", 5, "1234567891111", "2000-05-31", "010-1232-1235", 110, 110, 110, 110, 110);
		System.out.println(result); // insert 잘되면 1 아니면 0
		

	}

}
