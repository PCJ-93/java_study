package cls.prac.prac01;

//public class Student {
//
//	
//	String dept;
//	int stuNum;
//	
//	public Student() {}
//	public void main(String dept, int stuNum) {
//		this.dept = dept;
//		this.stuNum = stuNum;
//		System.out.println("학과:" + this.dept + " 학번:" + this.stuNum);
//	}
//
//}

public class Student {

	private String dept;
	private int stuNum;

	public Student() {}
	
	public void main(String dept, int stuNum) {
		setDept(dept);
		setStuNum(stuNum);
		System.out.println("학과:" + getDept() + " 학번:" + getStuNum());
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

}