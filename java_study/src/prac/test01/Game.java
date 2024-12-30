package prac.test01;

import java.util.Scanner;

public class Game {

	String id; // 기기아이디
	String place; // 지점명
	int totalPoint; // 총합포인트
	int point;
	int succCnt; // 성공횟수
	int failCnt; // 실패횟수
	int remainCnt; // 잔여시도횟수
	int seed;
	int sales; // 매출액

	Game(String id, String place) {
		this.id = id;
		this.place = place;
		totalPoint = 0;
		succCnt = 0;
		failCnt = 0;
		remainCnt = 0;
		sales = 0;
		seed = 0;
	}

	public void gameStart() {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;

		System.out.println("------게임시작-------");

		while (true) {
			System.out.println("1.충전  2.게임시작  3.마감");
			System.out.print(">>> 메뉴선택 (1~3) : ");
			try {
				menu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				menu = 0;
			}

			if (menu >= 1 && menu <= 3) {

				if (menu == 1) {
					if (seed == 0) {
						System.out.println("얼마충전하시겠습니까?(1000원단위만가능) : ");
						int money = scanner.nextInt();
						if (money % 1000 == 0) {
							seed = seed + money;
							remainCnt += money/500;
							sales += money;
							System.out.println(money + "원 충전이 완료되었습니다.");
						} else {
							System.out.println("1000원 단위만 가능합니다!");
							continue;
						}
					} else {
						System.out.println("돈을 다 쓰고 오세요!");
						continue;
					}
				} else if (menu == 2) {
					System.out.println("게임을 시작합니다");
					System.out.println("던지기(1) 나가기(2)");
					int gs = scanner.nextInt();
					
					if(remainCnt==0) {
						System.out.println("충전하고오세요");
					}
					while (remainCnt>0) {
						if (gs == 1) {
							int randomNum = (int) (Math.random() * 6) + 1;
							int myNum = (int) (Math.random() * 6) + 1;
							System.out.printf("룰렛숫자:%d 내가던진숫자:%d\n",randomNum, myNum);
							System.out.println();
							if (randomNum == myNum) {
								if(randomNum == 1) {
									remainCnt--;
									point += 1;
									succCnt++;
									seed -= 500;
									System.out.println("포인트+1");
									System.out.println("현재 포인트 : " + point);
								}else if(randomNum==2) {
									remainCnt--;
									point += 2;
									succCnt++;
									seed -= 500;
									System.out.println("포인트+2");
									System.out.println("현재 포인트 : " + point);
								}else if(randomNum==3) {
									remainCnt--;
									point += 3;
									succCnt++;
									seed -= 500;
									System.out.println("포인트+3");
									System.out.println("현재 포인트 : " + point);
								}else if(randomNum==4) {
									remainCnt--;
									point += 4;
									succCnt++;
									seed -= 500;
									System.out.println("포인트+4");
									System.out.println("현재 포인트 : " + point);
								}else if(randomNum==5) {
									remainCnt--;
									failCnt++;
									seed -= 500;
									System.out.println("잔여 시도횟수 -1");
									System.out.println("현재 잔여 시도횟수 " + remainCnt);
									System.out.println("최종 포인트 : " + point);
									System.out.println("성공횟수:" + succCnt + " 실패횟수:" + failCnt);
									if(remainCnt==0) {
									}
								}else if(randomNum==6) {
									remainCnt--;
									failCnt++;
									seed -= 500;
									System.out.println("잔여 시도횟수 -1");
									System.out.println("현재 잔여 시도횟수 " + remainCnt);
									System.out.println("최종 포인트 : " + point);
									System.out.println("성공횟수:" + succCnt + " 실패횟수:" + failCnt);
									if(remainCnt==0) {
									}
								}
							}

						} else if (gs == 2) {
							break;
						} else {
							System.out.println("다시 선택하세요");
							break;
						}
					}

				} else if (menu == 3) {
					if(remainCnt>0) {
						System.out.println("잔여횟수가남았습니다. 다쓰고오세요!");
						continue;
					}else if(remainCnt==0) {
						System.out.println("게임을 마감합니다");
						System.out.println("매출액 : " + sales + "원");
						break;
					}
					
				}

			} else {
				System.out.println(">>> 보기 중에 선택하세요 (1 ~ 3) : ");
			}

		}

	}
}
