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
	
	Person(String name, String gender, int age, String job, double tall, double weight){
		this.name = name;
		this.gender = gender;
		this.age = age;         // 미리 알아놓을수 있는 정보만 미리 받고 검사 후 받는 정보는 초기화만 해둔다
		this.job = job;				//(검사 후 정보는 안써도 무방함 회사마다 쓰는데있고 안쓰는데 있다.)
		this.tall = tall;
		this.weight = weight;
		
		this.bloodType = null;
		this.healthState = 0;
		this.isSleeping = false;
	}
	
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
	
	double PersonInfo(){
		double num = weight/tall;
		System.out.printf("이름:%s 성별:%s 나이:%d ...결과:%f\n", name, gender, age, num);
		return num;
	}
	
	
	

}
