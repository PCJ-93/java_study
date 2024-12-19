package inherit.inherit01;

public class Child extends Parent {
	
	int grade;
	String schoolName;
	
	
	public Child(int grade, String schoolName, int money) {
		super(money);
		this.grade = grade;
		this.schoolName = schoolName;
		}
	
	public Child(int grade, String schoolName) {
		super(0);
		this.grade = grade;
		this.schoolName = schoolName;
		}
	
	public Child() {
		super(0);
		System.out.println("Child 클래스 생성자");
	}
	
	public void play() {
		System.out.println("뛰어놀기");
	}

}
