package inherit.inherit03;

import java.util.ArrayList;
import java.util.List;

public class MikeMain { // 오버로드 생성자 매개변수다르게 만드는거 , 오버라이딩 부모메소드 재정의하는거

	public static void main(String[] args) {

		BluetoothMike m1 = new BluetoothMike();
		WirelessMike m2 = new WirelessMike();
		
		m1.volumeUp();
		m1.volumeUp();
		m1.volumeUp("꺼라");
		
		m2.volumeUp();
		
		Mike m5 = new Mike();
		m5.volumeUp();
		
	
		System.out.println(m1.toString());
	
		System.out.println(m2.toString());
		
		WirelessMike m4 = m2;
		Mike m6 = m5;
		// 부모 변수에 자식 객체 담기 가능!  자식-부모 는 안댐
		Mike m7 = new BluetoothMike();
		Mike m8 = new WirelessMike();
		
		//부모객체배열       자신				자식					자식
		Mike[] arr = {new Mike(), new BluetoothMike(), new WirelessMike()};
		
		//부모객체어리
		List<Mike> list = new ArrayList<Mike>();  // List 가 ArrayList 의 부모라서 앞에거 가능
		list.add(new Mike());  //자신
		list.add(new BluetoothMike()); //자식
		list.add(new WirelessMike()); //자식
		
	}

}
