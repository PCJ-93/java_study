package cls.prac;

public class Moniter {
	
	int inch;
	String company;
	String model;
	
	Moniter (int inch, String company, String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	
	void printInfo() {
		System.out.println("제조사:"+company+" 모델명:"+model+" 인치:"+inch+"인치");
	}
	
	
	
	
	

}
