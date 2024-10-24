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
		

		
		int price = 12001;
		
		
		
		String result =(price>12000)?"물로배채우기":(price>8000)?"눈물":(price>6000)?"선방":"훌륭";
		System.out.println(result);
		
		
		
		
		
		
		
		
		//////////
	}

}
