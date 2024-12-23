package inherit.inherit05;

public class CarExample {
	public static void main(String[] args) {
		
		Tire t1 = new HankookTire("앞왼쪽", 7);
		Tire t2 = new HankookTire("앞오른쪽", 7);
		Tire t3 = new HankookTire("뒤왼쪽", 7);
		Tire t4 = new HankookTire("뒤오른쪽", 7);
		Car car = new Car(t1,t2,t3,t4);

		for (int i = 1; i <= 10; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case Car.FRONT_LEFT_TIRE:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.tireArr[Car.FRONT_LEFT_TIRE] = new HankookTire("앞왼쪽", 15);
				//car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case Car.FRONT_RIGHT_TIRE:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.tireArr[Car.FRONT_RIGHT_TIRE] = new KumhoTire("앞오른쪽", 13);
				break;
			case Car.BACK_LEFT_TIRE:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.tireArr[Car.BACK_LEFT_TIRE] = new HankookTire("뒤왼쪽", 14);
				break;
			case Car.BACK_RIGHT_TIRE:
				System.out.println("뒤오른쪽 NexTire로 교체");
				car.tireArr[Car.BACK_RIGHT_TIRE] = new NexTire("뒤오른쪽", 25);
				break;
			}
			System.out.println("----------------------------------------"+i);
		}
	}
}
