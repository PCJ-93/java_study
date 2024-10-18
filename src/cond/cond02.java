package cond;

public class cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if, if else, switch
		
		int dice = 1;
		// if
		if (dice == 1) {
			System.out.println("한칸 전진");
		}
		
		// if else
		if (dice == 1) {
			System.out.println("한칸전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}
		
		
		
		if (dice == 1) { //1
			
		} else if (dice == 2) { //2
			
		} else if (dice == 3) { //3
			
		} else { // 그외에  
			
		}
		
		
		
		if (dice == 1) { //1
		} else if (dice == 2) { //2
		} else if (dice == 3) { //3
		} else if (dice == 4) { //4          
		} else if (dice == 5) { //5
		} else if (dice == 6) { //6            모두해당안될경우 패스
		}
		
		
		if (dice == 1) { //1
		} else if (dice == 2) { //2
		} else if (dice == 3) { //3
		} else if (dice == 4) { //4
		} else if (dice == 5) { //5
		} else {                //6            모두해당안될경우 마지막 부분 실행
		}
		
		System.out.println("===========switch================");
		dice = 5;
		switch(dice) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break;
		case 4: System.out.println("4"); break;
		case 5: System.out.println("5"); break;
		case 6: System.out.println("6"); break;
			default: System.out.println("default");     //위에있는 케이스에 맞지않으면 실행
		}
		
		
		// 8시 출근 : 청소
		// 9시 : 회의
		// 10시 : 업무
		// 11시 : 외근

		int showTime = 9;
		// if         해당하는 시간부터 이후로 다 실행
		if ( showTime <= 8 ) {
			//청소
		}
		if ( showTime <= 9 ) {
			//회의
		}
		if ( showTime <= 10 ) {
			//업무
		}
		if ( showTime <= 11 ) {
			//외근
		}
		
		// if else       해당하는 구간만 실행
		if ( showTime <= 8 ) {
			//청소
			//회의
			//업무
			//외근
		} else if ( showTime <= 9 ) {
			//회의
			//업무
			//외근
		} else if ( showTime <= 10 ) {
			//업무
			//외근
		} else if ( showTime <= 11 ) {
			//외근
		}
		
		// switch           break; 없으면 해당 구간 이후 다 실행    case 숫자와 변수가 같아야함..
		switch ( showTime ) {
		case 8:
			//청소
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
			default:
		}
		
		
		int goBedTime =21;  // 잠든 시간
		int sleepTime = 9;    // 잔 시간
		
		// 일찍  많이/조금
		// 늦게  많이/조금
		
		if (goBedTime <= 21) {
			//일찍 잤구나
			if(sleepTime >= 9) {
				//많이 잤구나~
				if (sleepTime >= 12) {
					//너무많이잔거같다
				}
				
			} else {
				//조금 잤구나~
			}
			
		} else {
			//좀 늦게 잤구나
			if(sleepTime >= 9) {
				//많이 잤구나~
			} else {
				//조금 잤구나~
			}
			
		}
		
		
		if (goBedTime <= 21 && sleepTime >= 9 ) {
			// 일찍 / 많이
		} else if (goBedTime <= 21 && !(sleepTime >= 9) ) {
			// 일찍 / 조금
//		} else if (goBedTime <= 21 && sleepTime < 9 ) {
			// 일찍 / 조금
		} else if (goBedTime > 21 && sleepTime >= 9) {
			// 늦게 / 많이
		}
		
		
		
		
		
		
		

	}

}
