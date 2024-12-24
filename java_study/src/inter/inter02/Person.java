package inter.inter02;

public class Person {
	
//	GalaxyPhone gp;
//	IPhone ip;
	
	Callable callPhone;  // new GalaxyPhone() O  new IPhone() O
	
	public void call(String phoneNumber) { // 사람이 전화를 거는 메소드
		//phoneNumber 쪽 전화번호로 전화를 걸자!
		callPhone.call();
	}

}
