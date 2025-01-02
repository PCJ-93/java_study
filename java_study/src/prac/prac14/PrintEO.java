package prac.prac14;

public class PrintEO {

	private boolean isOddTurn = true;

	public synchronized void printOdd(int number) {
		while (!isOddTurn) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(number);
		isOddTurn = false;
		notify();
	}

	public synchronized void printEven(int number) {
		while (isOddTurn) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(number);
		isOddTurn = true;
		notify();
	}

}
