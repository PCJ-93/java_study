package inter.inter01;

public interface Temp { // 인터페이스 파일
	// 인터페이스는 객체로 생성불가 생성자 가질 수 없다.
	
	// 변수생성시 상수  static final 이 기본적으로 붙어있다고 생각하면된다.
	static final int CODE = 30;
 	int TYPE = 50;
 	
 	
 	// method 생성시 abstract 가 기본적으로 붙어있다고 생각하면된다.
 	public abstract void method1();
 	public void method2(); // 기본적으로 추상메소드다. {}중괄호 못씀.

}
