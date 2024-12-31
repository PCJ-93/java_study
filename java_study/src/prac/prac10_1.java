package prac;

import java.util.Scanner;

public class prac10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
	while(run) {
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("5.종료");
		System.out.print("  메뉴 번호를 입력하세요 : ");
		int selectNum = scanner.nextInt();
		
		if(selectNum>=1 && selectNum<=5) {
			if (selectNum ==1) {
				System.out.println("  입력 메뉴입니다.");
				System.out.println();
			} else if (selectNum == 2) {
				System.out.println("  수정 메뉴입니다.");
				System.out.println();
			} else if (selectNum == 3) {
				System.out.println("  조회 메뉴입니다.");
				System.out.println();
			} else if (selectNum == 4) {
				System.out.println("  삭제 메뉴입니다.");
				System.out.println();
			} else {
				System.out.println("  프로그램이 종료됩니다.");
				run = false;
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println();
		}
	}
		
		

	}

}
