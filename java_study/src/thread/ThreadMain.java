package thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		for(int i = 11; i < 20; i++) {
//			System.out.println(i);
//		}
		
		Thread01 t1 = new Thread01();
		Thread01 t12 = new Thread01();
		Thread t13 = new Thread01();  // 부모타입 = 자식객체
		
		//t1.run(); // 이거는 run이라는 메소드를 그냥 부른거다 스레드가 아님..
		t1.start(); // 스레드01의 run메소드는 start()메소드로 호출한다. 스레드 실행..
		t12.start();
		t13.start();
		
		
		Thread02 t2 = new Thread02();
		Thread t22 = new Thread(t2);  //new Thread(Runnable task);
		t22.start();
		
		Thread t23 = new Thread(new Thread02()); // 위와같은데 간소화
		t23.start();
		
		System.out.println(t23.getName()); // Thread-4  n번째 스레드

	}

}
