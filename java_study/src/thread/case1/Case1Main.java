package thread.case1;

public class Case1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Work work = new Work();  //참조변수형태로 만들어서 워커객체가 공유할수 있게해준다
		
		Worker w1 = new Worker("A", 30, work); //넘겨줌
		Worker w2 = new Worker("B", 30, work);
		
		w1.start();
		w2.start();
		
		

	}

}
