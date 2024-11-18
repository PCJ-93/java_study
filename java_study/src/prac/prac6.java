package prac;

import java.util.Scanner;

public class prac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java퀴즈06-1
		
		// 연습문제.

		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
//				int wid = 2;
//				int hei = 2;
//				System.out.println( 0.5*(double)wid * hei);
		

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
//				int upWid = 2;
//				int downWid = 2;
//				int hei = 2;
//				System.out.println(0.5*(upWid+(double)downWid)*hei);
		

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
//				int num = 24;
//				int snk = 100;
//				System.out.println((double)snk/num);
//				System.out.println(snk%num);
		
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
//				Scanner scanner = new Scanner(System.in);
//				int num = scanner.nextInt();
//				System.out.println(num/100);
//				System.out.println(num%100/10);
//				System.out.println(num%10);
		
		

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
//		int x = 10;
//		int y = 20;
//		System.out.println("x="+x+ " y="+y);
//		//x와 y를 바꾼 작업
//		       int c = 1;   //10
//		
//				c=x;
//				x=y;
//				y=c;
//		
//				System.out.println("x="+x+ " y="+y);
////		
		
		
		
		
		//1번

		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.
		
		//입력에 따른 출력 예시
//		26
//		"잘못입력했습니다."
//
//		5
//		오전입니다.
//		이른 오전입니다.
//
//		9
//		오전입니다.
//		늦은 오전입니다.
//
//		21
//		오후입니다.
//		늦은오후입니다.
//						Scanner scanner = new Scanner(System.in);
//						int num = scanner.nextInt();
//						if (num>24) {
//							System.out.println("잘못입력했습니다.");
//						} else if (num < 1) {
//							System.out.println("잘못입력했습니다.");
//						} else if (num<=12) {
//							System.out.println("오전입니다.");
//							if (num<=6) {
//								System.out.println("이른 오전입니다.");
//							} else if (num>=7) {
//								System.out.println("늦은 오전입니다.");
//							}
//						} else if (num>12) {
//							System.out.println("오후입니다.");
//							if (num<=18) {
//								System.out.println("이른 오후입니다.");
//							} else if (num>=19) {
//								System.out.println("늦은 오후입니다.");
//							}
//						}

		


		//2번 아래 코드를 if문으로 변경

//						int diceNum = 1; //주사위 수 1~6
//						
//						if (diceNum == 1) {
//							System.out.println("1");
//						} else if (diceNum ==2){
//							System.out.println("2");
//						} else if (diceNum ==3){
//							System.out.println("3");
//						} else if (diceNum ==4){
//							System.out.println("4");
//						} else if (diceNum ==5){
//							System.out.println("5");
//						} else if (diceNum ==6){
//							System.out.println("6");
//						}
//
//		// if문 변환
//		switch(diceNum) {
//		case 1: // diceNum == 1
//		System.out.println("1");
//		break;
//		case 2:
//		System.out.println("2");
//		break;
//		case 3:
//		System.out.println("3");
//		case 4:
//		System.out.println("4");
//		case 5:
//		System.out.println("5");
//		break;
//		default:
//		System.out.println("6");
//		//case 6:
//		}



		//3번 아래 코드를 swtich 문으로 변경

//						String localNum = "02";
//						switch (localNum) {
//						case "031": System.out.println("경기도입니다."); break;
//						case "02": System.out.println("서울입니다."); break;
//						case "041": System.out.println("충남입니다"); break;
//						case "051": System.out.println("부산입니다"); break;
//						}
		
//		// switch 문으로 변경
//		if ( localNum.equals("031") ){
//		System.out.println("경기도입니다");
//		}
//		if ( localNum.equals("02") ){
//		System.out.println("서울입니다.");
//		}
//		if ( localNum.equals("041") ){
//		System.out.println("충남입니다");
//		}
//		if ( localNum.equals("051") ){
//		System.out.println("부산입니다");
//		}

		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.

//		if( score >= 90) {
//		System.out.println("학점 A");
//		} else if ( score >= 80) {
//		System.out.println("학점 B");
//		} else if (score >= 70) {
//		System.out.println("학점 C");
//		} else if (score < 70) {
//		System.out.println("학점 F");
//		}
//					Scanner scanner = new Scanner(System.in);
//					int score = scanner.nextInt();
//					switch (score) {
//					case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90: 
//						System.out.println("학점 A"); break;
//					case 89, 88, 87, 86, 85, 84, 83, 82, 81, 80: 
//						System.out.println("학점 B"); break;
//					case 79, 78, 77, 76, 75, 74, 73, 72, 71, 70: 
//						System.out.println("학점 C"); break;
//					default: System.out.println("학점 F"); break;
//					}
		

		
	}

}
