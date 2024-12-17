package prac;

public class Monitor {

	String company;
	int inch;
	int price;
	String color;
	int maxx;
	int maxy;
	int priceUp;
	
	public Monitor(String company, int inch, int price) {
		this.company = company;
		this.inch = inch;
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}
//	public int setMaxx(int maxx) {
//		this.maxx = maxx;
//		return this.maxx;
//	}
//	public int setMaxy(int maxy) {
//		this.maxy = maxy;
//		return this.maxy;
//	}
	public void setXY(int x, int y) { // 위에주석 통합한거
		this.maxx = x;
		this.maxy = y;
	}
	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}
	
	public int priceUp(int priceUp) {
		this.price += priceUp;
		return this.price;
	}
	
	public void printInfo() {
		System.out.printf("제조사:%s %d인치 가격:%d 색상:%s 해상도:%d * %d\n",company,inch,price,color,maxx,maxy);
	}
	
	
	
}
