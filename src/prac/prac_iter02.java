package prac;

import java.util.Scanner;

public class prac_iter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//출생년도와 주민등록번호 뒷자리 첫번째 숫자를 입력받아서, 나이와 성별을 출력하세요.
		//기준은 2024년으로 함.
		//나이는 단순하게 2024년과의 차이로 함 (만 나이, 월 따지지 않음)
		//2000년생 = 25살
		//1996년생 = 29살

		//2000년생 이후로는 뒷자리 남자 : 3, 여자 : 4
		//2000년생 이전은 뒷자리 남자 : 1, 여자 : 2
		//그 외에 케이스가 들어오면 잘못된 입력이라고 출력하도록 처리.
		//어떤 경우가 잘못된 경우일지 한번 생각해보세요~

		//주민번호 뒷자리 첫번째 수 구분.
		//남자 : 1 이거나 3
		//여자 : 2 이거나 4

		//예시 1)
		//출생년도를 입력하세요 : 2000
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 4
		//결과 : 25살 여자입니다.

		//예시 2)
		//출생년도를 입력하세요 : 1998
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 1
		//결과 : 27살 남자입니다.
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("출생년도를 입력하세요 : ");
//		int birth = scanner.nextInt();
//		System.out.println("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
//		int backNum = scanner.nextInt();
		
//		int year = 2025;
//		
//		if (birth<=2024 && birth>=1900) {
//			if (birth<2000 && backNum==1) {
//				System.out.println("결과 : "+year%birth+"살 남자 입니다.");
//			} else if (birth>=2000 && backNum==3) {
//				System.out.println("결과 : "+year%birth+"살 남자 입니다.");
//			} else if (birth<2000 && backNum==2) {
//				System.out.println("결과 : "+year%birth+"살 여자 입니다.");
//			} else if (birth>=2000 && backNum==4) {
//				System.out.println("결과 : "+year%birth+"살 여자 입니다.");
//			} else
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		// SOL
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int RRN = scanner.nextInt();
		
		int age = 2024 - year + 1;  //한국나이 계산
		//        2025 - year
		
		if (year < 2000 && RRN == 1) {
			System.out.println(age + "살 남자입니다.");
		} else if (year < 2000 && RRN == 2) {
			System.out.println(age + "살 여자입니다.");
		} else if (year >= 2000 && RRN == 3) {
			System.out.println(age + "살 남자입니다.");
		} else if (year >= 2000 && RRN == 4) {
			System.out.println(age + "살 여자입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
		

	}

}
