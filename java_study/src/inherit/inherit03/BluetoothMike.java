package inherit.inherit03;

public class BluetoothMike extends Mike{
	
	boolean isConnect;
	
	// 부모클래스 생성자 super();
	
	public void connect() {
	}
	
	public int volumeUp(String s) {
		System.out.println("String 매개변수 있는 볼륨 업");
		return 0;
	}
	
	public void volumeUp() {
		//volumeUp(); // 재귀함수 지가 지를 호출  .. 이경우에는 제대로된재귀함수가 아니다 에러뜸..
		//super.volumeUp();
		System.out.println("BluetoothMike 볼륨 업 재정의");
	}
	
	public String toString() {
		String s = "나는 블루투스마이크 입니다.";
		return s;
	}
	

}
