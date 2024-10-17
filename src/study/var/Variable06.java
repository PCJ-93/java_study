package study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();    // 10 엔터 눌러서 밑에 nextLine이 엔터 인식해서 바로 출력됨
//		
//		System.out.println(num);
//		System.out.println( num == 10 );   // 비교연산자 붙이면 true , false 로 출력됨
//		// == : 같다 비교연산자     = : 대입 연산자
//		
//		
//		String str = scanner.nextLine();
//		
//		System.out.println(str);
//		System.out.println(str == "밥");
		
		
		int num = scanner.nextInt();    // 선언종류에따라 .nextDouble, .nextLine 등 사용가능
		
		System.out.println(num);
		System.out.println( num == 10 );   // 비교연산자 붙이면 true , false 로 출력됨
		// == : 같다 비교연산자     = : 대입 연산자
		
		scanner.nextLine();      // 위에서 10 이후 입력된 엔터를 가져감 (청소용)
		
		String str = scanner.nextLine();
		
		System.out.println(str);
		//System.out.println(str == "밥");  잘못된방식. 문자열 비교할때는 아래의 문법 사용함
		System.out.println(str.equals("밥"));
		System.out.println("밥".equals(str));  // 앞뒤 순서 바껴도 사용가능
		// 문자열 비교시, == X   equals O
		
		
		
	}

}
