package prac.prac05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Attendance { 
	
	// 상태코드로 관리하면 편하다! (1:출근 2:지각 3:조퇴 4:결근 5:휴가 ...) 숫자로
	
	Date date = new Date();
	SimpleDateFormat toDate = new SimpleDateFormat("yyyy/MM/dd");
	String name;
	int deptno;
	boolean check = false; // 출근여부 t출근 f결근
	boolean holy = false;  // 휴가여부 t휴가 f출근날
	int checkTime;  // 사원이 출근 한 시간
	int lateTime;  // 지각시간
	int early;     // 조퇴시간
	int workTime = 9;  // 출근해야하는시간

}
