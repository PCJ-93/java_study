package prac.prac04;

public class Office extends Room  { //사무실
	
	
	
	public void pyeongInfo() {
		System.out.println( type + "은 " + pyeong +"평입니다.");
	}
	public void ctCntInfo() {
		System.out.println( type + " 책상 : " + tableCnt + "개");
		System.out.println( type + " 의자 : " + chairCnt + "개");
	}
	public void kmdmCntInfo() {
		System.out.println( type + " 키보드 : " + keyboardCnt + "개");
		System.out.println( type + " 마우스 : " + mouseCnt + "개");
		System.out.println( type + " 본체 : " + desktopCnt + "개");
		System.out.println( type + " 모니터 : " + monitorCnt + "개");
	}

}
