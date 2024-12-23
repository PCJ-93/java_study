package inherit.inherit06;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
		
		Taxi ta = takeTaxi();
		Bus bu = takeBus();
		
		Vehicle v1 = takeTaxi();
		Vehicle v2 = new Taxi();
		Vehicle v3 = takeBus();
		Vehicle v4 = new Bus();
		
		//Bus b3 = takeBus2();   //  버스타입의 b3 은 vehicle타입으로 리턴된 takeBus2()를 못받는다~  타입을 vehicle로 바꾸던가~
		
	}
	
	public static Taxi takeTaxi() {
		return new Taxi();
	}
	public static Bus takeBus() {
		return new Bus();
	}
	public static Vehicle takeBus2() { //vehicle에 bus를 담을수있지만.. 23줄로..
		return new Bus();
	}
}
