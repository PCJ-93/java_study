package inter.inter01;

public class TempMain {

	public static void main(String[] args) {

		// Temp t = new Temp(); // 인터페이스(Temp)는 생성 불가
		TempObject t1 = new TempObject();

		Temp t = new TempObject();
		Temp2 t2 = new TempObject();
		
		Temp[] tArr = new Temp[3];  // Temp 객체( new Temp() )가 생기는게 아닌 배열생기는거라 괜찮다.
		//tArr[0]= new Temp(); 에러
		tArr[0] = new TempObject(); // Temp를구현한 템프오브젝트 사용
		
		// 상속 : 부모클래스타입 = 자식객체
		// 인터페이스 : 인터페이스 타입 = 구현 객체( 해당 인터페이스를 구현한)

	}

}
