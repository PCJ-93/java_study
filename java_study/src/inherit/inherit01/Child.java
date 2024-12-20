package inherit.inherit01;

public class Child extends Parent { // extends 부모클래스이름
			// 자식클래스에서 재정의된 메소드가있으면 재정의된거를 부른다
			// 자식클래스에서 재정의됐지만 부모메소드가 필요할때 부모메소드는 super.메소드명 으로 호출한다
	int grade;
	String schoolName;

	public Child(int grade, String schoolName, int money) {
		super(money); // 부모상속받을때 기본생성자에 매개변수 필요하면 이거로 넘긴다.
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

	public void printInfo() {
		System.out.println(grade + " " + schoolName + " " + money);
		System.out.println(age);
	}

}
