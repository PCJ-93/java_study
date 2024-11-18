package prac;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String 브랜드명 = "로지텍";
		String 상품명 = "mx kyes";
		int 상품가격 = 135000;           // String 상품가격 = "135000";  후에 할인등으로 값이 바뀔수 있으니 int로 주는게 좋다
		String 시리얼번호 = "332L1545K";
		System.out.println(브랜드명);
		System.out.println(상품명);
		System.out.println(상품가격);
		System.out.println(시리얼번호);
		
		System.out.println("");    // 출력창 엔터키(줄바꿈) 기능
		
		String 회사명 = "SAMSUNG";
		int 모니터인치 = 24;              //String 모니터인치 = "24";
		String 모니터색상 = "black";
		boolean HDMI포트여부 = true;            // open   isOpened   isHdmiPort 이런식으로 앞쪽에 is, can, has 등.. 표기해서 불린타입찾기 쉽게 변수명 지어줌
		boolean 소리출력가능여부 = false;          // close  idClosed   canPlaySound
		System.out.println(회사명);
		System.out.println(모니터인치);
		System.out.println(모니터색상);
		System.out.println(HDMI포트여부);
		System.out.println(소리출력가능여부);
		
		System.out.println("");
		
		double pi = 3.14;
		System.out.println("원주율 : "+pi);
		
		System.out.println("");
		
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		
		int totalscore = 
				Integer.parseInt(mathScore)
				+Integer.parseInt(englishScore)
				+Integer.parseInt(artScore);
		System.out.println("총점 : " + totalscore);
		
		System.out.println("");
		/*
		5. 조카에게 나눗셈 계산하는 연습을 시키고 있습니다.
		4 / 10 을 실행시켜서 결과가 0.4 가 나오는 것을 보여주려고 하는데 아래 계산 결과가 맞지 않습니다.
		정상적으로 0.4 가 계산되서 출력되도록 만들어주세요.
		 */
//		int num1 = 4;
//		int num2 = 10;
//		double num3 = (double) num1 / num2 ;
//		System.out.println( num3 );
		
		int num1 = 4;
		int num2 = 10;
		double num3 = num1 / (double)num2 ;
		System.out.println( num3 );
		
		
		
		
		
	}

}
