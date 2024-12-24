package prac.prac05;

public class AttendanceList extends Attendance {
	
	// 상태코드로 관리하면 편하다!

	public AttendanceList(String name, int deptno, boolean check, int checkTime) {
		this.name = name;
		this.deptno = deptno;
		this.check = check;
		this.checkTime = checkTime;
	}
	public AttendanceList(String name, int deptno, boolean holy) {
		this.name = name;
		this.deptno = deptno;
		this.holy = holy;
	}
	

	public void checkOn() {
		if (check == true && checkTime <= workTime) {
			System.out.println(toDate.format(date) + " " + name + " 정상출근 /" + " 사원번호: " + deptno);
		}
	}
	public void lateOn() {
		if(check == true && checkTime > workTime) {
			lateTime = checkTime - workTime;
			System.out.println(toDate.format(date) + " " + name + " 출근(지각:" + lateTime + ") 사원번호: " + deptno);
		}
	}
	public void holyOn() {
		if(holy == true) {
			System.out.println( deptno + " " + name + " 는 휴가자 입니다.");
		}
	}

}
