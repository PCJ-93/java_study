package db.sample.v1;

					// 디비정보를 담는 객체 를 DTO객체 라고 한다  
public class Dept {  // DTO (Data Transfer Object /데이터전달에사용되는객체) 객체  DeptDTO 라고 클래스명짓기도한다.
	
	int deptno;
	String dname;
	String loc;
	
	
	public Dept() {}
	
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
