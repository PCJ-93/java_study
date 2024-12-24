package abst;

public abstract class Beverage { // 음료  abstract 추상클래스  ..인터페이스를 더많이씀
	
	String name; //이름
	int ml; 	//용량
	
	public void intro() {
		System.out.println("저는 음료입니다.");
	}
	
	public abstract void checkSafety(); //안전검사 추상 메소드  //추상클래스에 추상메소드 선언
		

}
