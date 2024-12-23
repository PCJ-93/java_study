package inherit.inherit06;

public class Driver {
	
//	public void drive(Bus bus) {
//		bus.run();
//	}
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
	
	public void drive(Vehicle vehicle) {  // 버스랑 택시 탈것 하나로 합치기  Vehicle vehicle = new Taxi(); 가능.. Vehicle vehicle = new Bus(); 가능
		vehicle.run();
	}

}
