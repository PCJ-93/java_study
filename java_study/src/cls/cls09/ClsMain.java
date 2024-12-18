package cls.cls09;

import java.util.ArrayList;

public class ClsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LectureRoom room = new LectureRoom();
		room.floor = 7;
		room.roomNumber = 3;
		room.pyeong = 30;
		room.hasWhiteBoard = true;
		
//		room.whiteBoard = new WhiteBoard();
//		room.whiteBoard.sizeX = 1200;
//		room.whiteBoard.sizeY = 800;
		
		WhiteBoard board = new WhiteBoard();
		board.sizeX = 1200;
		board.sizeY = 800;
		board.price = 120000;
		board.isMag = true;
		
		room.whiteBoard = board;
		
		Aircon con = new Aircon();
		room.aircon = con;
		room.aircon = new Aircon();
		
		Desk d1 = new Desk();
		//room.deskList = new ArrayList<Desk>();   // lectureroom에 생성자에서 미리 deskList = new ArrayList<Desk>(); 해줘서 안써도됨.
		
		ArrayList<Desk> deskList = new ArrayList<Desk>();
		for(int i=1; i<=10; i++) {
			Desk d = new Desk();
			d.sizeX = 800;
			d.sizeY = 600;
			d.color = "흰색";
			
			deskList.add(d);
		}
		
		for(int i=1; i<=5; i++) {
			deskList.add(new Desk(1200,600,"오크색"));
		}
		
		//room.deskList = deskList;
		room.setDeskList(deskList);
		
		room.addDesk(new Desk(500, 500, "검정색"));
		
		//getter List 불러오고 거기다가 한개 add 추가, 다시 setter 저장
		
		/*
		room.deskList.add(new Desk());
		room.deskList.add(d1);
		
		
		// 사이즈 800 600인 책상 10개 넣어라~
		for(int i=1; i<=10; i++) {
			Desk d = new Desk();
			d.sizeX = 800;
			d.sizeY = 600;
			d.color = "흰색";
			
			room.deskList.add(d);
		}
		
		// 1200 600 5개
		for(int i=1; i<=5; i++) {
//			Desk d = new Desk();
//			d.sizeX = 1200;
//			d.sizeY = 600;
//			d.color = "오크색";
			
//			Desk d = new Desk(1200,600,"오크색"); //생성자 사용
//			room.deskList.add(d);
			
			room.deskList.add(new Desk(1200,600,"오크색"));
		}
		*/
	
		

	}

}
