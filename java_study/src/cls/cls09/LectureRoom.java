package cls.cls09;

import java.util.ArrayList;

public class LectureRoom {

	int floor;		// 층수 7층
	int roomNumber; //강의실번호 3교육실
	double pyeong; //강의실 평수  30
	boolean hasWhiteBoard;
	
	Aircon aircon;
	WhiteBoard whiteBoard;
	
	//Desk desk;
	//Desk[] deskArr;
	private ArrayList<Desk> deskList;
	
	public LectureRoom() {
		floor = 0;
		roomNumber = 0;
		pyeong = 0;
		hasWhiteBoard = false;
		whiteBoard = null;
		aircon = null;
		deskList = null;
		//deskList = new ArrayList<Desk>(); //어차피 쓸거 미리 초기화
	}
	
	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public void addDesk(Desk desk) {
		
		if(this.deskList == null) {  // 예외처리     // 데스크리스트가 널 이면 데스크리스트 초기화해서 만들어줌
			this.deskList = new ArrayList<Desk>();
		}
		
		this.deskList.add(desk);
	}
	
}
