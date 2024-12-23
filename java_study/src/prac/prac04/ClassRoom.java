package prac.prac04;

public class ClassRoom extends RoomNumList  { //강의실
	
	public void pyeongInfo() {
		System.out.println( roomNum + type + "은 " + pyeong +"평입니다.");
	}
	public void ctCntInfo() {
		System.out.println(type + " 책상 : " + tableCnt + "개");
		System.out.println(type + " 의자 : " + chairCnt + "개");
	}

}
