package cls.prac;

public class Rectangle {
	
	double wid;
	double hei;
	
	Rectangle(double wid, double hei){
		this.wid = wid;
		this.hei = hei;
	}
	
	double getArea() {
		double result = wid*hei;
		return result;
	}
	
	

}
