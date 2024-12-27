package thread;

public class Thread02 implements Runnable {

	public void run() { // 스레드 객체안에는 런 메소드 만들어줘야한다. 메인에서 start()로 호출한다.

		for (int i = 11; i <= 20; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
}
