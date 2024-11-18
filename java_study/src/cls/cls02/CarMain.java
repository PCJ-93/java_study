package cls.cls02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println(car1.color);
		
		car2.color = "파랑";
		System.out.println(car2.color);
		
		System.out.println(car3.color);
		car3.price = 123;
		System.out.println(car3.price);
		System.out.println(car2.price);
		
		System.out.println("main 끝");
		
		Car car4 = new Car("모닝");
		System.out.println(car4.model);
		System.out.println(car4.color);
		
		System.out.println("=====");
		
		// 매개변수는 타입만 인식 함 . 순서는 인식 안함. 사용할 때 클래스파일에있는 순서에 맞게 작성
		Car car5 = new Car("캐스퍼", "회색");
		System.out.println(car5.model);
		System.out.println(car5.color);
		
		
		
////		
	}
}
