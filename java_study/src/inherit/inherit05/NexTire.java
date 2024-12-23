package inherit.inherit05;

public class NexTire extends Tire {
	// 필드
	// 생성자
	public NexTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " NexTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " NexTire 펑크 ***");
			return false;
		}
	}
}