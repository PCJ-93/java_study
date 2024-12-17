package cls.cls06;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부생성불가 생성자에 private 걸어놓음
//		Singleton s1 = new Singleton();
		
		Singleton st = Singleton.getInstance();
		Singleton.getInstance();
		
	}

}
