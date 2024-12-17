package prac;

public class SalaryMan {
	
	int salary;
	
	public SalaryMan() {
		salary = 1000000;
	}
	
	public SalaryMan(int salary) {
        this.salary = salary;
    }
	
	public int getAnnualGross(){
		return (salary*12) + (salary*5);
	}

}
