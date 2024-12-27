package prac.prac11;

import java.util.Scanner;

public class FoodTruck extends FoodTruckMain {

	int ksell = 0;
	int dsell = 0;
	int wsell = 0;
	int rsell = 0;
	double total = 0;
	double trash = 0;
	
	static Scanner scanner = new Scanner(System.in);

	public void foodTruckStart() {

		while (true) {

			System.out.println("---------------------------------");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print("숫자 선택 : ");
			String menuNum = scanner.nextLine();
			int selectNum;
			
			try {
				selectNum = Integer.parseInt(menuNum);
			}catch (Exception e) {
				selectNum = 0;
			}
			
			System.out.println();

			if (selectNum == 1) {
				Food.menu();
			} else if (selectNum == 2) {
				Food.menu();
				System.out.print("숫자선택 : ");
				String menuNum2 = scanner.nextLine();
				int selectNum2;
				
				try {
					selectNum2 = Integer.parseInt(menuNum2);
				}catch (Exception e) {
					selectNum2 = 0;
				}
				
				while (true) {
					if (selectNum2 == 1) {
						if(Food.k1.cnt>0) {
						Food.k1.cnt--;
						ksell++;
						total += Food.k1.price;
						System.out.println("김밥 주문완료");
						}else {
							System.out.println("재고없음");
						}
						break;
					} else if (selectNum2 == 2) {
						if(Food.d1.cnt>0) {
							Food.d1.cnt--;
							dsell++;
							total += Food.d1.price;
							System.out.println("돈까스 주문완료");
							}else {
								System.out.println("재고없음");
							}
						break;
					} else if (selectNum2 == 3) {
						if(Food.w1.cnt>0) {
							Food.w1.cnt--;
							wsell++;
							total += Food.w1.price;
							System.out.println("우동 주문완료");
							}else {
								System.out.println("재고없음");
							}
						break;
					} else if (selectNum2 == 4) {
						if(Food.r1.cnt>0) {
							Food.r1.cnt--;
							rsell++;
							total += Food.r1.price;
							System.out.println("라면 주문완료");
							}else {
								System.out.println("재고없음");
							}
						break;
					} else {
						System.out.println("다시입력 : ");
						menuNum2 = scanner.nextLine();
						
						try {
							selectNum2 = Integer.parseInt(menuNum2);
						}catch (Exception e) {
							selectNum2 = 0;
						}
						
					}
				}
			} else if (selectNum == 3) {
				Food.menu();
				System.out.println("재고 추가할 메뉴 : ");
				
				String menuNum3 = scanner.nextLine();
				int selectNum3;
				
				try {
					selectNum3 = Integer.parseInt(menuNum3);
				}catch (Exception e) {
					selectNum3 = 0;
				}
				
				while (true) {
					if (selectNum3 == 1) {
						System.out.println("몇개 추가? : ");
						String addCnt1 = scanner.nextLine();
						int addCnt;
						
						try {
							addCnt = Integer.parseInt(addCnt1);
						}catch (Exception e) {
							addCnt = 0;
						}
						Food.k1.cnt += addCnt;
						System.out.println("김밥 재고 추가 완료");
						break;
					} else if (selectNum3 == 2) {
						System.out.println("몇개 추가? : ");
						String addCnt1 = scanner.nextLine();
						int addCnt;
						
						try {
							addCnt = Integer.parseInt(addCnt1);
						}catch (Exception e) {
							addCnt = 0;
						}
						Food.d1.cnt += addCnt;
						System.out.println("돈가스 재고 추가 완료");
						break;
					} else if (selectNum3 == 3) {
						System.out.println("몇개 추가? : ");
						String addCnt1 = scanner.nextLine();
						int addCnt;
						
						try {
							addCnt = Integer.parseInt(addCnt1);
						}catch (Exception e) {
							addCnt = 0;
						}
						Food.w1.cnt += addCnt;
						System.out.println("우동 재고 추가 완료");
						break;
					} else if (selectNum3 == 4) {
						System.out.println("몇개 추가? : ");
						String addCnt1 = scanner.nextLine();
						int addCnt;
						
						try {
							addCnt = Integer.parseInt(addCnt1);
						}catch (Exception e) {
							addCnt = 0;
						}
						Food.r1.cnt += addCnt;
						System.out.println("라면 재고 추가 완료");
						break;
					} else {
						System.out.println("다시입력 : ");
						selectNum3 = scanner.nextInt();
					}
				}

			} else if (selectNum == 4) {
				
				System.out.printf("김밥판매수량 : %d 돈까스판매수량: %d 우동판매수량: %d 라면판매수량: %d\n",ksell, dsell, wsell, rsell);
				System.out.printf("총 판매 금액: %.0f원\n",total);
				trash = ((Food.k1.cnt*Food.k1.price)+(Food.d1.cnt*Food.d1.price)+(Food.w1.cnt*Food.w1.price)+(Food.r1.cnt*Food.r1.price))*0.3;
				System.out.printf("폐기손해 : %.0f원\n", trash);
				System.out.printf("최종수익 : %.0f원\n",total-trash);
				break;
			} else {
				System.out.println("다시선택하세요");
			}

		}

	}

}
