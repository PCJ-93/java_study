package prac;

public class PracTestLevel0_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  레벨 4
		int random;
		int myRandom;
		int outCount = 0;  // 아웃된 수
		int gameCount = 0;  // 회차 카운트 ( 게임종료용 )
		String[] playerArr = new String[9];
		for(int i=0; i<playerArr.length; i++) {
			playerArr[i] = (i+1) + "번타자 " + (i+1) + "돌이";
		}
		int up = 0;
		int ggggg = 1;    //회차카운트 ( n회차 출력용 )
		int[] antaCountArr = new int[playerArr.length];
		int[] swingCountArr = new int[playerArr.length];
		double[] antaPersentArr = new double[playerArr.length];
		
		
		
			while(true) {
				System.out.println("   " + ggggg + "회차");
				System.out.println(playerArr[up] + " 타율:"+antaPersentArr[up] + " 타석수:"+swingCountArr[up]);
				random = ((int)(Math.random()*100)+1);
				myRandom = ((int)(Math.random()*100)+1);
				swingCountArr[up] += 1;
				
				
				if(random == myRandom) {
					System.out.println(" --안타--");
					antaCountArr[up] += 1;
					antaPersentArr[up] = antaCountArr[up] / (double)swingCountArr[up];
				} else {
					System.out.println(" --아웃--");
					outCount++;
				}
				
				if(outCount==3) {
					outCount=0;
					ggggg++;
					gameCount++;
				}
			
				if(gameCount==3) {
					break;
			}
				up++;
				if(up == 9) {
					up = 0;
				}
		}
		System.out.println("============게임 종료============");
		
		
////
	}
}
