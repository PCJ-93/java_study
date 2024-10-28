package cls.prac;

public class Person {
	
	
	String name;
	String gender;
	int age;
	double tall;
	double weight;
	String job;
	String bloodType;
	int healthState;		//boolean isHealthy;
	//10 9 8 7 6 5..1 0
	//매우건강	건강 보통 피곤 .. 안좋다	사망
	boolean isSleeping;
	
	Person(){}
	
	Person(String name, String gender, int age, double tall, double weight, String job, String bloodType, int healthState, boolean isSleeping){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.healthState = healthState;
		this.isSleeping = isSleeping;
	}
	
	
	

}
