package prac.prac04;

public class Foyer extends Room { //휴게실
	
	int rangeCnt;  // 전자렌지갯수
	
	
	public void pyeongInfo() {
		System.out.println( type + " 은 " + pyeong +"평입니다.");
	}
	public void ctCntInfo() {
		System.out.println( type + " 책상 : " + tableCnt + "개");
		System.out.println( type + " 의자 : " + chairCnt + "개");
	}

}
