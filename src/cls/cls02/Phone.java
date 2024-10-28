package cls.cls02;

public class Phone {
	
	//필드
	String model;  // 기본값X, 무조건 필요O
	int price;   // 기본값: 100
	int battery; // 기본값: 3000
	
	//기본생성자 - 생략가능 (매개변수 생성자 만들면 기본생성자 자동으로 안만들어줘서 인식안됨)
	//Phone(){}  // 매개변수생성자 생성후 기본생성자 필요하면 직접 작성 해 줘야함.
	
	//매개변수생성자  -- 타입 , 갯수 , 순서 다르게 해야 각각 인식 가능함. (생성자 오버로딩)
	Phone(String model){
		this(model, 100, 3000);
//		this.model = model;
//		this.price = 100;
//		this.battery = 3000;
	}
	
	Phone(String model, int price){
		this(model, price, 3000);  // 불러오려면 밑의 변수 수만큼 ()안에 입력 해 줘야함. 3000:기본값 이라도 써줘야 인식됨
//		this.model = model;
//		this.price = price;
//		this.battery = 3000;
	}
	
	Phone(String model, int price, int battery){      //제일 넓은 범위의 매개변수생성자에 위의 매개변수가 연결됨 this(-,-,-); 사용
		this.model = model;
		this.price = price;
		this.battery = battery;
		
  //ex) //재부팅
		//사용자등록  //초기에 할일들을 위쪽에서 중복해서 안써도 이쪽에 작성된 코드 가져가서 사용가능
		//필름부착     this() 로 부르면 거기에맞는 코드 식도 불러져서 자동계산
		//알콜소독
	}
	
	
	

}
