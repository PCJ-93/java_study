package thread.case1;

public class Work {
	
	int workCount;
	
	public Work() {
		workCount = 0;
	}
	
	//public synchronized void addCount() {  // synchronized : 워크카운트올릴때는 동시작업x 한놈씩만 올린다
	public void addCount() {
		workCount++;
	}

}
