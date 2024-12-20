package prac;

public class QQMain { // Food & FoodTruck 의 메인

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodTruck ft = new FoodTruck();
		
		System.out.println("메뉴보기");
		ft.addMenu("김밥", 3000);
		ft.addMenu("짜장면", 6000);
		ft.addMenu("핫도그", 2000);
		ft.showMenu();
	
	}
}
