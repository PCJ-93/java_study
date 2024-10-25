package prac;

import java.util.Scanner;

public class prac1111111111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("------------------------------");
//		System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
//		System.out.println("------------------------------");
//		System.out.print("숫자입력 : ");
//		int selectNum = scanner.nextInt();
//		
//		while(true) {
//			System.out.println("------------------------------");
//			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
//			System.out.println("------------------------------");
//			if(selectNum==1) {
//				System.out.println("선택>1");
//				System.out.println("예금액>10000");
//				break;
//			}
//			if (selectNum==2) {
//				System.out.println("선택>2");
//				System.out.println("출금액>2000");
//				break;
//			}
//			if (selectNum==3) {
//				System.out.println("선택>3");
//				System.out.println("잔고>8000");
//				break;
//			}
//			if(selectNum==4) {
//				System.out.println("선택>4");
//				System.out.println("프로그램 종료");
//				break;
//			} else {
//				System.out.println("잘못입력");
//			}
//			System.out.print("다시입력 : ");
//			selectNum = scanner.nextInt();		
//		}
		
//		int max = 0;
//		int[] array = {1, 5, 12, 8, 22};
//		for(int i=0; i<array.length; i++) {
//			if(max < array[i]) {
//				max = array[i];
//			}
//		}
//		System.out.println("max : " + max);

		
//		int[][] array = { {95,86},{83,92,96},{78,83,93,87,88} };
//		
//		int sum = 0;
//		double avg = 0.0;
//		int count = 0;
//		for (int i=0; i<array.length; i++) {
//			for (int j=0; j<array[i].length; j++) {
//				sum += array[i][j];
//				count++;
//			}
//		}
//		avg = (double)sum/count;
//		System.out.println(sum);
//		System.out.println(avg);
		
//		Scanner scanner = new Scanner(System.in);
//		boolean run = true;
//		int studentNum = 0;
//		int[] scoreArr = null;
//		double avg = 0;
//		int sum = 0;
//		int max = 0;
//		
//		while (run) {
//			System.out.println("-------------------------------------------");
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 5. 종료");
//			System.out.println("-------------------------------------------");
//			System.out.print("선택 > ");
//			int selectNum = scanner.nextInt();
//			if(selectNum==1) {
//				System.out.println("학생 수를 입력하세요 : ");
//				studentNum = scanner.nextInt();
//				scoreArr = new int[studentNum];
//			}else if(selectNum==2) {
//				for(int i=0; i<scoreArr.length; i++) {
//					System.out.print((i+1)+"번째 점수를 입력하세요 : ");
//					scoreArr[i]=scanner.nextInt();
//				}
//			}else if(selectNum==3) {
//				for(int i=0; i<scoreArr.length; i++) {
//					System.out.println((i+1)+"번째 점수 : "+scoreArr[i]);
//				}
//			}else if(selectNum==4) {
//				for(int i=0; i<scoreArr.length; i++) {
//						max = max<scoreArr[i]?scoreArr[i]:max;
//						sum += scoreArr[i];
//						avg = (double)sum/scoreArr.length;
//					}
//					System.out.println("총점수 : "+sum);
//					System.out.println("최고점수 : "+max);
//					System.out.printf("평균점수 :%.3f \n",avg);
//				} else if(selectNum==5) {
//				run=false;
//			}
//		} 
//		System.out.println("종료되었습니다.");
		
		
//		int[][] numArr = new int[5][5];
//		
//		for (int i=0; i<numArr.length; i++) {
//			for(int j=0; j<numArr.length; j++) {
//				if(i==j) {
//					numArr[i][j] = 1;
//					}
//				else if(i<j) {
//					numArr[i][j] = 2;
//				}
//				else {
//					numArr[i][j] = 3;
//				}
//System.out.print(numArr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int menuNum;
		int count;
		String select;
		int ame = 3500;
		int caff = 4100;
		int ban = 4300;
		int menu = 0;
		int menu1 = 0;
		int menu2 = 0;
		
		
		while(run) {

			System.out.println("======== 메뉴 ========");
			System.out.println("1. 아메리카노      3500원");
			System.out.println("2. 카페라떼       4100원");
			System.out.println("3. 바닐라라떼      4300원");
			System.out.println("=====================");
			System.out.print("메뉴선택 : ");
			menuNum = scanner.nextInt();
			System.out.print("수량선택 : ");
			count = scanner.nextInt();
			System.out.print("추가 주문 하시겠습니까?(y/n) : ");
			select = scanner.next();
			
			if (select.equals("y")) {
				
				run = true;
			} else {
				
				if(menuNum==1) {
					menu = ame*count;
				}
				if (menuNum==2) {
					menu1 = caff*count;
				}
				if (menuNum==3) {
					menu2 = ban*count;
				}
				
				System.out.println("=====================");
				
				if( menu != 0) {
					System.out.println("아메리카노 " + count + "잔 :" + ame*count);
				}
				if( menu1 != 0) {
					System.out.println("카페라떼 " + count + "잔 :" + caff*count);
				}
				if( menu2 != 0) {
					System.out.println("바닐라라떼 " + count + "잔 :" + ban*count);
				}
				System.out.println("=====================");
				System.out.println("총액 : " + (menu+menu1+menu2));
			
				run = false;
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		//////////
	}

}
