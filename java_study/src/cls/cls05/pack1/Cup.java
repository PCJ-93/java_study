package cls.cls05.pack1;

public class Cup {
	// pack1꺼							아무데나      상속+default      같은패키지안에만         지혼자
	private String type;  //접근제한자 : 아무데나 public protected default('비워두면자동적용') private 지혼자
	
	private Cup() {
		
	}
	public Cup(String type) {
		this.type = type;
	}
	
	public void method() {
		System.out.println("pack1.Cup method() 111");
	}

}
