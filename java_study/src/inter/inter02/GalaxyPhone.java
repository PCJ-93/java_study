package inter.inter02;

public class GalaxyPhone implements Callable, Connectable { // 갤럭시
	
	int callStatus;
	
	
	public void call() {
		System.out.println("갤럭시 전화 검");
		callStatus = Callable.CALL_ON;
	}

	public void connect() {
		System.out.println("갤럭시 블루투스 연결");
	}

}
