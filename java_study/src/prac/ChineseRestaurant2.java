package prac;

import java.util.ArrayList;

public class ChineseRestaurant2 {
	public static void main(String[] args) {
// 주문을 위한 메뉴 선정
		Menu2 jjajang = new Menu2("짜장", 8900);
		Menu2 jjambbong = new Menu2("짬뽕", 10900);
		Menu2 tangsook = new Menu2("탕수육", 23900);
// 메뉴를 조합하여 주문을 생성
		ArrayList<Menu2> list = new ArrayList<Menu2>();
		
		list.add(jjajang);
		list.add(jjambbong);
		list.add(tangsook);
		
		Order2 order = new Order2(123, list);
		
// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}
}

class Order2 {
// 필드(인스턴스 필드)
	int orderNum;
	ArrayList<Menu2> menus;
	

// 생성자
	public Order2(int i, ArrayList<Menu2> list) {
		orderNum = i;
		menus = list;
	}

// 메소드(인스턴스 메소드)
	public int totalPrice() {
		int total = 0;
		for(int i=0; i<menus.size(); i++) {
			total += menus.get(i).price;
		}
		
		return total;
	}
}

class Menu2 {
// 필드
	String name;
	int price;

// 생성자
	public Menu2(String str, int i) {
		name = str;
		price = i;
	}
}
