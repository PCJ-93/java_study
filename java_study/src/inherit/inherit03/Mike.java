package inherit.inherit03;

public class Mike { // extends Object 는 안써도 기본적으로 상속받는다

	String type;
	String model;
	int price;

	public void check() {
		
	}

	public void volumeUp() {  // 로직이 추가 되어도 상속받는애들한테 자동적용(로직추가될때마다 자식들마다 안고쳐줘도 된다)
		//추가로직
		//추가로직2
		//추가로직3
		System.out.println("Mike 볼륨 업");
	}

}
