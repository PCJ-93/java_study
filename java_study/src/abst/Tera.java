package abst;

public class Tera extends Beverage {

	double alcol; // 알콜도수 5.5

	public void checkSafety() {	// Beverage 에 추상메소드 있어서 반드시 선언해줘야함
		System.out.println("도수맞나");
	}

}
