package cls.cls03;

class Calc {
	//필드
	
	
	//생성자
	
	
	//메소드
	//리턴    O/X
	//매개변수   O/X
	
	void powerOn() { //리턴X 매개변수X
		System.out.println("전원 On");
	} 
	
	void setOwner(String name) {  // 리턴X  매개변수O
		System.out.println(name + "님의 계산기입니다.");
	}
	
	double divide(int x, int y) { //리턴O 매개변수O
		//return 타입이 double
		//double result = (double)x/y;
		//return = result;
		return (double)x/y;
		
	}
	
	String madeByInfo() {  // 리턴O 매개변수X
		
		String msg = "카시오";
		
		//return "카시오";
		return msg;
	}
	
	
	

}
