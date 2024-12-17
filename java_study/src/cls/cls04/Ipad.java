package cls.cls04;

public class Ipad {
	
	static String madeBy = "Apple";  //아이패드마다 제조사는 같아서 static
	String owner;					//주인은 다를수 있으니까 static X
	
	public void powerOn() {
		System.out.println("전원 켜기");
	}
	
	static void check() {
		System.out.println("아이패드입니다.");
	}
	
}
