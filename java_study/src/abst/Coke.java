package abst;

public class Coke extends Beverage { //콜라
	
	int sugarGram; //당분용량
	
	public void checkSafety() { // Beverage 에 추상메소드 있어서 반드시 선언해줘야함
		System.out.println("성분정상인가");
	}
	

}
