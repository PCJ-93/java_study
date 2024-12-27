package prac.prac11;

public class Food extends FoodTruck {
	
	String name;
	int price;
	int cnt;
	
	static Kimbab k1 = new Kimbab("김밥",2000,20);
	static Dongas d1 = new Dongas("돈가스",5000,20);
	static Woodong w1 = new Woodong("우동",3000,20);
	static Ramen r1 = new Ramen("라면",2000,20);
	
	public void food() {}
	
	public static void menu() {
		System.out.printf("1. %s : %d원  |재고: %d개\n", Food.k1.name, Food.k1.price, Food.k1.cnt);
		System.out.printf("2. %s : %d원  |재고: %d개\n", Food.d1.name, Food.d1.price, Food.d1.cnt);
		System.out.printf("3. %s : %d원  |재고: %d개\n", Food.w1.name, Food.w1.price, Food.w1.cnt);
		System.out.printf("4. %s : %d원  |재고: %d개\n", Food.r1.name, Food.r1.price, Food.r1.cnt);
	}
	
	
}
