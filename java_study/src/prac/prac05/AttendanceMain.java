package prac.prac05;

import java.util.ArrayList;
import java.util.List;

public class AttendanceMain {
	// 상태코드로 관리하면 편하다!

	public static void main(String[] args) {
		
		List<AttendanceList> attList = new ArrayList<>();

		AttendanceList att1 = new AttendanceList("일번",001,true,8);
		AttendanceList att2 = new AttendanceList("이번",002,true,7);
		AttendanceList att3 = new AttendanceList("삼번",003,true,9);
		AttendanceList att4 = new AttendanceList("사번",004,true,11);
		AttendanceList att5 = new AttendanceList("오번",005,true);
		AttendanceList att6 = new AttendanceList("육번",006,false,0);
		
		attList.add(att1);
		attList.add(att2);
		attList.add(att3);
		attList.add(att4);
		attList.add(att5);
		attList.add(att6);
		
		for(AttendanceList item : attList) {
			item.checkOn();
			item.holyOn();
			item.lateOn();
		}

	}

}
