package cls.prac;

public class TV {

	String company;
	int makeDate;
	int inch;
	
	TV(){}
	
	TV(String company, int makeDate, int inch){
		this.company = company;
		this.makeDate = makeDate;
		this.inch = inch;
	}
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n",company, makeDate, inch);
	}
	
}
