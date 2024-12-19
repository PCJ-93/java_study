package cls.prac.prac02;

import java.util.ArrayList;

public class Ref {

	String brand;
	int liter;
	int doorCnt;
	boolean isPowerOn;
	int ondo;
	int maxOndo;
	int minOndo;
	
	Icetray icetray1;
	ArrayList<Icetray> icetrayList;

	public Ref() {
		brand = null;
		liter = 0;
		doorCnt = 1;
		isPowerOn = false;
		maxOndo = 4;
		minOndo = -5;

	}

	public Ref(String brand, int liter) {
		this.brand = brand;
		this.liter = liter;
		doorCnt = 1;
		isPowerOn = false;
		maxOndo = 4;
		minOndo = -5;
	}

	public void powerOn() {
		isPowerOn = true;
	}

	public void powerOff() {
		isPowerOn = false;
	}

	public void ondoUp() { // 온도 1도 올리기
		if (ondo + 1 <= maxOndo) {
			this.ondo += 1;
		}
	}

	public int ondoDown() { // 온도 1도 내리고 최종온도반환
		if (ondo - 1 >= minOndo) {
			ondo -= 1;
		}
		return ondo;
	}

	public void medifyTemp(int ondo) {
		this.ondo += ondo;
	}

}
