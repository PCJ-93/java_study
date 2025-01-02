package prac.prac14;

public class MoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEO p1 = new PrintEO();

//		Thread1357 t1 = new Thread1357(p1);
//		Thread2468 t2 = new Thread2468(p1);
//		t1.start();
//		t2.start();

//		EvenThread et = new EvenThread();
//		OddThread ot = new OddThread();
//		et.start();
//		ot.start();

		Thread t1 = new Thread(new EvenRunnable());
		Thread t2 = new Thread(new OddRunnable());
		t1.start();
		t2.start();
	}
}


class EvenThread extends Thread {
	public void run() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class EvenRunnable implements Runnable {
	public void run() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
