package prac.prac09;

public class ObjectGrouping {

	public static void main(String[] args) {
		// 다양한 객체 생성
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();

		// 인터페이스 타입으로 그룹화
		Flyable[] flyableThings = { bird, copter, rocket };

		// 모든 날것들을 날림
		for (int i = 0; i < flyableThings.length; i++) {
			Flyable temp = flyableThings[i];
			temp.fly();
		}
	}
}

interface Flyable {
	public void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다!");
	}
}

class Helicopter implements Flyable {
	public void fly() {
		System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
	}
}

class Rocket implements Flyable {
	public void fly() {
		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
	}
}