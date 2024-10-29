package cls.prac;

public class Circle {
	
	
	double half;
	
	Circle(){}
	
	void setRadius(double half){
		this.half = half;
	}
	
	double getArea() {
		double result = half * half * 3.14;
		return result;
	}
	

}
