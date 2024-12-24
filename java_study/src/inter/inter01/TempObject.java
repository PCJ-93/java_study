package inter.inter01;

public class TempObject implements Temp, Temp2 {

	public void method1() { // Temp 에있는 추상메소드들
		System.out.println("Temp-method1");
	}
	public void method2() { // Temp 에있는 추상메소드들
		System.out.println("Temp-method2");
	}
	public void method3() { // Temp2 에있는 추상메소드
		System.out.println("Temp2-method3");
	}
	
}
