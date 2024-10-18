package cond;

public class cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if문
		
		int num = 9;
		int x =10;
		
		if (num > 10) {
			System.out.println("확인을 해보니까");
			System.out.println("10보다 크더라~");
			x = 20;
			int y = 30;
		} else {
			System.out.println("10보다는 안크던데?");
		}
		
		
		
		
		
		if (num == 15) {
			System.out.println("한번더 살펴보니");
			System.out.println("15랑 똑같더라");
		//	y = 50;  y는 위에서 선언한변수  위쪽 구간에서만 사용 가능. (지역변수) 사용하려면 다시 선언해야함
		}
		
		boolean b = num == 15;
		
		if ( b == true ) {
			System.out.println("한번더 살펴보니");
			System.out.println("15랑 똑같더라");
		}
		
		
		
		System.out.println("끝");
		
		

	}

}
