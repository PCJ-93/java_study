package cls.cls04;

public class IpadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ipad p1 = new Ipad(); //인스턴스 객체 생성
		
		p1.owner = "내거";
		p1.powerOn();
		
		Ipad p2 = new Ipad();
		p2.owner = "니거";
		
		System.out.println(p1.owner);
		System.out.println(Ipad.madeBy);   // static 호출  (클래스명.변수) 권장방법
		System.out.println(p1.madeBy);                              //권장X방법
		
		Ipad.check(); // static 호출  (클래스명.함수)
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
	}

}
