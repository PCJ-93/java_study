package prac.prac04;

import java.util.ArrayList;
import java.util.List;

public class EduCenter {

	public static void main(String[] args) {

		String adress;
		int roomCnt;
		int peopleCnt;
		int year;
		
		List<Room> roomList;
		
		Foyer f1 = new Foyer();
		f1.chairCnt = 3;
		f1.tableCnt = 4;
		f1.type = "휴게실";
		f1.pyeong = 10;
		
		f1.pyeongInfo();
		f1.ctCntInfo();
		

		Office of1 = new Office();
		of1.chairCnt = 5;
		of1.tableCnt = 25;
		of1.keyboardCnt = 23;
		of1.monitorCnt = 21;
		of1.mouseCnt = 12;
		of1.pyeong = 20;
		of1.desktopCnt = 5;
		of1.type = "사무실";
		
		of1.pyeongInfo();
		of1.kmdmCntInfo();
		of1.ctCntInfo();
		
		ClassRoom cr1 = new ClassRoom();
		cr1.roomNum = 1001;
		cr1.type = "강의실";
		cr1.chairCnt = 12;
		cr1.desktopCnt = 3;
		cr1.keyboardCnt = 12;
		cr1.monitorCnt = 3;
		cr1.tableCnt = 2;
		
		cr1.pyeongInfo();
		cr1.ctCntInfo();
		
		EmployeeList e1 = new EmployeeList("홍길동","011",32);
		EmployeeList e2 = new EmployeeList("김길동","012",33);
		EmployeeList e3 = new EmployeeList("이길동","013",35);
		EmployeeList e4 = new EmployeeList("박길동","014",36);
		List<EmployeeList> empList;
		empList = new ArrayList<EmployeeList>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		for(EmployeeList item : empList) {
			System.out.println(item.name + item.age + item.tel);
		}
		

		
	}
	
	
}

