package cls.cls05.pack1;

public class Point {

	private int math; // 점수관리하는데 점수의범위는 0~100 점
	private int eng;
	private int com;

	// getXXX getter
	// setXXX setter

	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setCom(int com) {
		if (com > 100) {
			this.com = 100;
		} else if (com < 0) {
			this.com = 0;
		} else {
			this.com = com;
		}
	}
	public int getCom() {
		return com;
	}
	
	public Point getPoint() {
		return new Point();
	}

}
