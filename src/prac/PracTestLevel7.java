package prac;

public class PracTestLevel7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tusuNumArr = new String[9];  // 타자 목록
		int[] swingCountArr = new int[tusuNumArr.length];  // 각선수가 휘두른 수
		int[] antaCountArr = new int[tusuNumArr.length];  // 각선수 안타친 수
		int random = (int)(Math.random()*100)+1;   // 투수가 던지는 수
		int myRandom = (int)(Math.random()*100)+1;  // 선수가 치는 수
		int strike = 0;
		int ball = 0;
		int outCount = 0; 
		double[] antaPersentArr = new double[tusuNumArr.length]; //각선수 안타수
		int gameCount = 1; //회차
		int base = 0;  // 베이스 밟는 수
		int basePoint = 0;  // 베이스 점수
		int[] ball4Arr = new int[tusuNumArr.length];  // 각선수 볼넷카운트
		int[] tusuOutCountArr = new int[tusuNumArr.length]; //  각선수 아웃카운트
		
		
		for(int i=0; i<tusuNumArr.length; i++) {
			tusuNumArr[i] = (i+1)+"번타자: " + (i+1)+"돌이";
		}
		int Q = 0;  //타자 순서 올리기용
		while(true) {
			
			while(true) {
				System.out.println(gameCount + "회차");
				System.out.printf("%s 타율:%f 안타:%d 볼넷:%d 아웃:%d\n",tusuNumArr[Q] , antaPersentArr[Q], antaCountArr[Q], ball4Arr[Q], tusuOutCountArr[Q]);
				for(int i=1; i<=4; i++) {
					random = (int)(Math.random()*100)+1;
					myRandom = (int)(Math.random()*100)+1;
					
					swingCountArr[Q] += 1;
					
					if( (random>=1 && random<=20) || (random>=50 && random<=60) || (random>=90 && random<=100) ) {
						System.out.println("스트라이크");
						strike++;
						if(strike == 2) {
							break;
						}
					} else {
						System.out.println("볼");
						ball++;
						if(ball == 3) {
							break;
						}
					}
				}
				
				if( (myRandom==random || myRandom-random<=3 || random-myRandom<=3) && ball==3 && strike<2) {
					System.out.println("안타");
					antaCountArr[Q] += 1;
					antaPersentArr[Q] = antaCountArr[Q]/(double)swingCountArr[Q];
					ball4Arr[Q] += 1;
					
					base++;
	
				} else {
					if (strike>=2) {
						System.out.println("스트라이크 아웃");
						tusuOutCountArr[Q] += 1;
						outCount++;
					} else {
					System.out.println("아웃");
					tusuOutCountArr[Q] += 1;
					outCount++;
					}
				}
				Q++;
				strike = 0;
				ball = 0;
				
				if(Q==9) {
					Q=0;
				}
				
				if(base == 4) {
					basePoint += 1;
				}
				
				
				if(outCount ==3) {
					outCount = 0;
					gameCount++;
					base = 0;
					break;
				}
				
				
			}
			if(gameCount==4) {
				System.out.println("경기종료");
				System.out.println("총점 : " + basePoint);
				break;
			}
			
		}
		
		
		
///
	}
}
