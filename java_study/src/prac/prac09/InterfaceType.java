package prac.prac09;

public class InterfaceType {

	public static void main(String[] args) {
		// 객체 생성
		Orderable[] orderArr = { new Food("족발", 19800), new Electronics("에어팟", 199000), new Clothing("셔츠", 49900) };
		// 총합 계산
		int total = 0;
		for (int i = 0; i < orderArr.length; i++) {
			if (orderArr[i] instanceof Food) {
				Food food = (Food) orderArr[i];
				total += food.getPrice();
				total -= food.discountedPrice();
			}
			if (orderArr[i] instanceof Electronics) {
				Electronics electronics = (Electronics) orderArr[i];
				total += electronics.getPrice();
				total -= electronics.discountedPrice();
			}
			if (orderArr[i] instanceof Clothing) {
				Clothing clothing = (Clothing) orderArr[i];
				total += clothing.getPrice();
				total -= clothing.discountedPrice();
			}
		}
		// 결과 출력
		System.out.println("총합: " + total + "원");
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	public int discountedPrice() {
		double dc = price * 0.1;
		price -= dc;
		return (int) dc;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	public int discountedPrice() {
		double dc = price * 0.2;
		price -= dc;
		return (int) dc;
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	public int discountedPrice() {
		double dc = price * 0.3;
		price -= dc;
		return (int) dc;
	}
}
