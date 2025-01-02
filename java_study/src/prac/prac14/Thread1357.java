package prac.prac14;

public class Thread1357 extends Thread {

	private final PrintEO printer;

	public Thread1357(PrintEO printer) {
		this.printer = printer;
	}

	public void run() {

		for (int i = 1; i <= 100; i += 2) {

			printer.printOdd(i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
