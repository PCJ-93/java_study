package cls.cls10;

public class AttendTool { // 출결도구
	
	boolean isOn;
	String forOrg;
	// 센터 서버
	// 학생 명단
	

	// int 1:출석성공 2:퇴실성공 3:실패
	public int checkAttend2(Card card) { //출석체크메소드
		// card 확인
		// 오늘기록X -> 출석
		return 1;
		// 출석기록 -> 퇴실
		// return 2;
		
		// 문제 -> 처리실패
		// return 3;
	}
	
	// 출첵결과 - 정상 true 실패 false
	public boolean checkAttend(Card card) { //출석체크메소드
		// 구성원목록
		// 목록 == card.id
		// 출석상태 체크
		// 출석x 면 찍을때 출석o로
		// 출석o 면 찍을때 퇴실로
		return true;
	}
	
	public boolean checkAttend(Card card, Student s) {
		return false;
	}

}
