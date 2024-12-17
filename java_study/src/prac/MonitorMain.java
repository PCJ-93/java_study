package prac;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor sam = new Monitor("삼성", 27, 150000);
		sam.setColor("검은색");
		Monitor lg = new Monitor("LG", 32, 330000);
		
		sam.setXY(1080,780);
		lg.setXY(4096,2048);
		lg.setColor("흰색");
		
		sam.printInfo();
		lg.printInfo();
		
		sam.priceUp(5000);
		lg.priceUp(70000);
		
		sam.printInfo();
		lg.printInfo();
		
	}


}
