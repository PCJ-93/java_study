package prac.prac14;

public class Thread2468 extends Thread {

	private final PrintEO printer;

	public Thread2468(PrintEO printer) {
		this.printer = printer;
	}

	public void run() {

		for (int i = 2; i <= 100; i += 2) {

			printer.printEven(i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
