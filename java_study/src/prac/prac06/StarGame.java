package prac.prac06;

//공통 동작과 상태를 추상화한 부모 클래스
abstract class Unit {   // 추상클래스  유닛이라는거를 생성하지는 않는다. (마린,탱크, 이런거만가능)
	int x, y; // 현재 위치

	// 모든 유닛이 공통으로 사용하는 정지 메서드
	void stop() {
		System.out.println("현재 위치에 정지합니다.");
	}

	// 움직이는 동작은 유닛마다 다르므로 추상 메서드로 정의
	abstract void move(int x, int y);
}

//Marine 클래스
class Marine extends Unit {
	// Marine만의 기능
	void stimPack() {
		System.out.println("스팀팩을 사용합니다.");
	}

	// 걷는 방식으로 이동
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine이 (" + x + ", " + y + ")로 걷습니다.");
	}
}

//Tank 클래스
class Tank extends Unit {
	// Tank만의 기능
	void changeMode() {
		System.out.println("공격 모드를 변환합니다.");
	}

	// 바퀴로 이동
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank가 (" + x + ", " + y + ")로 바퀴로 이동합니다.");
	}
}

//Dropship 클래스
class Dropship extends Unit {
	// Dropship만의 기능
	void load() {
		System.out.println("선택된 대상을 태웁니다.");
	}

	void unload() {
		System.out.println("선택된 대상을 내립니다.");
	}

	// 날아서 이동
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Dropship이 (" + x + ", " + y + ")로 날아갑니다.");
	}
}
