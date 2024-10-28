package cls.cls02;

public class Car {

	//필드영역
	String model;  //null
	String color;  //null
	int price;     //0
	
	//생성자  -- 객체 생성 후 초기에 해야할 일  / 필드의 초기화 (필드변수에 저장할 값 세팅)
	Car(){  // 기본생성자 ( 맨위쪽 클래스이름(){} ) -- 생략가능
	System.out.println("Car 생성자 호출됨");
	color = "노랑";
	}
	
	Car(String m){
		System.out.println("매개변수 생성자 호출");
		model = m;
	}
	// 매개변수는 타입만 인식 함 . 순서는 인식 안함.
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	
////
}

