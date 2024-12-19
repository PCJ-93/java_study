package cls.prac.prac02;

public class Trash {
	
	int cnt; //갯수
	int liter;  //용량 
	String color;  //색상
	int percent;  // 얼마나찼는지
	int price;  // 가격
	boolean isCoverOpened;
	
	public Trash () {
		cnt = 0;
		liter = 0;
		price = 0;
		color = "black";
		percent = 0;
	}
	
	public Trash(int cnt, int liter, int price) {
		this.cnt = cnt;
		this.liter = liter;
		this.price = price;
		color = "black";
		percent = 0;
	}
	
	public void openCan() {
		isCoverOpened = true;
		System.out.println("스레기통열었다");
	}
	public void closeCan() {
		isCoverOpened = false;
		System.out.println("스레기통닫았다");
	}
	
	public int upTrash(int percent) {
		System.out.println("쓰레기를"+percent+"개 버렸다");
		return this.percent += percent;
	}
	
	public void cleanTrash() {
		System.out.println("쓰레기통 비웠다.");
		percent = 0;
		System.out.println("현재 쓰레기통 남은용량: 100%");
	}
	
	public void insertTrashLiter(int liter) {  //쓰레기버린것을 리터로 따질때 찬 용량 퍼센트로 표시
		percent = percent + (liter/this.liter*100);
	}
	
	
	

}
