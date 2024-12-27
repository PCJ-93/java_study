package thread;

public class Thread01 extends Thread { // 스레드를 상속받아서 스레드객체가 되었다

	public void run() { // 스레드 객체안에는 런 메소드 만들어줘야한다.  메인에서 start()로 호출한다.

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
	
}
