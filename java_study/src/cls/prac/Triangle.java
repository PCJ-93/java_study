package cls.prac;

public class Triangle {
	
	double wid;
	double hei;
	
	void setSize(double wid, double hei) {
		this.wid = wid;
		this.hei = hei;
	}
	
	double getArea() {
		double result = wid*hei/2;
		return result;
	}

}
