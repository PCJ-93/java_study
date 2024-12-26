package exp;

import java.util.Scanner;

public class Exp01 { // 예외처리

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp tt = null;
		if (tt != null) {
			tt.t = 10;
		}

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자입력하세요: ");
		String s = scanner.nextLine();
		int n = 0;
		try {
			System.out.println("전");
			n = Integer.parseInt(s);  // 오류나는순간 catch 쪽으로 넘어가서 아래 후 실행 X
			System.out.println("후");
			System.out.println("후2");
			System.out.println("후3");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); // 에러정보출력후 다음코드 계속실행
		} finally {
			System.out.println("여기 finally");
		}
		System.out.println("입력한 숫자는 : " + n);
		
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Temp {
	int t;
}
